package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.GhastShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.GhastRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Ghast;
import org.jetbrains.annotations.NotNull;

public class ShinyGhastRenderer extends GhastRenderer
{
    private static final ResourceLocation GHAST_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/ghast/ghast.png");
    private static final ResourceLocation GHAST_SHOOTING_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/ghast/ghast_shooting.png");

    public ShinyGhastRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new GhastShinyLayer(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(Ghast entity) {
        return entity.isCharging() ? GHAST_SHOOTING_LOCATION : GHAST_LOCATION;
    }
}
