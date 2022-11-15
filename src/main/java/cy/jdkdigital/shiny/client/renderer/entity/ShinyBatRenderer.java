package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.BatShinyLayer;
import net.minecraft.client.renderer.entity.BatRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ShinyBatRenderer extends BatRenderer
{
    public ShinyBatRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new BatShinyLayer(this));
    }
}
