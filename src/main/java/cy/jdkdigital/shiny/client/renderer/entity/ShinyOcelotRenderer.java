package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.OcelotShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.OcelotRenderer;

public class ShinyOcelotRenderer extends OcelotRenderer
{
    public ShinyOcelotRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new OcelotShinyLayer(this));
    }
}
