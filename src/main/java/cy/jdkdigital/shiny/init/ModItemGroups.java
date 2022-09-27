package cy.jdkdigital.shiny.init;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.trophymanager.common.block.TrophyBlock;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

public class ModItemGroups
{
    public static final CreativeModeTab SHINY = new ModItemGroup(ShinyMod.MODID, () -> new ItemStack(Items.DIAMOND));

    public static void init() {
    }

    public static class ModItemGroup extends CreativeModeTab
    {
        private final Supplier<ItemStack> iconSupplier;

        public ModItemGroup(@Nonnull final String name, @Nonnull final Supplier<ItemStack> iconSupplier) {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return iconSupplier.get();
        }

        @Override
        public void fillItemList(@Nonnull NonNullList<ItemStack> items) {
            String[] entities = {
                    "armor_stand",
                    "axolotl",
                    "bat",
                    "bee",
                    "blaze",
                    "cat",
                    "cave_spider",
                    "chicken",
                    "cod",
                    "cow",
                    "creeper",
                    "dolphin",
                    "donkey",
                    "drowned",
                    "elder_guardian",
                    "enderman",
                    "endermite",
                    "evoker",
                    "fox",
                    "ghast",
                    "glow_squid",
                    "goat",
                    "guardian",
                    "hoglin",
                    "horse",
                    "husk",
                    "illusioner",
                    "iron_golem",
                    "llama",
                    "magma_cube",
                    "mule",
                    "mooshroom",
                    "ocelot",
                    "panda",
                    "parrot",
                    "phantom",
                    "pig",
                    "piglin",
                    "piglin_brute",
                    "pillager",
                    "polar_bear",
                    "pufferfish",
                    "rabbit",
                    "ravager",
                    "salmon",
                    "sheep",
                    "shulker",
                    "silverfish",
                    "skeleton",
                    "skeleton_horse",
                    "slime",
                    "snow_golem",
                    "spider",
                    "squid",
                    "stray",
                    "strider",
                    "trader_llama",
                    "tropical_fish",
                    "turtle",
                    "vex",
                    "villager",
                    "vindicator",
                    "wandering_trader",
                    "witch",
                    "wither",
                    "wither_skeleton",
                    "wolf",
                    "zoglin",
                    "zombie",
                    "zombie_horse",
                    "zombie_villager",
                    "zombified_piglin"
            };

            for (String entityId : entities) {
                items.add(TrophyBlock.createTrophy("shiny:shiny_" + entityId, new CompoundTag(), "Shiny " + entityId));
            }

            super.fillItemList(items);
        }
    }
}
