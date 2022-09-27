package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.FoxShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.FoxRenderer;

public class ShinyFoxRenderer extends FoxRenderer
{
    public ShinyFoxRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new FoxShinyLayer(this));
    }
}
