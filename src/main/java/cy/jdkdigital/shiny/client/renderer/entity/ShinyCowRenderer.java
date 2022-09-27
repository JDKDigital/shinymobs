package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.CowShinyLayer;
import net.minecraft.client.renderer.entity.CowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ShinyCowRenderer extends CowRenderer
{
    public ShinyCowRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new CowShinyLayer(this));
    }
}
