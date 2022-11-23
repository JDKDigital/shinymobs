package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.SkeletonShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.SkeletonRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.AbstractSkeleton;

public class ShinySkeletonRenderer extends SkeletonRenderer
{
    private static final ResourceLocation SKELETON_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/skeleton/skeleton.png");

    public ShinySkeletonRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new SkeletonShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(AbstractSkeleton p_115941_) {
        return SKELETON_LOCATION;
    }
}
