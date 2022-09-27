package cy.jdkdigital.shiny.client.renderer.entity;

import com.google.common.collect.ImmutableMap;
import cy.jdkdigital.shiny.client.renderer.entity.layers.UndeadHorseShinyLayer;
import cy.jdkdigital.shiny.init.ModEntities;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.UndeadHorseRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.horse.AbstractHorse;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class ShinyUndeadHorseRenderer extends UndeadHorseRenderer
{
    private static final Map<EntityType<?>, ResourceLocation> MAP = ImmutableMap.of(
        ModEntities.ZOMBIE_HORSE.get(), new ResourceLocation("textures/entity/horse/horse_zombie.png"),
        ModEntities.SKELETON_HORSE.get(), new ResourceLocation("textures/entity/horse/horse_skeleton.png")
    );

    public ShinyUndeadHorseRenderer(EntityRendererProvider.Context context, ModelLayerLocation model) {
        super(context, model);
        addLayer(new UndeadHorseShinyLayer(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(AbstractHorse entity) {
        return MAP.get(entity.getType());
    }
}
