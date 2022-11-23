package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.BatShinyLayer;
import net.minecraft.client.renderer.entity.BatRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ambient.Bat;
import org.jetbrains.annotations.NotNull;

public class ShinyBatRenderer extends BatRenderer
{
    private static final ResourceLocation BAT_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/bat.png");

    public ShinyBatRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new BatShinyLayer(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(Bat entity) {
        return BAT_LOCATION;
    }
}
