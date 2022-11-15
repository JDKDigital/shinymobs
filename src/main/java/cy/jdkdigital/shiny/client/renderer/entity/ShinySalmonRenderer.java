package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.SalmonShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.SalmonRenderer;

public class ShinySalmonRenderer extends SalmonRenderer
{
    public ShinySalmonRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new SalmonShinyLayer(this));
    }
}
