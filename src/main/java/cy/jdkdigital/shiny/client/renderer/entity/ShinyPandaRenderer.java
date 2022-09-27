package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.PandaShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.PandaRenderer;

public class ShinyPandaRenderer extends PandaRenderer
{
    public ShinyPandaRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new PandaShinyLayer(this));
    }
}
