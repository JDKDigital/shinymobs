package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.SnowGolemShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.SnowGolemRenderer;

public class ShinySnowGolemRenderer extends SnowGolemRenderer
{
    public ShinySnowGolemRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new SnowGolemShinyLayer(this));
    }
}
