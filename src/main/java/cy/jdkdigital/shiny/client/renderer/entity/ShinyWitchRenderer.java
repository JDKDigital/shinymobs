package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.WitchShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.WitchRenderer;

public class ShinyWitchRenderer extends WitchRenderer
{
    public ShinyWitchRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new WitchShinyLayer(this));
    }
}
