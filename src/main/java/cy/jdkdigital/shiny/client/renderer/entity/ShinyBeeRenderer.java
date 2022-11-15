package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.BeeShinyLayer;
import net.minecraft.client.renderer.entity.BeeRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ShinyBeeRenderer extends BeeRenderer
{
    public ShinyBeeRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new BeeShinyLayer(this));
    }
}
