package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.AxolotlShinyLayer;
import net.minecraft.client.renderer.entity.AxolotlRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ShinyAxolotlRenderer extends AxolotlRenderer
{
    public ShinyAxolotlRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new AxolotlShinyLayer(this));
    }
}
