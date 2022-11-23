package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.DolphinShinyLayer;
import net.minecraft.client.renderer.entity.DolphinRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Dolphin;
import org.jetbrains.annotations.NotNull;

public class ShinyDolphinRenderer extends DolphinRenderer
{
    private static final ResourceLocation DOLPHIN_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/dolphin.png");

    public ShinyDolphinRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new DolphinShinyLayer(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(Dolphin entity) {
        return DOLPHIN_LOCATION;
    }
}
