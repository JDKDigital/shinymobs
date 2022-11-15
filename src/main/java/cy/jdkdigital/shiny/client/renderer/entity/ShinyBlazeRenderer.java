package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.BlazeShinyLayer;
import net.minecraft.client.renderer.entity.BlazeRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ShinyBlazeRenderer extends BlazeRenderer
{
    public ShinyBlazeRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new BlazeShinyLayer(this));
    }
}
