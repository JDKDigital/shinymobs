package cy.jdkdigital.shiny.client.renderer.entity.layers;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SquidModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.GlowSquid;

public class GlowSquidShinyLayer extends RenderLayer<GlowSquid, SquidModel<GlowSquid>>
{
    private static final RenderType SHINE = RenderType.eyes(new ResourceLocation("textures/entity/squid/glow_squid.png"));

    public GlowSquidShinyLayer(RenderLayerParent<GlowSquid, SquidModel<GlowSquid>> renderer) {
        super(renderer);
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource bufferSource, int packedLightIn, GlowSquid entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        VertexConsumer vertexconsumer = bufferSource.getBuffer(SHINE);
        this.getParentModel().renderToBuffer(poseStack, vertexconsumer, 15728640, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
    }
}
