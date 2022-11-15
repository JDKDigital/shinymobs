package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.PhantomShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.PhantomRenderer;

public class ShinyPhantomRenderer extends PhantomRenderer
{
    public ShinyPhantomRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new PhantomShinyLayer(this));
    }
}
