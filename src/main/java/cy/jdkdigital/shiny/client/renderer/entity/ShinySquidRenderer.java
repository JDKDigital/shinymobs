package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.SquidShinyLayer;
import net.minecraft.client.model.SquidModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.SquidRenderer;
import net.minecraft.world.entity.animal.Squid;

public class ShinySquidRenderer extends SquidRenderer<Squid>
{
    public ShinySquidRenderer(EntityRendererProvider.Context context, SquidModel<Squid> model) {
        super(context, model);
        addLayer(new SquidShinyLayer(this));
    }
}
