package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.MagmaCubeShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MagmaCubeRenderer;

public class ShinyMagmaCubeRenderer extends MagmaCubeRenderer
{
    public ShinyMagmaCubeRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new MagmaCubeShinyLayer(this));
    }
}
