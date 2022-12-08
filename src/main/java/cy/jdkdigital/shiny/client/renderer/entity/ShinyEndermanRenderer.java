package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.EndermanShinyLayer;
import net.minecraft.client.renderer.entity.EndermanRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.layers.EnderEyesLayer;

public class ShinyEndermanRenderer extends EndermanRenderer
{
    public ShinyEndermanRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new EndermanShinyLayer(this));
        this.layers.removeIf(layer -> layer instanceof EnderEyesLayer);
        this.addLayer(new EndermanShinyLayer(this));
    }
}
