package cy.jdkdigital.shiny.event;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.compat.TrophyCompat;
import cy.jdkdigital.shiny.init.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, modid = ShinyMod.MODID, value = Dist.CLIENT)
public class ClientEvents
{
    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey().equals(CreativeModeTabs.TOOLS_AND_UTILITIES)) {
            event.accept(ModItems.SHINY_PUFFERFISH_BUCKET.get());
            event.accept(ModItems.SHINY_SALMON_BUCKET.get());
            event.accept(ModItems.SHINY_TROPICAL_FISH_BUCKET.get());
            event.accept(ModItems.SHINY_COD_BUCKET.get());
            event.accept(ModItems.SHINY_AXOLOTL_BUCKET.get());
        }

        if (event.getTabKey().equals(CreativeModeTabs.OP_BLOCKS) && ModList.get().isLoaded("trophymanager")) {
            TrophyCompat.creativeTrophies(event);
        }
    }
}
