package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.CodShinyLayer;
import net.minecraft.client.renderer.entity.CodRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Cod;
import org.jetbrains.annotations.NotNull;

public class ShinyCodRenderer extends CodRenderer
{
    private static final ResourceLocation COD_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/fish/cod.png");

    public ShinyCodRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new CodShinyLayer(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(Cod entity) {
        return COD_LOCATION;
    }
}
