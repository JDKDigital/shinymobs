package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.PhantomShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.PhantomRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Phantom;

public class ShinyPhantomRenderer extends PhantomRenderer
{
    private static final ResourceLocation PHANTOM_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/phantom.png");

    public ShinyPhantomRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new PhantomShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(Phantom entity) {
        return PHANTOM_LOCATION;
    }
}
