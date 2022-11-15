package cy.jdkdigital.shiny.client.renderer.entity.layers;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.WolfModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Wolf;

public class WolfShinyLayer extends RenderLayer<Wolf, WolfModel<Wolf>>
{
    private static final RenderType SHINE = RenderType.eyes(new ResourceLocation("textures/entity/wolf/wolf.png"));
    private static final RenderType SHINE_TAME = RenderType.eyes(new ResourceLocation("textures/entity/wolf/wolf_tame.png"));
    private static final RenderType SHINE_ANGRY = RenderType.eyes(new ResourceLocation("textures/entity/wolf/wolf_angry.png"));

    public WolfShinyLayer(RenderLayerParent<Wolf, WolfModel<Wolf>> renderer) {
        super(renderer);
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource bufferSource, int packedLightIn, Wolf entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        VertexConsumer vertexconsumer = bufferSource.getBuffer(entity.isTame() ? SHINE_TAME : (entity.isAngry() ? SHINE_ANGRY : SHINE));
        this.getParentModel().renderToBuffer(poseStack, vertexconsumer, 15728640, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
    }
}
