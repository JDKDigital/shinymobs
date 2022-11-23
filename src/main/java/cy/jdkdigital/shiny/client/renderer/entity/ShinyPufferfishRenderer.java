package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.PufferfishShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.PufferfishRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Pufferfish;

public class ShinyPufferfishRenderer extends PufferfishRenderer
{
    private static final ResourceLocation PUFFER_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/fish/pufferfish.png");

    public ShinyPufferfishRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new PufferfishShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(Pufferfish p_115775_) {
        return PUFFER_LOCATION;
    }
}
