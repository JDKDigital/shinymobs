package cy.jdkdigital.shiny;

import cy.jdkdigital.shiny.init.ModEntities;
import cy.jdkdigital.shiny.init.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ShinyMod.MODID)
public class ShinyMod
{
    public static final String MODID = "shiny";
    public static final Logger LOGGER = LogManager.getLogger();

    public ShinyMod(IEventBus modEventBus, ModContainer modContainer) {
        ModEntities.ENTITIES.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);

        modContainer.registerConfig(ModConfig.Type.SERVER, ShinyModConfig.SERVER_CONFIG);
    }
}
