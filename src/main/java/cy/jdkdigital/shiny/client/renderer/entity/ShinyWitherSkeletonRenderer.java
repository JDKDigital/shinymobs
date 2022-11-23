package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.WitherSkeletonShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.WitherSkeletonRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.AbstractSkeleton;

public class ShinyWitherSkeletonRenderer extends WitherSkeletonRenderer
{
    private static final ResourceLocation WITHER_SKELETON_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/skeleton/wither_skeleton.png");

    public ShinyWitherSkeletonRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new WitherSkeletonShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(AbstractSkeleton p_116458_) {
        return WITHER_SKELETON_LOCATION;
    }
}
