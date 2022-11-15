package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.WardenShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.WardenRenderer;

public class ShinyWardenRenderer extends WardenRenderer
{
    public ShinyWardenRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new WardenShinyLayer(this));
    }
}
