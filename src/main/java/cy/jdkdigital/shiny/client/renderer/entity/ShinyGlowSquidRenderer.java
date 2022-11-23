package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.GlowSquidShinyLayer;
import net.minecraft.client.model.SquidModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.GlowSquidRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.GlowSquid;
import org.jetbrains.annotations.NotNull;

public class ShinyGlowSquidRenderer extends GlowSquidRenderer
{
    private static final ResourceLocation GLOW_SQUID_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/squid/glow_squid.png");

    public ShinyGlowSquidRenderer(EntityRendererProvider.Context context, SquidModel<GlowSquid> model) {
        super(context, model);
        addLayer(new GlowSquidShinyLayer(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(GlowSquid entity) {
        return GLOW_SQUID_LOCATION;
    }
}
