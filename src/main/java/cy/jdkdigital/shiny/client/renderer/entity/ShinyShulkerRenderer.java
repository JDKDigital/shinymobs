package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.ShulkerShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ShulkerRenderer;

public class ShinyShulkerRenderer extends ShulkerRenderer
{
    public ShinyShulkerRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new ShulkerShinyLayer(this));
    }
}
