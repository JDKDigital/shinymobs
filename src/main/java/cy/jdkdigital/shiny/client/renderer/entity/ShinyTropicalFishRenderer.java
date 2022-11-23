package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.TropicalFishShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.TropicalFishRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.TropicalFish;

public class ShinyTropicalFishRenderer extends TropicalFishRenderer
{
    private static final ResourceLocation[] BASE_TEXTURE_LOCATIONS = new ResourceLocation[]{
            new ResourceLocation(ShinyMod.MODID, "textures/entity/fish/tropical_a.png"),
            new ResourceLocation(ShinyMod.MODID, "textures/entity/fish/tropical_b.png")
    };

    public ShinyTropicalFishRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new TropicalFishShinyLayer(this, context.getModelSet()));
    }

    public ResourceLocation getTextureLocation(TropicalFish entity) {
        return BASE_TEXTURE_LOCATIONS[TropicalFish.getBaseVariant(entity.getVariant())];
    }
}
