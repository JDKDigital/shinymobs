package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.VindicatorShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.VindicatorRenderer;

public class ShinyVindicatorRenderer extends VindicatorRenderer
{
    public ShinyVindicatorRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new VindicatorShinyLayer(this));
    }
}
