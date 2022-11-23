package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.SilverfishShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.SilverfishRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Silverfish;

public class ShinySilverfishRenderer extends SilverfishRenderer
{
    private static final ResourceLocation SILVERFISH_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/silverfish.png");

    public ShinySilverfishRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new SilverfishShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(Silverfish p_115929_) {
        return SILVERFISH_LOCATION;
    }
}
