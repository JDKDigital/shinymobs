package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.FrogShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.FrogRenderer;

public class ShinyFrogRenderer extends FrogRenderer
{
    public ShinyFrogRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new FrogShinyLayer(this));
    }
}
