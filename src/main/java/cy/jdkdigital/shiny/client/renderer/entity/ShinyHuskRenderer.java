package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.HuskShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HuskRenderer;

public class ShinyHuskRenderer extends HuskRenderer
{
    public ShinyHuskRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new HuskShinyLayer(this));
    }
}
