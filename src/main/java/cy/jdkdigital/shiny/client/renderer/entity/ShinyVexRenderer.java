package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.VexShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.VexRenderer;

public class ShinyVexRenderer extends VexRenderer
{
    public ShinyVexRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new VexShinyLayer(this));
    }
}
