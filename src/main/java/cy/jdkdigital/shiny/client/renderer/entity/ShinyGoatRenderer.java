package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.GoatShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.GoatRenderer;

public class ShinyGoatRenderer extends GoatRenderer
{
    public ShinyGoatRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new GoatShinyLayer(this));
    }
}
