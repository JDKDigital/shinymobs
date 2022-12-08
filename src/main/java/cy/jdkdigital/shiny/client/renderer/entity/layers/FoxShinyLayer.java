package cy.jdkdigital.shiny.client.renderer.entity.layers;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import cy.jdkdigital.shiny.ShinyMod;
import net.minecraft.client.model.FoxModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Fox;

public class FoxShinyLayer extends RenderLayer<Fox, FoxModel<Fox>>
{
    private static final RenderType RED_FOX_TEXTURE = RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/fox/fox.png"));
    private static final RenderType RED_FOX_SLEEP_TEXTURE = RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/fox/fox_sleep.png"));
    private static final RenderType SNOW_FOX_TEXTURE = RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/fox/snow_fox.png"));
    private static final RenderType SNOW_FOX_SLEEP_TEXTURE = RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/fox/snow_fox_sleep.png"));

    public FoxShinyLayer(RenderLayerParent<Fox, FoxModel<Fox>> renderer) {
        super(renderer);
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource bufferSource, int packedLightIn, Fox entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        if (!entity.isInvisible()) {
            VertexConsumer vertexconsumer = bufferSource.getBuffer(entity.isSleeping() ? SNOW_FOX_SLEEP_TEXTURE : SNOW_FOX_TEXTURE);
            if (entity.getFoxType() == Fox.Type.RED) {
                vertexconsumer = bufferSource.getBuffer(entity.isSleeping() ? RED_FOX_SLEEP_TEXTURE : RED_FOX_TEXTURE);
            }
            this.getParentModel().renderToBuffer(poseStack, vertexconsumer, 15728640, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        }
    }
}
