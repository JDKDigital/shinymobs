package cy.jdkdigital.shiny.compat;

import cy.jdkdigital.trophymanager.common.block.TrophyBlock;
import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

public class TrophyCompat
{
    public static void creativeTrophies(BuildCreativeModeTabContentsEvent event) {
        String[] entities = {"allay", "axolotl", "bat", "bee", "blaze", "camel", "cat", "cave_spider", "chicken", "cow", "creeper", "dolphin", "donkey", "drowned", "elder_guardian", "ender_dragon", "enderman", "endermite", "evoker", "fox", "frog", "ghast", "glow_squid", "goat", "guardian", "hoglin", "horse", "husk", "illusioner", "iron_golem", "llama", "magma_cube", "mule", "mooshroom", "ocelot", "panda", "parrot", "phantom", "pig", "piglin", "piglin_brute", "pillager", "polar_bear", "pufferfish", "rabbit", "ravager", "sheep", "shulker", "silverfish", "skeleton", "skeleton_horse", "slime", "snow_golem", "spider", "squid", "stray", "strider", "tadpole", "trader_llama", "tropical_fish", "turtle", "vex", "villager", "vindicator", "wandering_trader", "warden", "witch", "wither", "wither_skeleton", "wolf", "zoglin", "zombie", "zombie_horse", "zombie_villager", "zombified_piglin"};

        for (String entityId : entities) {
            event.accept(TrophyBlock.createTrophy("shiny:shiny_" + entityId, new CompoundTag(), "Shiny " + entityId));
        }
    }
}
