package cy.jdkdigital.shiny;

import cy.jdkdigital.shiny.common.datamap.SpawnChanceMap;
import cy.jdkdigital.shiny.init.ModEntities;
import cy.jdkdigital.shiny.init.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.registries.datamaps.DataMapType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ShinyMod.MODID)
public class ShinyMod
{
    public static final String MODID = "shiny";
    public static final Logger LOGGER = LogManager.getLogger();

    public static final DataMapType<EntityType<?>, SpawnChanceMap> SPAWN_CHANCE_MAP = DataMapType.builder(ResourceLocation.fromNamespaceAndPath(MODID, "spawn_chance_map"), Registries.ENTITY_TYPE, SpawnChanceMap.CODEC).synced(SpawnChanceMap.SPAWN_CHANCE_CODEC, false).build();

    public ShinyMod(IEventBus modEventBus, ModContainer modContainer) {
        ModEntities.ENTITIES.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);

        modContainer.registerConfig(ModConfig.Type.SERVER, ShinyModConfig.SERVER_CONFIG);
    }
}
