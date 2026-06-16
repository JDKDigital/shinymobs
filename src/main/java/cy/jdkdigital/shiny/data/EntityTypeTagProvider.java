package cy.jdkdigital.shiny.data;

import cy.jdkdigital.shiny.init.ModEntities;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.world.entity.EntityType;

import java.util.concurrent.CompletableFuture;

public class EntityTypeTagProvider extends EntityTypeTagsProvider
{
    public EntityTypeTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pProvider) {
        super(pOutput, pProvider);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(EntityTypeTags.SKELETONS).add(ModEntities.SKELETON.get(), ModEntities.STRAY.get(), ModEntities.WITHER_SKELETON.get(), ModEntities.SKELETON_HORSE.get(), ModEntities.BOGGED.get());
        this.tag(EntityTypeTags.ZOMBIES)
                .add(
                        ModEntities.ZOMBIE_HORSE.get(),
                        ModEntities.ZOMBIE.get(),
                        ModEntities.ZOMBIE_VILLAGER.get(),
                        ModEntities.ZOMBIFIED_PIGLIN.get(),
                        ModEntities.ZOGLIN.get(),
                        ModEntities.DROWNED.get(),
                        ModEntities.HUSK.get()
                );
        this.tag(EntityTypeTags.RAIDERS)
                .add(ModEntities.EVOKER.get(), ModEntities.PILLAGER.get(), ModEntities.RAVAGER.get(), ModEntities.VINDICATOR.get(), ModEntities.ILLUSIONER.get(), ModEntities.WITCH.get());
        this.tag(EntityTypeTags.UNDEAD).add(ModEntities.WITHER.get()).add(ModEntities.PHANTOM.get());
        this.tag(EntityTypeTags.BEEHIVE_INHABITORS).add(ModEntities.BEE.get());
        this.tag(EntityTypeTags.POWDER_SNOW_WALKABLE_MOBS).add(ModEntities.RABBIT.get(), ModEntities.ENDERMITE.get(), ModEntities.SILVERFISH.get(), ModEntities.FOX.get());
        this.tag(EntityTypeTags.AXOLOTL_HUNT_TARGETS)
                .add(
                        ModEntities.TROPICAL_FISH.get(), ModEntities.PUFFERFISH.get(), ModEntities.SALMON.get(), ModEntities.COD.get(), ModEntities.SQUID.get(), ModEntities.GLOW_SQUID.get(), ModEntities.TADPOLE.get()
                );
        this.tag(EntityTypeTags.AXOLOTL_ALWAYS_HOSTILES).add(ModEntities.DROWNED.get(), ModEntities.GUARDIAN.get(), ModEntities.ELDER_GUARDIAN.get());
        this.tag(EntityTypeTags.FREEZE_IMMUNE_ENTITY_TYPES).add(ModEntities.STRAY.get(), ModEntities.POLAR_BEAR.get(), ModEntities.SNOW_GOLEM.get(), ModEntities.WITHER.get());
        this.tag(EntityTypeTags.FREEZE_HURTS_EXTRA_TYPES).add(ModEntities.STRIDER.get(), ModEntities.BLAZE.get(), ModEntities.MAGMA_CUBE.get());
        this.tag(EntityTypeTags.CAN_BREATHE_UNDER_WATER)
                .add(
                        ModEntities.AXOLOTL.get(),
                        ModEntities.FROG.get(),
                        ModEntities.GUARDIAN.get(),
                        ModEntities.ELDER_GUARDIAN.get(),
                        ModEntities.TURTLE.get(),
                        ModEntities.GLOW_SQUID.get(),
                        ModEntities.COD.get(),
                        ModEntities.PUFFERFISH.get(),
                        ModEntities.SALMON.get(),
                        ModEntities.SQUID.get(),
                        ModEntities.TROPICAL_FISH.get(),
                        ModEntities.TADPOLE.get(),
                        ModEntities.ARMOR_STAND.get()
                );
        this.tag(EntityTypeTags.FROG_FOOD).add(ModEntities.SLIME.get(), ModEntities.MAGMA_CUBE.get());
        this.tag(EntityTypeTags.FALL_DAMAGE_IMMUNE)
                .add(
                        ModEntities.IRON_GOLEM.get(),
                        ModEntities.SNOW_GOLEM.get(),
                        ModEntities.SHULKER.get(),
                        ModEntities.ALLAY.get(),
                        ModEntities.BAT.get(),
                        ModEntities.BEE.get(),
                        ModEntities.BLAZE.get(),
                        ModEntities.CAT.get(),
                        ModEntities.CHICKEN.get(),
                        ModEntities.GHAST.get(),
                        ModEntities.PHANTOM.get(),
                        ModEntities.MAGMA_CUBE.get(),
                        ModEntities.OCELOT.get(),
                        ModEntities.PARROT.get(),
                        ModEntities.WITHER.get(),
                        ModEntities.BREEZE.get()
                );
        this.tag(EntityTypeTags.DISMOUNTS_UNDERWATER)
                .add(
                        ModEntities.CAMEL.get(),
                        ModEntities.CHICKEN.get(),
                        ModEntities.DONKEY.get(),
                        ModEntities.HORSE.get(),
                        ModEntities.LLAMA.get(),
                        ModEntities.MULE.get(),
                        ModEntities.PIG.get(),
                        ModEntities.RAVAGER.get(),
                        ModEntities.SPIDER.get(),
                        ModEntities.STRIDER.get(),
                        ModEntities.TRADER_LLAMA.get(),
                        ModEntities.ZOMBIE_HORSE.get()
                );
        this.tag(EntityTypeTags.NON_CONTROLLING_RIDER).add(ModEntities.SLIME.get(), ModEntities.MAGMA_CUBE.get());
        this.tag(EntityTypeTags.ILLAGER).add(ModEntities.EVOKER.get()).add(ModEntities.ILLUSIONER.get()).add(ModEntities.PILLAGER.get()).add(ModEntities.VINDICATOR.get());
        this.tag(EntityTypeTags.AQUATIC)
                .add(ModEntities.TURTLE.get())
                .add(ModEntities.AXOLOTL.get())
                .add(ModEntities.GUARDIAN.get())
                .add(ModEntities.ELDER_GUARDIAN.get())
                .add(ModEntities.COD.get())
                .add(ModEntities.PUFFERFISH.get())
                .add(ModEntities.SALMON.get())
                .add(ModEntities.TROPICAL_FISH.get())
                .add(ModEntities.DOLPHIN.get())
                .add(ModEntities.SQUID.get())
                .add(ModEntities.GLOW_SQUID.get())
                .add(ModEntities.TADPOLE.get());
        this.tag(EntityTypeTags.ARTHROPOD)
                .add(ModEntities.BEE.get())
                .add(ModEntities.ENDERMITE.get())
                .add(ModEntities.SILVERFISH.get())
                .add(ModEntities.SPIDER.get())
                .add(ModEntities.CAVE_SPIDER.get());
        this.tag(EntityTypeTags.NOT_SCARY_FOR_PUFFERFISH)
                .add(ModEntities.TURTLE.get())
                .add(ModEntities.GUARDIAN.get())
                .add(ModEntities.ELDER_GUARDIAN.get())
                .add(ModEntities.COD.get())
                .add(ModEntities.PUFFERFISH.get())
                .add(ModEntities.SALMON.get())
                .add(ModEntities.TROPICAL_FISH.get())
                .add(ModEntities.DOLPHIN.get())
                .add(ModEntities.SQUID.get())
                .add(ModEntities.GLOW_SQUID.get())
                .add(ModEntities.TADPOLE.get());
        this.tag(EntityTypeTags.DEFLECTS_PROJECTILES).add(ModEntities.BREEZE.get());
        this.tag(EntityTypeTags.CAN_TURN_IN_BOATS).add(ModEntities.BREEZE.get());
        this.tag(EntityTypeTags.NO_ANGER_FROM_WIND_CHARGE)
                .add(
                        ModEntities.BREEZE.get(),
                        ModEntities.SKELETON.get(),
                        ModEntities.BOGGED.get(),
                        ModEntities.STRAY.get(),
                        ModEntities.ZOMBIE.get(),
                        ModEntities.HUSK.get(),
                        ModEntities.SPIDER.get(),
                        ModEntities.CAVE_SPIDER.get(),
                        ModEntities.SLIME.get()
                );
        this.tag(EntityTypeTags.IMMUNE_TO_INFESTED).add(ModEntities.SILVERFISH.get());
        this.tag(EntityTypeTags.IMMUNE_TO_OOZING).add(ModEntities.SLIME.get());
    }

    @Override
    public String getName() {
        return "Shiny Entity Tags Provider";
    }
}
