package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.ArmorStandShinyLayer;
import net.minecraft.client.renderer.entity.ArmorStandRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.decoration.ArmorStand;
import org.jetbrains.annotations.NotNull;

public class ShinyArmorStandRenderer extends ArmorStandRenderer
{
    public static final ResourceLocation DEFAULT_SKIN_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/armorstand/wood.png");

    public ShinyArmorStandRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new ArmorStandShinyLayer(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(ArmorStand entity) {
        return DEFAULT_SKIN_LOCATION;
    }
}