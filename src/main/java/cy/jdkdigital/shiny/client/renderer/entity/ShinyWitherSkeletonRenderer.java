package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.WitherSkeletonShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.WitherSkeletonRenderer;

public class ShinyWitherSkeletonRenderer extends WitherSkeletonRenderer
{
    public ShinyWitherSkeletonRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new WitherSkeletonShinyLayer(this));
    }
}
