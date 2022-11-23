package cy.jdkdigital.shiny.init;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.common.entity.*;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.GlowSquid;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.ambient.Bat;
import net.minecraft.world.entity.animal.*;
import net.minecraft.world.entity.animal.goat.Goat;
import net.minecraft.world.entity.animal.horse.*;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.monster.*;
import net.minecraft.world.entity.monster.hoglin.Hoglin;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.npc.WanderingTrader;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = ShinyMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntities
{
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, ShinyMod.MODID);

    public static final RegistryObject<EntityType<ArmorStand>> ARMOR_STAND = register("shiny_armor_stand", EntityType.Builder.<ArmorStand>of(ArmorStand::new, MobCategory.MISC).sized(0.5F, 1.975F).clientTrackingRange(10));
    public static final RegistryObject<EntityType<ShinyAxolotl>> AXOLOTL = register("shiny_axolotl", EntityType.Builder.of(ShinyAxolotl::new, MobCategory.AXOLOTLS).sized(0.75F, 0.42F).clientTrackingRange(10));
    public static final RegistryObject<EntityType<Bat>> BAT = register("shiny_bat", EntityType.Builder.of(Bat::new, MobCategory.AMBIENT).sized(0.5F, 0.9F).clientTrackingRange(5));
    public static final RegistryObject<EntityType<Bee>> BEE = register("shiny_bee", EntityType.Builder.of(Bee::new, MobCategory.CREATURE).sized(0.7F, 0.6F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<Blaze>> BLAZE = register("shiny_blaze", EntityType.Builder.of(Blaze::new, MobCategory.MONSTER).fireImmune().sized(0.6F, 1.8F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<Cat>> CAT = register("shiny_cat", EntityType.Builder.of(Cat::new, MobCategory.CREATURE).sized(0.6F, 0.7F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<CaveSpider>> CAVE_SPIDER = register("shiny_cave_spider", EntityType.Builder.of(CaveSpider::new, MobCategory.MONSTER).sized(0.7F, 0.5F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<Chicken>> CHICKEN = register("shiny_chicken", EntityType.Builder.of(Chicken::new, MobCategory.CREATURE).sized(0.4F, 0.7F).clientTrackingRange(10));
    public static final RegistryObject<EntityType<ShinyCod>> COD = register("shiny_cod", EntityType.Builder.of(ShinyCod::new, MobCategory.WATER_AMBIENT).sized(0.5F, 0.3F).clientTrackingRange(4));
    public static final RegistryObject<EntityType<Cow>> COW = register("shiny_cow", EntityType.Builder.of(Cow::new, MobCategory.CREATURE).sized(0.9F, 1.4F).clientTrackingRange(10));
    public static final RegistryObject<EntityType<Creeper>> CREEPER = register("shiny_creeper", EntityType.Builder.of(Creeper::new, MobCategory.MONSTER).sized(0.6F, 1.7F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<Dolphin>> DOLPHIN = register("shiny_dolphin", EntityType.Builder.of(Dolphin::new, MobCategory.WATER_CREATURE).sized(0.9F, 0.6F));
    public static final RegistryObject<EntityType<Donkey>> DONKEY = register("shiny_donkey", EntityType.Builder.of(Donkey::new, MobCategory.CREATURE).sized(1.3964844F, 1.5F).clientTrackingRange(10));
    public static final RegistryObject<EntityType<Drowned>> DROWNED = register("shiny_drowned", EntityType.Builder.of(Drowned::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<ElderGuardian>> ELDER_GUARDIAN = register("shiny_elder_guardian", EntityType.Builder.of(ElderGuardian::new, MobCategory.MONSTER).sized(1.9975F, 1.9975F).clientTrackingRange(10));
    public static final RegistryObject<EntityType<EnderMan>> ENDERMAN = register("shiny_enderman", EntityType.Builder.of(EnderMan::new, MobCategory.MONSTER).sized(0.6F, 2.9F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<Endermite>> ENDERMITE = register("shiny_endermite", EntityType.Builder.of(Endermite::new, MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<Evoker>> EVOKER = register("shiny_evoker", EntityType.Builder.of(Evoker::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<Fox>> FOX = register("shiny_fox", EntityType.Builder.of(Fox::new, MobCategory.CREATURE).sized(0.6F, 0.7F).clientTrackingRange(8).immuneTo(Blocks.SWEET_BERRY_BUSH));
    public static final RegistryObject<EntityType<Ghast>> GHAST = register("shiny_ghast", EntityType.Builder.of(Ghast::new, MobCategory.MONSTER).fireImmune().sized(4.0F, 4.0F).clientTrackingRange(10));
    public static final RegistryObject<EntityType<GlowSquid>> GLOW_SQUID = register("shiny_glow_squid", EntityType.Builder.of(GlowSquid::new, MobCategory.UNDERGROUND_WATER_CREATURE).sized(0.8F, 0.8F).clientTrackingRange(10));
    public static final RegistryObject<EntityType<Goat>> GOAT = register("shiny_goat", EntityType.Builder.of(Goat::new, MobCategory.CREATURE).sized(0.9F, 1.3F).clientTrackingRange(10));
    public static final RegistryObject<EntityType<Guardian>> GUARDIAN = register("shiny_guardian", EntityType.Builder.of(Guardian::new, MobCategory.MONSTER).sized(0.85F, 0.85F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<Hoglin>> HOGLIN = register("shiny_hoglin", EntityType.Builder.of(Hoglin::new, MobCategory.MONSTER).sized(1.3964844F, 1.4F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<Horse>> HORSE = register("shiny_horse", EntityType.Builder.of(Horse::new, MobCategory.CREATURE).sized(1.3964844F, 1.6F).clientTrackingRange(10));
    public static final RegistryObject<EntityType<Husk>> HUSK = register("shiny_husk", EntityType.Builder.of(Husk::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<Illusioner>> ILLUSIONER = register("shiny_illusioner", EntityType.Builder.of(Illusioner::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<IronGolem>> IRON_GOLEM = register("shiny_iron_golem", EntityType.Builder.of(IronGolem::new, MobCategory.MISC).sized(1.4F, 2.7F).clientTrackingRange(10));
    public static final RegistryObject<EntityType<Llama>> LLAMA = register("shiny_llama", EntityType.Builder.of(Llama::new, MobCategory.CREATURE).sized(0.9F, 1.87F).clientTrackingRange(10));
    public static final RegistryObject<EntityType<MagmaCube>> MAGMA_CUBE = register("shiny_magma_cube", EntityType.Builder.of(MagmaCube::new, MobCategory.MONSTER).fireImmune().sized(2.04F, 2.04F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<Mule>> MULE = register("shiny_mule", EntityType.Builder.of(Mule::new, MobCategory.CREATURE).sized(1.3964844F, 1.6F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<MushroomCow>> MOOSHROOM = register("shiny_mooshroom", EntityType.Builder.of(MushroomCow::new, MobCategory.CREATURE).sized(0.9F, 1.4F).clientTrackingRange(10));
    public static final RegistryObject<EntityType<Ocelot>> OCELOT = register("shiny_ocelot", EntityType.Builder.of(Ocelot::new, MobCategory.CREATURE).sized(0.6F, 0.7F).clientTrackingRange(10));
    public static final RegistryObject<EntityType<Panda>> PANDA = register("shiny_panda", EntityType.Builder.of(Panda::new, MobCategory.CREATURE).sized(1.3F, 1.25F).clientTrackingRange(10));
    public static final RegistryObject<EntityType<Parrot>> PARROT = register("shiny_parrot", EntityType.Builder.of(Parrot::new, MobCategory.CREATURE).sized(0.5F, 0.9F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<Phantom>> PHANTOM = register("shiny_phantom", EntityType.Builder.of(Phantom::new, MobCategory.MONSTER).sized(0.9F, 0.5F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<Pig>> PIG = register("shiny_pig", EntityType.Builder.of(Pig::new, MobCategory.CREATURE).sized(0.9F, 0.9F).clientTrackingRange(10));
    public static final RegistryObject<EntityType<Piglin>> PIGLIN = register("shiny_piglin", EntityType.Builder.of(Piglin::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<PiglinBrute>> PIGLIN_BRUTE = register("shiny_piglin_brute", EntityType.Builder.of(PiglinBrute::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<Pillager>> PILLAGER = register("shiny_pillager", EntityType.Builder.of(Pillager::new, MobCategory.MONSTER).canSpawnFarFromPlayer().sized(0.6F, 1.95F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<PolarBear>> POLAR_BEAR = register("shiny_polar_bear", EntityType.Builder.of(PolarBear::new, MobCategory.CREATURE).immuneTo(Blocks.POWDER_SNOW).sized(1.4F, 1.4F).clientTrackingRange(10));
    public static final RegistryObject<EntityType<ShinyPufferfish>> PUFFERFISH = register("shiny_pufferfish", EntityType.Builder.of(ShinyPufferfish::new, MobCategory.WATER_AMBIENT).sized(0.7F, 0.7F).clientTrackingRange(4));
    public static final RegistryObject<EntityType<Rabbit>> RABBIT = register("shiny_rabbit", EntityType.Builder.of(Rabbit::new, MobCategory.CREATURE).sized(0.4F, 0.5F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<Ravager>> RAVAGER = register("shiny_ravager", EntityType.Builder.of(Ravager::new, MobCategory.MONSTER).sized(1.95F, 2.2F).clientTrackingRange(10));
    public static final RegistryObject<EntityType<ShinySalmon>> SALMON = register("shiny_salmon", EntityType.Builder.of(ShinySalmon::new, MobCategory.WATER_AMBIENT).sized(0.7F, 0.4F).clientTrackingRange(4));
    public static final RegistryObject<EntityType<Sheep>> SHEEP = register("shiny_sheep", EntityType.Builder.of(Sheep::new, MobCategory.CREATURE).sized(0.9F, 1.3F).clientTrackingRange(10));
    public static final RegistryObject<EntityType<Shulker>> SHULKER = register("shiny_shulker", EntityType.Builder.of(Shulker::new, MobCategory.MONSTER).fireImmune().canSpawnFarFromPlayer().sized(1.0F, 1.0F).clientTrackingRange(10));
    public static final RegistryObject<EntityType<Silverfish>> SILVERFISH = register("shiny_silverfish", EntityType.Builder.of(Silverfish::new, MobCategory.MONSTER).sized(0.4F, 0.3F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<Skeleton>> SKELETON = register("shiny_skeleton", EntityType.Builder.of(Skeleton::new, MobCategory.MONSTER).sized(0.6F, 1.99F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<SkeletonHorse>> SKELETON_HORSE = register("shiny_skeleton_horse", EntityType.Builder.of(SkeletonHorse::new, MobCategory.CREATURE).sized(1.3964844F, 1.6F).clientTrackingRange(10));
    public static final RegistryObject<EntityType<Slime>> SLIME = register("shiny_slime", EntityType.Builder.of(Slime::new, MobCategory.MONSTER).sized(2.04F, 2.04F).clientTrackingRange(10));
    public static final RegistryObject<EntityType<SnowGolem>> SNOW_GOLEM = register("shiny_snow_golem", EntityType.Builder.of(SnowGolem::new, MobCategory.MISC).immuneTo(Blocks.POWDER_SNOW).sized(0.7F, 1.9F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<Spider>> SPIDER = register("shiny_spider", EntityType.Builder.of(Spider::new, MobCategory.MONSTER).sized(1.4F, 0.9F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<Squid>> SQUID = register("shiny_squid", EntityType.Builder.of(Squid::new, MobCategory.WATER_CREATURE).sized(0.8F, 0.8F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<Stray>> STRAY = register("shiny_stray", EntityType.Builder.of(Stray::new, MobCategory.MONSTER).sized(0.6F, 1.99F).immuneTo(Blocks.POWDER_SNOW).clientTrackingRange(8));
    public static final RegistryObject<EntityType<Strider>> STRIDER = register("shiny_strider", EntityType.Builder.of(Strider::new, MobCategory.CREATURE).fireImmune().sized(0.9F, 1.7F).clientTrackingRange(10));
    public static final RegistryObject<EntityType<TraderLlama>> TRADER_LLAMA = register("shiny_trader_llama", EntityType.Builder.of(TraderLlama::new, MobCategory.CREATURE).sized(0.9F, 1.87F).clientTrackingRange(10));
    public static final RegistryObject<EntityType<ShinyTropicalFish>> TROPICAL_FISH = register("shiny_tropical_fish", EntityType.Builder.of(ShinyTropicalFish::new, MobCategory.WATER_AMBIENT).sized(0.5F, 0.4F).clientTrackingRange(4));
    public static final RegistryObject<EntityType<Turtle>> TURTLE = register("shiny_turtle", EntityType.Builder.of(Turtle::new, MobCategory.CREATURE).sized(1.2F, 0.4F).clientTrackingRange(10));
    public static final RegistryObject<EntityType<Vex>> VEX = register("shiny_vex", EntityType.Builder.of(Vex::new, MobCategory.MONSTER).fireImmune().sized(0.4F, 0.8F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<Villager>> VILLAGER = register("shiny_villager", EntityType.Builder.<Villager>of(Villager::new, MobCategory.MISC).sized(0.6F, 1.95F).clientTrackingRange(10));
    public static final RegistryObject<EntityType<Vindicator>> VINDICATOR = register("shiny_vindicator", EntityType.Builder.of(Vindicator::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<WanderingTrader>> WANDERING_TRADER = register("shiny_wandering_trader", EntityType.Builder.of(WanderingTrader::new, MobCategory.CREATURE).sized(0.6F, 1.95F).clientTrackingRange(10));
    public static final RegistryObject<EntityType<Witch>> WITCH = register("shiny_witch", EntityType.Builder.of(Witch::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<WitherBoss>> WITHER = register("shiny_wither", EntityType.Builder.of(WitherBoss::new, MobCategory.MONSTER).fireImmune().immuneTo(Blocks.WITHER_ROSE).sized(0.9F, 3.5F).clientTrackingRange(10));
    public static final RegistryObject<EntityType<WitherSkeleton>> WITHER_SKELETON = register("shiny_wither_skeleton", EntityType.Builder.of(WitherSkeleton::new, MobCategory.MONSTER).fireImmune().immuneTo(Blocks.WITHER_ROSE).sized(0.7F, 2.4F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<Wolf>> WOLF = register("shiny_wolf", EntityType.Builder.of(Wolf::new, MobCategory.CREATURE).sized(0.6F, 0.85F).clientTrackingRange(10));
    public static final RegistryObject<EntityType<Zoglin>> ZOGLIN = register("shiny_zoglin", EntityType.Builder.of(Zoglin::new, MobCategory.MONSTER).fireImmune().sized(1.3964844F, 1.4F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<Zombie>> ZOMBIE = register("shiny_zombie", EntityType.Builder.<Zombie>of(Zombie::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<ZombieHorse>> ZOMBIE_HORSE = register("shiny_zombie_horse", EntityType.Builder.of(ZombieHorse::new, MobCategory.CREATURE).sized(1.3964844F, 1.6F).clientTrackingRange(10));
    public static final RegistryObject<EntityType<ShinyZombieVillager>> ZOMBIE_VILLAGER = register("shiny_zombie_villager", EntityType.Builder.of(ShinyZombieVillager::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8));
    public static final RegistryObject<EntityType<ZombifiedPiglin>> ZOMBIFIED_PIGLIN = register("shiny_zombified_piglin", EntityType.Builder.of(ZombifiedPiglin::new, MobCategory.MONSTER).fireImmune().sized(0.6F, 1.95F).clientTrackingRange(8));

    public static <E extends Entity> RegistryObject<EntityType<E>> register(String name, EntityType.Builder<E> builder) {
        return ENTITIES.register(name, () -> builder.build(ShinyMod.MODID + ":" + name));
    }
}
