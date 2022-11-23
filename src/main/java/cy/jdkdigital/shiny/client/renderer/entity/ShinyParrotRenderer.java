package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.ParrotShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ParrotRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Parrot;
import org.jetbrains.annotations.NotNull;

public class ShinyParrotRenderer extends ParrotRenderer
{
    public static final ResourceLocation[] PARROT_LOCATIONS = new ResourceLocation[]{
            new ResourceLocation(ShinyMod.MODID, "textures/entity/parrot/parrot_red_blue.png"),
            new ResourceLocation(ShinyMod.MODID, "textures/entity/parrot/parrot_blue.png"),
            new ResourceLocation(ShinyMod.MODID, "textures/entity/parrot/parrot_green.png"),
            new ResourceLocation(ShinyMod.MODID, "textures/entity/parrot/parrot_yellow_blue.png"),
            new ResourceLocation(ShinyMod.MODID, "textures/entity/parrot/parrot_grey.png")
    };

    public ShinyParrotRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new ParrotShinyLayer(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(Parrot entity) {
        return PARROT_LOCATIONS[entity.getVariant()];
    }
}
