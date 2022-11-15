package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.TadpoleShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.TadpoleRenderer;

public class ShinyTadpoleRenderer extends TadpoleRenderer
{
    public ShinyTadpoleRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new TadpoleShinyLayer(this));
    }
}
