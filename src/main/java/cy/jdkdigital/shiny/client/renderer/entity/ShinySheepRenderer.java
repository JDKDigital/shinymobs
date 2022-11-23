package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.SheepShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.SheepRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Sheep;

public class ShinySheepRenderer extends SheepRenderer
{
    private static final ResourceLocation SHEEP_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/sheep/sheep.png");

    public ShinySheepRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new SheepShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(Sheep p_115840_) {
        return SHEEP_LOCATION;
    }
}
