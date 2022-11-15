package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.WanderingTraderShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.WanderingTraderRenderer;

public class ShinyWanderingTraderRenderer extends WanderingTraderRenderer
{
    public ShinyWanderingTraderRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new WanderingTraderShinyLayer(this));
    }
}
