package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.DrownedShinyLayer;
import net.minecraft.client.renderer.entity.DrownedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ShinyDrownedRenderer extends DrownedRenderer
{
    public ShinyDrownedRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new DrownedShinyLayer(this));
    }
}
