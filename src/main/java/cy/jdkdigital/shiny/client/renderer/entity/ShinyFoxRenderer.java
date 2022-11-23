package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.FoxShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.FoxRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Fox;
import org.jetbrains.annotations.NotNull;

public class ShinyFoxRenderer extends FoxRenderer
{
    private static final ResourceLocation RED_FOX_TEXTURE = new ResourceLocation(ShinyMod.MODID, "textures/entity/fox/fox.png");
    private static final ResourceLocation RED_FOX_SLEEP_TEXTURE = new ResourceLocation(ShinyMod.MODID, "textures/entity/fox/fox_sleep.png");
    private static final ResourceLocation SNOW_FOX_TEXTURE = new ResourceLocation(ShinyMod.MODID, "textures/entity/fox/snow_fox.png");
    private static final ResourceLocation SNOW_FOX_SLEEP_TEXTURE = new ResourceLocation(ShinyMod.MODID, "textures/entity/fox/snow_fox_sleep.png");

    public ShinyFoxRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new FoxShinyLayer(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(Fox entity) {
        if (entity.getFoxType() == Fox.Type.RED) {
            return entity.isSleeping() ? RED_FOX_SLEEP_TEXTURE : RED_FOX_TEXTURE;
        } else {
            return entity.isSleeping() ? SNOW_FOX_SLEEP_TEXTURE : SNOW_FOX_TEXTURE;
        }
    }
}
