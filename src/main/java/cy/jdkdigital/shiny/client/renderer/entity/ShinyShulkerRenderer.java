package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.ShulkerShinyLayer;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ShulkerRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Shulker;
import net.minecraft.world.item.DyeColor;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class ShinyShulkerRenderer extends ShulkerRenderer
{
    private static final ResourceLocation DEFAULT_TEXTURE_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/" + Sheets.DEFAULT_SHULKER_TEXTURE_LOCATION.texture().getPath() + ".png");
    private static final ResourceLocation[] TEXTURE_LOCATION = Sheets.SHULKER_TEXTURE_LOCATION.stream().map((material) -> new ResourceLocation(ShinyMod.MODID, "textures/" + material.texture().getPath() + ".png")).toArray(ResourceLocation[]::new);

    public ShinyShulkerRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new ShulkerShinyLayer(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(Shulker entity) {
        return getTextureLocation(entity.getColor());
    }

    public static @NotNull ResourceLocation getTextureLocation(@Nullable DyeColor color) {
        return color == null ? DEFAULT_TEXTURE_LOCATION : TEXTURE_LOCATION[color.getId()];
    }
}
