package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.EndermanShinyLayer;
import net.minecraft.client.renderer.entity.EndermanRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.EnderMan;
import org.jetbrains.annotations.NotNull;

public class ShinyEndermanRenderer extends EndermanRenderer
{
    private static final ResourceLocation ENDERMAN_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/enderman/enderman.png");

    public ShinyEndermanRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new EndermanShinyLayer(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(EnderMan entity) {
        return ENDERMAN_LOCATION;
    }
}
