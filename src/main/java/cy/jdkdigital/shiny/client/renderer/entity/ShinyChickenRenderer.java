package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.ChickenShinyLayer;
import net.minecraft.client.renderer.entity.ChickenRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ShinyChickenRenderer extends ChickenRenderer
{
    public ShinyChickenRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new ChickenShinyLayer(this));
    }
}
