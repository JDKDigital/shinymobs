package cy.jdkdigital.shiny.event;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.ShinyModConfig;
import cy.jdkdigital.shiny.common.entity.ShinyVillager;
import cy.jdkdigital.shiny.init.ModEntities;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtOps;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.TickTask;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.LogicalSide;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.util.LogicalSidedProvider;
import net.neoforged.neoforge.event.EventHooks;
import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.neoforge.event.entity.living.LivingConversionEvent;

import java.util.List;

@EventBusSubscriber(modid = ShinyMod.MODID)
public class EventHandler
{
    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void onEntitySpawn(EntityJoinLevelEvent event) {
        if (!event.loadedFromDisk() && event.getLevel() instanceof ServerLevel serverLevel && event.getEntity() instanceof Mob entity && isValidSpawnType(entity.getSpawnType()) && entity.getEncodeId() != null && !entity.getEncodeId().contains("shiny:")) {
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
