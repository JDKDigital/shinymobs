package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.StrayShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.SkeletonRenderer;

public class ShinyStrayRenderer extends SkeletonRenderer
{
    public ShinyStrayRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new StrayShinyLayer(this));
    }
}
