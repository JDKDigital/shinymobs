package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.StriderShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.StriderRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Strider;
import org.jetbrains.annotations.NotNull;

public class ShinyStriderRenderer extends StriderRenderer
{
    private static final ResourceLocation STRIDER_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/strider/strider.png");
    private static final ResourceLocation COLD_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/strider/strider_cold.png");

    public ShinyStriderRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new StriderShinyLayer(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(Strider entity) {
        return entity.isSuffocating() ? COLD_LOCATION : STRIDER_LOCATION;
    }
}
