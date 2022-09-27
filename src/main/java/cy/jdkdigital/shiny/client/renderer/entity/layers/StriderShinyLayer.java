package cy.jdkdigital.shiny.client.renderer.entity.layers;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.StriderModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Strider;

public class StriderShinyLayer extends RenderLayer<Strider, StriderModel<Strider>>
{
    private static final RenderType SHINE = RenderType.eyes(new ResourceLocation("textures/entity/strider/strider.png"));
    private static final RenderType SHINE_COLD = RenderType.eyes(new ResourceLocation("textures/entity/strider/strider_cold.png"));

    public StriderShinyLayer(RenderLayerParent<Strider, StriderModel<Strider>> renderer) {
        super(renderer);
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource bufferSource, int packedLightIn, Strider entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        VertexConsumer vertexconsumer = bufferSource.getBuffer(entity.isSuffocating() ? SHINE_COLD : SHINE);
        this.getParentModel().renderToBuffer(poseStack, vertexconsumer, 15728640, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
    }
}
