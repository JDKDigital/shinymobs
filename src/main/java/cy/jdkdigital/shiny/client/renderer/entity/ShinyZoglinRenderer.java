package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.ZoglinShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ZoglinRenderer;

public class ShinyZoglinRenderer extends ZoglinRenderer
{
    public ShinyZoglinRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new ZoglinShinyLayer(this));
    }
}
