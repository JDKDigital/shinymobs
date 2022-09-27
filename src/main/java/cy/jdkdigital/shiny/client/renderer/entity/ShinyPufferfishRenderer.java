package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.PufferfishShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.PufferfishRenderer;

public class ShinyPufferfishRenderer extends PufferfishRenderer
{
    public ShinyPufferfishRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new PufferfishShinyLayer(this));
    }
}
