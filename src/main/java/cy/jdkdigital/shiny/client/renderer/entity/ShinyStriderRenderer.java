package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.StriderShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.StriderRenderer;

public class ShinyStriderRenderer extends StriderRenderer
{
    public ShinyStriderRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new StriderShinyLayer(this));
    }
}
