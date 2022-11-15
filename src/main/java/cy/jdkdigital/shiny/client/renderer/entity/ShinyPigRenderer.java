package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.PigShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.PigRenderer;

public class ShinyPigRenderer extends PigRenderer
{
    public ShinyPigRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new PigShinyLayer(this));
    }
}
