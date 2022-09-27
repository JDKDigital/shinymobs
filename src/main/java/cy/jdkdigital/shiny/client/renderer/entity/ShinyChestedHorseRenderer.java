package cy.jdkdigital.shiny.client.renderer.entity;

import com.google.common.collect.ImmutableMap;
import cy.jdkdigital.shiny.client.renderer.entity.layers.ChestedHorseShinyLayer;
import cy.jdkdigital.shiny.init.ModEntities;
import net.minecraft.client.model.ChestedHorseModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.AbstractHorseRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.horse.AbstractChestedHorse;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class ShinyChestedHorseRenderer<T extends AbstractChestedHorse> extends AbstractHorseRenderer<T, ChestedHorseModel<T>>
{
    private static final Map<EntityType<?>, ResourceLocation> MAP = ImmutableMap.of(
        ModEntities.DONKEY.get(), new ResourceLocation("textures/entity/horse/donkey.png"),
        ModEntities.MULE.get(), new ResourceLocation("textures/entity/horse/mule.png")
    );

    public ShinyChestedHorseRenderer(EntityRendererProvider.Context context, float size, ModelLayerLocation model) {
        super(context, new ChestedHorseModel<>(context.bakeLayer(model)), size);
        addLayer(new ChestedHorseShinyLayer<>(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(T entity) {
        return MAP.get(entity.getType());
    }
}
