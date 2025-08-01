package cy.jdkdigital.shiny.common.datamap;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record SpawnChanceMap(float spawnChance) {
    public static final Codec<SpawnChanceMap> SPAWN_CHANCE_CODEC = Codec.FLOAT
            .xmap(SpawnChanceMap::new, SpawnChanceMap::spawnChance);

    public static final Codec<SpawnChanceMap> CODEC = Codec.withAlternative(
            RecordCodecBuilder.create(in -> in.group(
                    Codec.FLOAT.fieldOf("spawnChance").forGetter(SpawnChanceMap::spawnChance)).apply(in, SpawnChanceMap::new)),
            SPAWN_CHANCE_CODEC);
}
