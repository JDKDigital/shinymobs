package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.CodShinyLayer;
import net.minecraft.client.renderer.entity.CodRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ShinyCodRenderer extends CodRenderer
{
    public ShinyCodRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new CodShinyLayer(this));
    }
}
