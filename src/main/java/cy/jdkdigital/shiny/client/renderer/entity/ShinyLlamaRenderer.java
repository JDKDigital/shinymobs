package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.LlamaShinyLayer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LlamaRenderer;

public class ShinyLlamaRenderer extends LlamaRenderer
{
    public ShinyLlamaRenderer(EntityRendererProvider.Context context, ModelLayerLocation model) {
        super(context, model);
        addLayer(new LlamaShinyLayer(this));
    }
}
