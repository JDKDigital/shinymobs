package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.WolfShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.WolfRenderer;

public class ShinyWolfRenderer extends WolfRenderer
{
    public ShinyWolfRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new WolfShinyLayer(this));
    }
}
