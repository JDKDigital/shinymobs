package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.client.renderer.entity.layers.OcelotShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.OcelotRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Ocelot;

public class ShinyOcelotRenderer extends OcelotRenderer
{
    private static final ResourceLocation CAT_OCELOT_LOCATION = new ResourceLocation("textures/entity/cat/ocelot.png");

    public ShinyOcelotRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new OcelotShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(Ocelot p_115524_) {
        return CAT_OCELOT_LOCATION;
    }
}
