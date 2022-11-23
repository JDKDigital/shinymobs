package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.GoatShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.GoatRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.goat.Goat;
import org.jetbrains.annotations.NotNull;

public class ShinyGoatRenderer extends GoatRenderer
{
    private static final ResourceLocation GOAT_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/goat/goat.png");

    public ShinyGoatRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new GoatShinyLayer(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(Goat entity) {
        return GOAT_LOCATION;
    }
}
