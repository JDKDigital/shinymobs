package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.SilverfishShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.SilverfishRenderer;

public class ShinySilverfishRenderer extends SilverfishRenderer
{
    public ShinySilverfishRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new SilverfishShinyLayer(this));
    }
}
