package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.PolarBearShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.PolarBearRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.PolarBear;

public class ShinyPolarBearRenderer extends PolarBearRenderer
{
    private static final ResourceLocation BEAR_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/bear/polarbear.png");

    public ShinyPolarBearRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new PolarBearShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(PolarBear p_115732_) {
        return BEAR_LOCATION;
    }
}
