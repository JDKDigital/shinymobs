package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.SkeletonShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.SkeletonRenderer;

public class ShinySkeletonRenderer extends SkeletonRenderer
{
    public ShinySkeletonRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new SkeletonShinyLayer(this));
    }
}
