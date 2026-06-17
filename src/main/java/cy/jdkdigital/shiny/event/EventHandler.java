package cy.jdkdigital.shiny.event;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.ShinyModConfig;
import cy.jdkdigital.shiny.common.entity.ShinyVillager;
import cy.jdkdigital.shiny.init.ModEntities;
import cy.jdkdigital.shiny.init.ShinyAttachments;
import cy.jdkdigital.shiny.network.ShinyDragonPayload;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.nbt.NbtOps;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.TickTask;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.LogicalSide;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.util.LogicalSidedProvider;
import net.neoforged.neoforge.event.EventHooks;
import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.neoforge.event.entity.living.BabyEntitySpawnEvent;
import net.neoforged.neoforge.event.entity.living.LivingConversionEvent;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.network.PacketDistributor;

import java.util.List;

@EventBusSubscriber(modid = ShinyMod.MODID)
public class EventHandler
{
    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void onEntitySpawn(EntityJoinLevelEvent event) {
        if (event.loadedFromDisk() || !(event.getLevel() instanceof ServerLevel serverLevel) || !(event.getEntity() instanceof LivingEntity entity)) {
            return;
        }
        // Mobs only convert on a valid spawn type; non-mob living entities (e.g. armor stands) are always eligible
        if (entity instanceof Mob mob && !isValidSpawnType(mob.getSpawnType())) {
            return;
        }
        if (entity.getEncodeId() == null || entity.getEncodeId().contains("shiny:")) {
            return;
        }
        String shinyEntityId = entity.getEncodeId().replace("minecraft:", "shiny:shiny_");
        if (shinyEntityId.contains("shiny:")) {
            var chanceData = entity.getType().builtInRegistryHolder().getData(ShinyMod.SPAWN_CHANCE_MAP);
            float chance = chanceData != null ? chanceData.spawnChance() : ShinyModConfig.GENERAL.shinySpawnChance.get().floatValue();
            if (BuiltInRegistries.ENTITY_TYPE.containsKey(ResourceLocation.parse(shinyEntityId)) && chance > serverLevel.getRandom().nextFloat()) {
                EntityType<? extends Entity> shiny = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.parse(shinyEntityId));
                if (EventHooks.canLivingConvert(entity, (EntityType<? extends LivingEntity>) shiny, (timer) -> {})) {
                    var executor = LogicalSidedProvider.WORKQUEUE.get(event.getLevel().isClientSide ? LogicalSide.CLIENT : LogicalSide.SERVER);
                    executor.tell(new TickTask(0, () -> {
                        LivingEntity newEntity = (LivingEntity) shiny.create(serverLevel, null, entity.blockPosition(), MobSpawnType.CONVERSION, false, false);
                        if (newEntity != null) {
                            EventHooks.onLivingConvert(entity, newEntity);
                            newEntity.load(entity.saveWithoutId(new CompoundTag()));
                            entity.discard();
                            event.setCanceled(true);
                            event.getLevel().addFreshEntity(newEntity);
                        }
                    }));
                }
            }
        }
    }
    @SubscribeEvent
    public static void onDragonSpawn(EntityJoinLevelEvent event) {
        if (event.loadedFromDisk() || !(event.getLevel() instanceof ServerLevel serverLevel) || !(event.getEntity() instanceof EnderDragon dragon)) {
            return;
        }
        var chanceData = dragon.getType().builtInRegistryHolder().getData(ShinyMod.SPAWN_CHANCE_MAP);
        float chance = chanceData != null ? chanceData.spawnChance() : ShinyModConfig.GENERAL.shinySpawnChance.get().floatValue();
        if (chance > serverLevel.getRandom().nextFloat()) {
            dragon.setData(ShinyAttachments.SHINY.get(), true);
            dragon.setCustomName(Component.translatable("entity.shiny.shiny_ender_dragon"));
        }
    }

    @SubscribeEvent
    public static void onStartTracking(PlayerEvent.StartTracking event) {
        if (event.getTarget() instanceof EnderDragon dragon && event.getEntity() instanceof ServerPlayer player && dragon.getData(ShinyAttachments.SHINY.get())) {
            PacketDistributor.sendToPlayer(player, new ShinyDragonPayload(dragon.getId(), true));
        }
    }

    // Shiny parents pass it on: two shiny parents always breed a shiny baby, one shiny parent has a 50% chance.
    // The vanilla offspring is swapped for its shiny variant.
    @SubscribeEvent
    public static void onBabySpawn(BabyEntitySpawnEvent event) {
        if (event.getChild() == null || event.getParentA() == null || !(event.getParentA().level() instanceof ServerLevel serverLevel)) {
            return;
        }
        AgeableMob child = event.getChild();
        int shinyParents = (isShiny(event.getParentA()) ? 1 : 0) + (isShiny(event.getParentB()) ? 1 : 0);
        if (isShiny(child) || shinyParents == 0) {
            return;
        }
        if (shinyParents == 1 && serverLevel.getRandom().nextFloat() >= 0.5F) {
            return;
        }
        String shinyId = child.getEncodeId() == null ? null : child.getEncodeId().replace("minecraft:", "shiny:shiny_");
        if (shinyId == null || !shinyId.contains("shiny:") || !BuiltInRegistries.ENTITY_TYPE.containsKey(ResourceLocation.parse(shinyId))) {
            return;
        }
        if (BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.parse(shinyId)).create(serverLevel) instanceof AgeableMob shinyChild) {
            shinyChild.load(child.saveWithoutId(new CompoundTag()));
            event.setChild(shinyChild);
        }
    }

    private static boolean isShiny(Entity entity) {
        return entity != null && entity.getEncodeId() != null && entity.getEncodeId().startsWith("shiny:");
    }

    private static boolean isValidSpawnType(MobSpawnType type) {
        return type == null || (
                type.equals(MobSpawnType.NATURAL) ||
                type.equals(MobSpawnType.CHUNK_GENERATION) ||
                type.equals(MobSpawnType.SPAWN_EGG) ||
                type.equals(MobSpawnType.BREEDING) ||
                type.equals(MobSpawnType.STRUCTURE)
            );
    }

    @SubscribeEvent
    public static void onEntityConvert(LivingConversionEvent.Post event) {
        if (event.getEntity() instanceof ShinyVillager villager && event.getEntity().level() instanceof ServerLevel level) {
            var executor = LogicalSidedProvider.WORKQUEUE.get(level.isClientSide ? LogicalSide.CLIENT : LogicalSide.SERVER);
            executor.tell(new TickTask(0, () -> {
                event.getOutcome().discard();

                ZombieVillager zombievillager = villager.convertTo(ModEntities.ZOMBIE_VILLAGER.get(), false);
                zombievillager.finalizeSpawn(level, level.getCurrentDifficultyAt(zombievillager.blockPosition()), MobSpawnType.CONVERSION, new Zombie.ZombieGroupData(false, true));
                zombievillager.setVillagerData(villager.getVillagerData());
                zombievillager.setGossips(villager.getGossips().store(NbtOps.INSTANCE));
                zombievillager.setTradeOffers(villager.getOffers().copy());
                zombievillager.setVillagerXp(villager.getVillagerXp());
            }));
        }
    }
}
