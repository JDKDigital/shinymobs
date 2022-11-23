package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.VindicatorShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.VindicatorRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Vindicator;

public class ShinyVindicatorRenderer extends VindicatorRenderer
{
    private static final ResourceLocation VINDICATOR = new ResourceLocation(ShinyMod.MODID, "textures/entity/illager/vindicator.png");

    public ShinyVindicatorRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new VindicatorShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(Vindicator p_116324_) {
        return VINDICATOR;
    }
}
