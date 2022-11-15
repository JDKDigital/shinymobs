package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.AllayShinyLayer;
import net.minecraft.client.renderer.entity.AllayRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ShinyAllayRenderer extends AllayRenderer
{
    public ShinyAllayRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new AllayShinyLayer(this));
    }
}
