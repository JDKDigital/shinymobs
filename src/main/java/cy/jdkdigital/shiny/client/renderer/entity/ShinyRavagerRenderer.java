package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.RavagerShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.RavagerRenderer;

public class ShinyRavagerRenderer extends RavagerRenderer
{
    public ShinyRavagerRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new RavagerShinyLayer(this));
    }
}
