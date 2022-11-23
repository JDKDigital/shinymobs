package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.BlazeShinyLayer;
import net.minecraft.client.renderer.entity.BlazeRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Blaze;
import org.jetbrains.annotations.NotNull;

public class ShinyBlazeRenderer extends BlazeRenderer
{
    private static final ResourceLocation BLAZE_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/blaze.png");

    public ShinyBlazeRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new BlazeShinyLayer(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(Blaze entity) {
        return BLAZE_LOCATION;
    }
}
