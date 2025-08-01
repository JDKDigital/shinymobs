package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.SnifferShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.SnifferRenderer;

public class ShinySnifferRenderer extends SnifferRenderer
{
    public ShinySnifferRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new SnifferShinyLayer(this));
    }
}
