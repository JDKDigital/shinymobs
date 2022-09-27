package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.IronGolemShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.IronGolemRenderer;

public class ShinyIronGolemRenderer extends IronGolemRenderer
{
    public ShinyIronGolemRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new IronGolemShinyLayer(this));
    }
}
