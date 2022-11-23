package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.SalmonShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.SalmonRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Salmon;

public class ShinySalmonRenderer extends SalmonRenderer
{
    private static final ResourceLocation SALMON_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/fish/salmon.png");

    public ShinySalmonRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new SalmonShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(Salmon p_115826_) {
        return SALMON_LOCATION;
    }
}
