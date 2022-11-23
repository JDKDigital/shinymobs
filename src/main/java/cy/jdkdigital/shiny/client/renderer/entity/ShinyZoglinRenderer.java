package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.ZoglinShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ZoglinRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Zoglin;

public class ShinyZoglinRenderer extends ZoglinRenderer
{
    private static final ResourceLocation ZOGLIN_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/hoglin/zoglin.png");

    public ShinyZoglinRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new ZoglinShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(Zoglin p_116544_) {
        return ZOGLIN_LOCATION;
    }
}
