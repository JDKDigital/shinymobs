package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.PigShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.PigRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Pig;

public class ShinyPigRenderer extends PigRenderer
{
    private static final ResourceLocation PIG_LOCATION = new ResourceLocation("textures/entity/pig/pig.png");

    public ShinyPigRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new PigShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(Pig p_115697_) {
        return PIG_LOCATION;
    }
}
