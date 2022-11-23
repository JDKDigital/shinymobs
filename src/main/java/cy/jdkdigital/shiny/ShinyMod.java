package cy.jdkdigital.shiny;

import cy.jdkdigital.shiny.init.ModEntities;
import cy.jdkdigital.shiny.init.ModItemGroups;
import cy.jdkdigital.shiny.init.ModItems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.TickTask;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ambient.Bat;
import net.minecraft.world.entity.animal.*;
import net.minecraft.world.entity.animal.axolotl.Axolotl;
import net.minecraft.world.entity.animal.goat.Goat;
import net.minecraft.world.entity.animal.horse.*;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.monster.*;
import net.minecraft.world.entity.monster.hoglin.Hoglin;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import net.minecraft.world.entity.npc.Villager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.LogicalSidedProvider;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ShinyMod.MODID)
public class ShinyMod
{
    public static final String MODID = "shiny";
    public static final Logger LOGGER = LogManager.getLogger();

    public ShinyMod() {
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModEntities.ENTITIES.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);

        ModItemGroups.init();

        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, ShinyModConfig.SERVER_CONFIG);
    }

    @SubscribeEvent
    public void onEntitySpawn(EntityJoinWorldEvent event) {
        if (!event.loadedFromDisk() && event.getWorld() instanceof ServerLevel serverLevel && event.getEntity() instanceof LivingEntity entity && entity.getEncodeId() != null && !entity.getEncodeId().contains("shiny:")) {
            String shinyEntityId = entity.getEncodeId().replace("minecraft:", "shiny:shiny_");
            if (ForgeRegistries.ENTITIES.containsKey(new ResourceLocation(shinyEntityId)) && ShinyModConfig.GENERAL.shinySpawnChance.get() > serverLevel.getRandom().nextDouble()) {
                EntityType<? extends Entity> shiny = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(shinyEntityId));
                if (shiny != null) {
                    var executor = LogicalSidedProvider.WORKQUEUE.get(event.getWorld().isClientSide ? LogicalSide.CLIENT : LogicalSide.SERVER);
                    executor.tell(new TickTask(0, () -> {
                        Entity newEntity = shiny.create(serverLevel, new CompoundTag(), (entity.hasCustomName() ? entity.getCustomName() : null), null, entity.blockPosition(), MobSpawnType.CONVERSION, false, false);
                        if (newEntity != null) {
                            entity.discard();
                            event.setCanceled(true);
                            event.getWorld().addFreshEntity(newEntity);
                        }
                    }));
                }
            }
        }
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents
    {
        @SubscribeEvent
        public static void onEntityAttributeCreate(EntityAttributeCreationEvent event) {
            event.put(ModEntities.ARMOR_STAND.get(), ArmorStand.createLivingAttributes().build());
            event.put(ModEntities.AXOLOTL.get(), Axolotl.createAttributes().build());
            event.put(ModEntities.BAT.get(), Bat.createAttributes().build());
            event.put(ModEntities.BEE.get(), Bee.createAttributes().build());
            event.put(ModEntities.BLAZE.get(), Blaze.createAttributes().build());
            event.put(ModEntities.CAT.get(), Cat.createAttributes().build());
            event.put(ModEntities.CAVE_SPIDER.get(), CaveSpider.createAttributes().build());
            event.put(ModEntities.CHICKEN.get(), Chicken.createAttributes().build());
            event.put(ModEntities.COD.get(), Cod.createAttributes().build());
            event.put(ModEntities.COW.get(), Cow.createAttributes().build());
            event.put(ModEntities.CREEPER.get(), Creeper.createAttributes().build());
            event.put(ModEntities.DOLPHIN.get(), Dolphin.createAttributes().build());
            event.put(ModEntities.DONKEY.get(), AbstractChestedHorse.createBaseChestedHorseAttributes().build());
            event.put(ModEntities.DROWNED.get(), Drowned.createAttributes().build());
            event.put(ModEntities.ELDER_GUARDIAN.get(), ElderGuardian.createAttributes().build());
            event.put(ModEntities.ENDERMAN.get(), EnderMan.createAttributes().build());
            event.put(ModEntities.ENDERMITE.get(), Endermite.createAttributes().build());
            event.put(ModEntities.EVOKER.get(), Evoker.createAttributes().build());
            event.put(ModEntities.FOX.get(), Fox.createAttributes().build());
            event.put(ModEntities.GHAST.get(), Ghast.createAttributes().build());
            event.put(ModEntities.GLOW_SQUID.get(), GlowSquid.createAttributes().build());
            event.put(ModEntities.GOAT.get(), Goat.createAttributes().build());
            event.put(ModEntities.GUARDIAN.get(), Guardian.createAttributes().build());
            event.put(ModEntities.HOGLIN.get(), Hoglin.createAttributes().build());
            event.put(ModEntities.HORSE.get(), AbstractHorse.createBaseHorseAttributes().build());
            event.put(ModEntities.HUSK.get(), Husk.createAttributes().build());
            event.put(ModEntities.ILLUSIONER.get(), Illusioner.createAttributes().build());
            event.put(ModEntities.IRON_GOLEM.get(), IronGolem.createAttributes().build());
            event.put(ModEntities.LLAMA.get(), Llama.createAttributes().build());
            event.put(ModEntities.MAGMA_CUBE.get(), MagmaCube.createAttributes().build());
            event.put(ModEntities.MULE.get(), AbstractChestedHorse.createBaseChestedHorseAttributes().build());
            event.put(ModEntities.MOOSHROOM.get(), MushroomCow.createAttributes().build());
            event.put(ModEntities.OCELOT.get(), Ocelot.createAttributes().build());
            event.put(ModEntities.PANDA.get(), Panda.createAttributes().build());
            event.put(ModEntities.PARROT.get(), Parrot.createAttributes().build());
            event.put(ModEntities.PHANTOM.get(), Monster.createMonsterAttributes().build());
            event.put(ModEntities.PIG.get(), Pig.createAttributes().build());
            event.put(ModEntities.PIGLIN.get(), Piglin.createAttributes().build());
            event.put(ModEntities.PIGLIN_BRUTE.get(), PiglinBrute.createAttributes().build());
            event.put(ModEntities.PILLAGER.get(), Pillager.createAttributes().build());
            event.put(ModEntities.POLAR_BEAR.get(), PolarBear.createAttributes().build());
            event.put(ModEntities.PUFFERFISH.get(), Pufferfish.createAttributes().build());
            event.put(ModEntities.RABBIT.get(), Rabbit.createAttributes().build());
            event.put(ModEntities.RAVAGER.get(), Ravager.createAttributes().build());
            event.put(ModEntities.SALMON.get(), Salmon.createAttributes().build());
            event.put(ModEntities.SHEEP.get(), Sheep.createAttributes().build());
            event.put(ModEntities.SHULKER.get(), Shulker.createAttributes().build());
            event.put(ModEntities.SILVERFISH.get(), Silverfish.createAttributes().build());
            event.put(ModEntities.SKELETON.get(), Skeleton.createAttributes().build());
            event.put(ModEntities.SKELETON_HORSE.get(), SkeletonHorse.createAttributes().build());
            event.put(ModEntities.SLIME.get(), Monster.createMonsterAttributes().build());
            event.put(ModEntities.SNOW_GOLEM.get(), SnowGolem.createAttributes().build());
            event.put(ModEntities.SPIDER.get(), Spider.createAttributes().build());
            event.put(ModEntities.SQUID.get(), Squid.createAttributes().build());
            event.put(ModEntities.STRAY.get(), Stray.createAttributes().build());
            event.put(ModEntities.STRIDER.get(), Strider.createAttributes().build());
            event.put(ModEntities.TRADER_LLAMA.get(), TraderLlama.createAttributes().build());
            event.put(ModEntities.TROPICAL_FISH.get(), TropicalFish.createAttributes().build());
            event.put(ModEntities.TURTLE.get(), Turtle.createAttributes().build());
            event.put(ModEntities.VEX.get(), Vex.createAttributes().build());
            event.put(ModEntities.VILLAGER.get(), Villager.createAttributes().build());
            event.put(ModEntities.VINDICATOR.get(), Vindicator.createAttributes().build());
            event.put(ModEntities.WANDERING_TRADER.get(), Mob.createMobAttributes().build());
            event.put(ModEntities.WITCH.get(), Witch.createAttributes().build());
            event.put(ModEntities.WITHER.get(), WitherBoss.createAttributes().build());
            event.put(ModEntities.WITHER_SKELETON.get(), WitherSkeleton.createAttributes().build());
            event.put(ModEntities.WOLF.get(), Wolf.createAttributes().build());
            event.put(ModEntities.ZOGLIN.get(), Zoglin.createAttributes().build());
            event.put(ModEntities.ZOMBIE.get(), Zombie.createAttributes().build());
            event.put(ModEntities.ZOMBIE_HORSE.get(), ZombieHorse.createAttributes().build());
            event.put(ModEntities.ZOMBIE_VILLAGER.get(), ZombieVillager.createAttributes().build());
            event.put(ModEntities.ZOMBIFIED_PIGLIN.get(), ZombifiedPiglin.createAttributes().build());
        }
    }
}
