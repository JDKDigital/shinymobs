package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.SlimeShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.SlimeRenderer;

public class ShinySlimeRenderer extends SlimeRenderer
{
    public ShinySlimeRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new SlimeShinyLayer(this, context.getModelSet()));
    }
}
