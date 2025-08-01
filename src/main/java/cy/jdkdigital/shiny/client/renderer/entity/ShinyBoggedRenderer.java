package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.BoggedShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.SkeletonRenderer;

public class ShinyBoggedRenderer extends SkeletonRenderer
{
    public ShinyBoggedRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new BoggedShinyLayer(this));
    }
}
