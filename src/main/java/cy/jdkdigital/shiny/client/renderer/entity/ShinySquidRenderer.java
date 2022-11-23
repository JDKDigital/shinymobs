package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.SquidShinyLayer;
import net.minecraft.client.model.SquidModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.SquidRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Squid;

public class ShinySquidRenderer extends SquidRenderer<Squid>
{
    private static final ResourceLocation SQUID_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/squid/squid.png");

    public ShinySquidRenderer(EntityRendererProvider.Context context, SquidModel<Squid> model) {
        super(context, model);
        addLayer(new SquidShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(Squid p_116030_) {
        return SQUID_LOCATION;
    }
}
