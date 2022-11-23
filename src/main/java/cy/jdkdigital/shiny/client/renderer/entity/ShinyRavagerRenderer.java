package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.RavagerShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.RavagerRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Ravager;

public class ShinyRavagerRenderer extends RavagerRenderer
{
    private static final ResourceLocation TEXTURE_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/illager/ravager.png");

    public ShinyRavagerRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new RavagerShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(Ravager p_115811_) {
        return TEXTURE_LOCATION;
    }
}
