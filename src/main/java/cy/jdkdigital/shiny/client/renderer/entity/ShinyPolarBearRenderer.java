package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.PolarBearShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.PolarBearRenderer;

public class ShinyPolarBearRenderer extends PolarBearRenderer
{
    public ShinyPolarBearRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new PolarBearShinyLayer(this));
    }
}
