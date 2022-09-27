package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.ParrotShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ParrotRenderer;

public class ShinyParrotRenderer extends ParrotRenderer
{
    public ShinyParrotRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new ParrotShinyLayer(this));
    }
}
