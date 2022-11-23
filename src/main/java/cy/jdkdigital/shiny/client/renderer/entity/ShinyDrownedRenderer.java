package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.DrownedShinyLayer;
import net.minecraft.client.renderer.entity.DrownedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Zombie;
import org.jetbrains.annotations.NotNull;

public class ShinyDrownedRenderer extends DrownedRenderer
{
    private static final ResourceLocation DROWNED_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/zombie/drowned.png");

    public ShinyDrownedRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new DrownedShinyLayer(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(Zombie entity) {
        return DROWNED_LOCATION;
    }
}
