package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.IllusionerShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.IllusionerRenderer;

public class ShinyIllusionerRenderer extends IllusionerRenderer
{
    public ShinyIllusionerRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new IllusionerShinyLayer<>(this));
    }
}
