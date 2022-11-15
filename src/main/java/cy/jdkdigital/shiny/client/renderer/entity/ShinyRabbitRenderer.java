package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.RabbitShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.RabbitRenderer;

public class ShinyRabbitRenderer extends RabbitRenderer
{
    public ShinyRabbitRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new RabbitShinyLayer(this));
    }
}
