package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.ChickenShinyLayer;
import net.minecraft.client.renderer.entity.ChickenRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Chicken;
import org.jetbrains.annotations.NotNull;

public class ShinyChickenRenderer extends ChickenRenderer
{
    private static final ResourceLocation CHICKEN_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/chicken.png");

    public ShinyChickenRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new ChickenShinyLayer(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(Chicken entity) {
        return CHICKEN_LOCATION;
    }
}
