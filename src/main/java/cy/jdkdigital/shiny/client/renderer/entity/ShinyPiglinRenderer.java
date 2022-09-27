package cy.jdkdigital.shiny.client.renderer.entity;

import com.google.common.collect.ImmutableMap;
import cy.jdkdigital.shiny.client.renderer.entity.layers.PiglinShinyLayer;
import cy.jdkdigital.shiny.init.ModEntities;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.PiglinRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class ShinyPiglinRenderer extends PiglinRenderer
{
    private static final Map<EntityType<?>, ResourceLocation> TEXTURES = ImmutableMap.of(
        ModEntities.PIGLIN.get(), new ResourceLocation("textures/entity/piglin/piglin.png"),
        ModEntities.ZOMBIFIED_PIGLIN.get(), new ResourceLocation("textures/entity/piglin/zombified_piglin.png"),
        ModEntities.PIGLIN_BRUTE.get(), new ResourceLocation("textures/entity/piglin/piglin_brute.png")
    );

    public ShinyPiglinRenderer(EntityRendererProvider.Context context, ModelLayerLocation body, ModelLayerLocation innerArmor, ModelLayerLocation outerArmor, boolean isZombie) {
        super(context, body, innerArmor, outerArmor, isZombie);
        addLayer(new PiglinShinyLayer(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(Mob entity) {
        ResourceLocation resourcelocation = TEXTURES.get(entity.getType());
        if (resourcelocation == null) {
            throw new IllegalArgumentException("I don't know what texture to use for " + entity.getType());
        } else {
            return resourcelocation;
        }
    }
}
