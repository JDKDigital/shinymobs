package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.HuskShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HuskRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Zombie;

public class ShinyHuskRenderer extends HuskRenderer
{
    private static final ResourceLocation HUSK_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/zombie/husk.png");

    public ShinyHuskRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new HuskShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(Zombie p_114905_) {
        return HUSK_LOCATION;
    }
}
