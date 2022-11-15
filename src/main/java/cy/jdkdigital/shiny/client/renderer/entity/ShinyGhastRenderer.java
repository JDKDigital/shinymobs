package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.GhastShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.GhastRenderer;

public class ShinyGhastRenderer extends GhastRenderer
{
    public ShinyGhastRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new GhastShinyLayer(this));
    }
}
