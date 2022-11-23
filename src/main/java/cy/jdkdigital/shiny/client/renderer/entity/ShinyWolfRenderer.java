package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.WolfShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.WolfRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Wolf;

public class ShinyWolfRenderer extends WolfRenderer
{
    private static final ResourceLocation WOLF_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/wolf/wolf.png");
    private static final ResourceLocation WOLF_TAME_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/wolf/wolf_tame.png");
    private static final ResourceLocation WOLF_ANGRY_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/wolf/wolf_angry.png");

    public ShinyWolfRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new WolfShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(Wolf p_116526_) {
        if (p_116526_.isTame()) {
            return WOLF_TAME_LOCATION;
        } else {
            return p_116526_.isAngry() ? WOLF_ANGRY_LOCATION : WOLF_LOCATION;
        }
    }
}
