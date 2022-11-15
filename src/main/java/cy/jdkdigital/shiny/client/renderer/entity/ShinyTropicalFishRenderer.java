package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.TropicalFishShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.TropicalFishRenderer;

public class ShinyTropicalFishRenderer extends TropicalFishRenderer
{
    public ShinyTropicalFishRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new TropicalFishShinyLayer(this, context.getModelSet()));
    }
}
