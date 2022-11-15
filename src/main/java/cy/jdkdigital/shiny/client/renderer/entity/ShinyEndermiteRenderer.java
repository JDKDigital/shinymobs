package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.EndermiteShinyLayer;
import net.minecraft.client.renderer.entity.EndermiteRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ShinyEndermiteRenderer extends EndermiteRenderer
{
    public ShinyEndermiteRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new EndermiteShinyLayer(this));
    }
}
