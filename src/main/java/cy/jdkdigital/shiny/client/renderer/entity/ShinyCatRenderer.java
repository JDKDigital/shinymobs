package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.CatShinyLayer;
import net.minecraft.client.renderer.entity.CatRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ShinyCatRenderer extends CatRenderer
{
    public ShinyCatRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new CatShinyLayer(this));
    }
}
