package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.WitchShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.WitchRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Witch;

public class ShinyWitchRenderer extends WitchRenderer
{
    private static final ResourceLocation WITCH_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/witch.png");

    public ShinyWitchRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new WitchShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(Witch p_116410_) {
        return WITCH_LOCATION;
    }
}
