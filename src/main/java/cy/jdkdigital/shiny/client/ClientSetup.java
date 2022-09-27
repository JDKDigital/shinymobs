package cy.jdkdigital.shiny.client;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.*;
import cy.jdkdigital.shiny.init.ModEntities;
import net.minecraft.client.model.SquidModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ShinyMod.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientSetup
{
    @SubscribeEvent
    public static void registerEntityRendering(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.ARMOR_STAND.get(), ShinyArmorStandRenderer::new);
        event.registerEntityRenderer(ModEntities.AXOLOTL.get(), ShinyAxolotlRenderer::new);
        event.registerEntityRenderer(ModEntities.BAT.get(), ShinyBatRenderer::new);
        event.registerEntityRenderer(ModEntities.BEE.get(), ShinyBeeRenderer::new);
        event.registerEntityRenderer(ModEntities.BLAZE.get(), ShinyBlazeRenderer::new);
        event.registerEntityRenderer(ModEntities.CAT.get(), ShinyCatRenderer::new);
        event.registerEntityRenderer(ModEntities.CAVE_SPIDER.get(), ShinyCaveSpiderRenderer::new);
        event.registerEntityRenderer(ModEntities.CHICKEN.get(), ShinyChickenRenderer::new);
        event.registerEntityRenderer(ModEntities.COD.get(), ShinyCodRenderer::new);
        event.registerEntityRenderer(ModEntities.COW.get(), ShinyCowRenderer::new);
        event.registerEntityRenderer(ModEntities.CREEPER.get(), ShinyCreeperRenderer::new);
        event.registerEntityRenderer(ModEntities.DOLPHIN.get(), ShinyDolphinRenderer::new);
        event.registerEntityRenderer(ModEntities.DONKEY.get(), (context) -> new ShinyChestedHorseRenderer<>(context, 0.87F, ModelLayers.DONKEY));
        event.registerEntityRenderer(ModEntities.DROWNED.get(), ShinyDrownedRenderer::new);
        event.registerEntityRenderer(ModEntities.ELDER_GUARDIAN.get(), ShinyElderGuardianRenderer::new);
        event.registerEntityRenderer(ModEntities.ENDERMAN.get(), ShinyEndermanRenderer::new);
        event.registerEntityRenderer(ModEntities.ENDERMITE.get(), ShinyEndermiteRenderer::new);
        event.registerEntityRenderer(ModEntities.EVOKER.get(), ShinyEvokerRenderer::new);
        event.registerEntityRenderer(ModEntities.FOX.get(), ShinyFoxRenderer::new);
        event.registerEntityRenderer(ModEntities.GHAST.get(), ShinyGhastRenderer::new);
        event.registerEntityRenderer(ModEntities.GLOW_SQUID.get(), (context) -> new ShinyGlowSquidRenderer(context, new SquidModel<>(context.bakeLayer(ModelLayers.GLOW_SQUID))));
        event.registerEntityRenderer(ModEntities.GOAT.get(), ShinyGoatRenderer::new);
        event.registerEntityRenderer(ModEntities.GUARDIAN.get(), ShinyGuardianRenderer::new);
        event.registerEntityRenderer(ModEntities.HOGLIN.get(), ShinyHoglinRenderer::new);
        event.registerEntityRenderer(ModEntities.HORSE.get(), ShinyHorseRenderer::new);
        event.registerEntityRenderer(ModEntities.HUSK.get(), ShinyHuskRenderer::new);
        event.registerEntityRenderer(ModEntities.ILLUSIONER.get(), ShinyIllusionerRenderer::new);
        event.registerEntityRenderer(ModEntities.IRON_GOLEM.get(), ShinyIronGolemRenderer::new);
        event.registerEntityRenderer(ModEntities.LLAMA.get(), (context) -> new ShinyLlamaRenderer(context, ModelLayers.LLAMA));
        event.registerEntityRenderer(ModEntities.MAGMA_CUBE.get(), ShinyMagmaCubeRenderer::new);
        event.registerEntityRenderer(ModEntities.MULE.get(), (context) -> new ShinyChestedHorseRenderer<>(context, 0.92F, ModelLayers.MULE));
        event.registerEntityRenderer(ModEntities.MOOSHROOM.get(), ShinyMushroomCowRenderer::new);
        event.registerEntityRenderer(ModEntities.OCELOT.get(), ShinyOcelotRenderer::new);
        event.registerEntityRenderer(ModEntities.PANDA.get(), ShinyPandaRenderer::new);
        event.registerEntityRenderer(ModEntities.PARROT.get(), ShinyParrotRenderer::new);
        event.registerEntityRenderer(ModEntities.PHANTOM.get(), ShinyPhantomRenderer::new);
        event.registerEntityRenderer(ModEntities.PIG.get(), ShinyPigRenderer::new);
        event.registerEntityRenderer(ModEntities.PIGLIN.get(), (context) -> new ShinyPiglinRenderer(context, ModelLayers.PIGLIN, ModelLayers.PIGLIN_INNER_ARMOR, ModelLayers.PIGLIN_OUTER_ARMOR, false));
        event.registerEntityRenderer(ModEntities.PIGLIN_BRUTE.get(), (context) -> new ShinyPiglinRenderer(context, ModelLayers.PIGLIN_BRUTE, ModelLayers.PIGLIN_BRUTE_INNER_ARMOR, ModelLayers.PIGLIN_BRUTE_OUTER_ARMOR, false));
        event.registerEntityRenderer(ModEntities.PILLAGER.get(), ShinyPillagerRenderer::new);
        event.registerEntityRenderer(ModEntities.POLAR_BEAR.get(), ShinyPolarBearRenderer::new);
        event.registerEntityRenderer(ModEntities.PUFFERFISH.get(), ShinyPufferfishRenderer::new);
        event.registerEntityRenderer(ModEntities.RABBIT.get(), ShinyRabbitRenderer::new);
        event.registerEntityRenderer(ModEntities.RAVAGER.get(), ShinyRavagerRenderer::new);
        event.registerEntityRenderer(ModEntities.SALMON.get(), ShinySalmonRenderer::new);
        event.registerEntityRenderer(ModEntities.SHEEP.get(), ShinySheepRenderer::new);
        event.registerEntityRenderer(ModEntities.SHULKER.get(), ShinyShulkerRenderer::new);
        event.registerEntityRenderer(ModEntities.SILVERFISH.get(), ShinySilverfishRenderer::new);
        event.registerEntityRenderer(ModEntities.SKELETON.get(), ShinySkeletonRenderer::new);
        event.registerEntityRenderer(ModEntities.SKELETON_HORSE.get(), (context) -> new ShinyUndeadHorseRenderer(context, ModelLayers.SKELETON_HORSE));
        event.registerEntityRenderer(ModEntities.SLIME.get(), ShinySlimeRenderer::new);
        event.registerEntityRenderer(ModEntities.SNOW_GOLEM.get(), ShinySnowGolemRenderer::new);
        event.registerEntityRenderer(ModEntities.SPIDER.get(), ShinySpiderRenderer::new);
        event.registerEntityRenderer(ModEntities.SQUID.get(), (context) -> new ShinySquidRenderer(context, new SquidModel<>(context.bakeLayer(ModelLayers.SQUID))));
        event.registerEntityRenderer(ModEntities.STRAY.get(), ShinyStrayRenderer::new);
        event.registerEntityRenderer(ModEntities.STRIDER.get(), ShinyStriderRenderer::new);
        event.registerEntityRenderer(ModEntities.TRADER_LLAMA.get(), (context) -> new ShinyLlamaRenderer(context, ModelLayers.TRADER_LLAMA));
        event.registerEntityRenderer(ModEntities.TROPICAL_FISH.get(), ShinyTropicalFishRenderer::new);
        event.registerEntityRenderer(ModEntities.TURTLE.get(), ShinyTurtleRenderer::new);
        event.registerEntityRenderer(ModEntities.VEX.get(), ShinyVexRenderer::new);
        event.registerEntityRenderer(ModEntities.VILLAGER.get(), ShinyVillagerRenderer::new);
        event.registerEntityRenderer(ModEntities.VINDICATOR.get(), ShinyVindicatorRenderer::new);
        event.registerEntityRenderer(ModEntities.WANDERING_TRADER.get(), ShinyWanderingTraderRenderer::new);
        event.registerEntityRenderer(ModEntities.WITCH.get(), ShinyWitchRenderer::new);
        event.registerEntityRenderer(ModEntities.WITHER.get(), ShinyWitherBossRenderer::new);
        event.registerEntityRenderer(ModEntities.WITHER_SKELETON.get(), ShinyWitherSkeletonRenderer::new);
        event.registerEntityRenderer(ModEntities.WOLF.get(), ShinyWolfRenderer::new);
        event.registerEntityRenderer(ModEntities.ZOGLIN.get(), ShinyZoglinRenderer::new);
        event.registerEntityRenderer(ModEntities.ZOMBIE.get(), ShinyZombieRenderer::new);
        event.registerEntityRenderer(ModEntities.ZOMBIE_HORSE.get(), (context) -> new ShinyUndeadHorseRenderer(context, ModelLayers.ZOMBIE_HORSE));
        event.registerEntityRenderer(ModEntities.ZOMBIE_VILLAGER.get(), ShinyZombieVillagerRenderer::new);
        event.registerEntityRenderer(ModEntities.ZOMBIFIED_PIGLIN.get(), (context) -> new ShinyPiglinRenderer(context, ModelLayers.ZOMBIFIED_PIGLIN, ModelLayers.ZOMBIFIED_PIGLIN_INNER_ARMOR, ModelLayers.ZOMBIFIED_PIGLIN_OUTER_ARMOR, true));
    }
}
