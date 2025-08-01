package cy.jdkdigital.shiny.data;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.common.datamap.SpawnChanceMap;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.entity.EntityType;

import java.util.concurrent.CompletableFuture;

public class DataMapProvider extends net.neoforged.neoforge.common.data.DataMapProvider
{
    protected DataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather() {
        final var dropRates = builder(ShinyMod.SPAWN_CHANCE_MAP);

        dropRates.add(BuiltInRegistries.ENTITY_TYPE.getKey(EntityType.ENDER_DRAGON), new SpawnChanceMap(0.05f), false);
    }
}
