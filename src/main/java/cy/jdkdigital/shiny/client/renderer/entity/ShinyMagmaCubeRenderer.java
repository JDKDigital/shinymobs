package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.MagmaCubeShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MagmaCubeRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.MagmaCube;

public class ShinyMagmaCubeRenderer extends MagmaCubeRenderer
{
    private static final ResourceLocation MAGMACUBE_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/slime/magmacube.png");

    public ShinyMagmaCubeRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new MagmaCubeShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(MagmaCube p_115393_) {
        return MAGMACUBE_LOCATION;
    }
}
