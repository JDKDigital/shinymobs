package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.CamelShinyLayer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.CamelRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ShinyCamelRenderer extends CamelRenderer
{
    public ShinyCamelRenderer(EntityRendererProvider.Context context, ModelLayerLocation modelLayerLocation) {
        super(context, modelLayerLocation);
        addLayer(new CamelShinyLayer(this));
    }
}
