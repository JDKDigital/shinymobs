package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.IronGolemShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.IronGolemRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.IronGolem;

public class ShinyIronGolemRenderer extends IronGolemRenderer
{
    private static final ResourceLocation GOLEM_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/iron_golem/iron_golem.png");

    public ShinyIronGolemRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new IronGolemShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(IronGolem p_115012_) {
        return GOLEM_LOCATION;
    }
}
