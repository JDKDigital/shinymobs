package cy.jdkdigital.shiny.event;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.ShinyModConfig;
import cy.jdkdigital.shiny.common.entity.ShinyVillager;
import cy.jdkdigital.shiny.init.ModEntities;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.NbtOps;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.TickTask;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.LogicalSide;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.util.LogicalSidedProvider;
import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.neoforge.event.entity.living.LivingConversionEvent;

@EventBusSubscriber(modid = ShinyMod.MODID)
public class EventHandler
{
    @SubscribeEvent
    public static void onEntitySpawn(EntityJoinLevelEvent event) {
        if (!event.loadedFromDisk() && event.getLevel() instanceof ServerLevel serverLevel && event.getEntity() instanceof LivingEntity entity && entity.getEncodeId() != null && !entity.getEncodeId().contains("shiny:")) {
            String shinyEntityId = entity.getEncodeId().replace("minecraft:", "shiny:shiny_");
            if (BuiltInRegistries.ENTITY_TYPE.containsKey(ResourceLocation.parse(shinyEntityId)) && ShinyModConfig.GENERAL.shinySpawnChance.get() > serverLevel.getRandom().nextDouble()) {
                EntityType<? extends Entity> shiny = BuiltInRegistries.ENTITY_TYPE.get(ResourceLocation.parse(shinyEntityId));
                var executor = LogicalSidedProvider.WORKQUEUE.get(event.getLevel().isClientSide ? LogicalSide.CLIENT : LogicalSide.SERVER);
                executor.tell(new TickTask(0, () -> {
                    Entity newEntity = shiny.create(serverLevel, null, entity.blockPosition(), MobSpawnType.CONVERSION, false, false);
                    if (newEntity != null) {
                        entity.discard();
                        event.setCanceled(true);
                        event.getLevel().addFreshEntity(newEntity);
                    }
                }));
            }
        }
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
