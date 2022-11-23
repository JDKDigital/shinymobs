package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.SnowGolemShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.SnowGolemRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.SnowGolem;

public class ShinySnowGolemRenderer extends SnowGolemRenderer
{
    private static final ResourceLocation SNOW_GOLEM_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/snow_golem.png");

    public ShinySnowGolemRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new SnowGolemShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(SnowGolem p_115993_) {
        return SNOW_GOLEM_LOCATION;
    }
}
