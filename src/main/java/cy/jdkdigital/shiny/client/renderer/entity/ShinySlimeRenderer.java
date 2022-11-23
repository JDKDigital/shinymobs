package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.SlimeShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.SlimeRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Slime;

public class ShinySlimeRenderer extends SlimeRenderer
{
    private static final ResourceLocation SLIME_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/slime/slime.png");

    public ShinySlimeRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new SlimeShinyLayer(this, context.getModelSet()));
    }

    public ResourceLocation getTextureLocation(Slime p_115974_) {
        return SLIME_LOCATION;
    }
}
