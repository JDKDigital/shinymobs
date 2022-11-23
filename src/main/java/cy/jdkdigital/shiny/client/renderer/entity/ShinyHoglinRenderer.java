package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.HoglinShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HoglinRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.hoglin.Hoglin;

public class ShinyHoglinRenderer extends HoglinRenderer
{
    private static final ResourceLocation HOGLIN_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/hoglin/hoglin.png");

    public ShinyHoglinRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new HoglinShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(Hoglin p_114862_) {
        return HOGLIN_LOCATION;
    }
}
