package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.EndermanShinyLayer;
import net.minecraft.client.renderer.entity.EndermanRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ShinyEndermanRenderer extends EndermanRenderer
{
    public ShinyEndermanRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new EndermanShinyLayer(this));
    }
}
