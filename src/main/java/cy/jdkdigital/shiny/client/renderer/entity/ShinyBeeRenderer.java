package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.BeeShinyLayer;
import net.minecraft.client.renderer.entity.BeeRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Bee;
import org.jetbrains.annotations.NotNull;

public class ShinyBeeRenderer extends BeeRenderer
{
    private static final ResourceLocation ANGRY_BEE_TEXTURE = new ResourceLocation(ShinyMod.MODID, "textures/entity/bee/bee_angry.png");
    private static final ResourceLocation ANGRY_NECTAR_BEE_TEXTURE = new ResourceLocation(ShinyMod.MODID, "textures/entity/bee/bee_angry_nectar.png");
    private static final ResourceLocation BEE_TEXTURE = new ResourceLocation(ShinyMod.MODID, "textures/entity/bee/bee.png");
    private static final ResourceLocation NECTAR_BEE_TEXTURE = new ResourceLocation(ShinyMod.MODID, "textures/entity/bee/bee_nectar.png");

    public ShinyBeeRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new BeeShinyLayer(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(Bee entity) {
        if (entity.isAngry()) {
            return entity.hasNectar() ? ANGRY_NECTAR_BEE_TEXTURE : ANGRY_BEE_TEXTURE;
        } else {
            return entity.hasNectar() ? NECTAR_BEE_TEXTURE : BEE_TEXTURE;
        }
    }
}
