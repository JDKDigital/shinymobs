package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.DolphinShinyLayer;
import net.minecraft.client.renderer.entity.DolphinRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ShinyDolphinRenderer extends DolphinRenderer
{
    public ShinyDolphinRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new DolphinShinyLayer(this));
    }
}
