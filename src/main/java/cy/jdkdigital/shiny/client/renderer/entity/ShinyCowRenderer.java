package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.CowShinyLayer;
import net.minecraft.client.renderer.entity.CowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Cow;

public class ShinyCowRenderer extends CowRenderer
{
    private static final ResourceLocation COW_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/cow/cow.png");

    public ShinyCowRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new CowShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(Cow entity) {
        return COW_LOCATION;
    }
}
