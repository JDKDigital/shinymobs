package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.GlowSquidShinyLayer;
import net.minecraft.client.model.SquidModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.GlowSquidRenderer;
import net.minecraft.world.entity.GlowSquid;

public class ShinyGlowSquidRenderer extends GlowSquidRenderer
{
    public ShinyGlowSquidRenderer(EntityRendererProvider.Context context, SquidModel<GlowSquid> model) {
        super(context, model);
        addLayer(new GlowSquidShinyLayer(this));
    }
}
