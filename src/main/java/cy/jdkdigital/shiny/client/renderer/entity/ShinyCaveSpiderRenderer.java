package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.CaveSpiderShinyLayer;
import net.minecraft.client.renderer.entity.CaveSpiderRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ShinyCaveSpiderRenderer extends CaveSpiderRenderer
{
    public ShinyCaveSpiderRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new CaveSpiderShinyLayer(this));
    }
}
