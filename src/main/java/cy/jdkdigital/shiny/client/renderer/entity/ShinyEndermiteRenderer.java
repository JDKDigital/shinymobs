package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.EndermiteShinyLayer;
import net.minecraft.client.renderer.entity.EndermiteRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Endermite;
import org.jetbrains.annotations.NotNull;

public class ShinyEndermiteRenderer extends EndermiteRenderer
{
    private static final ResourceLocation ENDERMITE_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/endermite.png");

    public ShinyEndermiteRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new EndermiteShinyLayer(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(Endermite entity) {
        return ENDERMITE_LOCATION;
    }
}
