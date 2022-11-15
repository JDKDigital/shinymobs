package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.HoglinShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HoglinRenderer;

public class ShinyHoglinRenderer extends HoglinRenderer
{
    public ShinyHoglinRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new HoglinShinyLayer(this));
    }
}
