package cy.jdkdigital.shiny.client.renderer.entity.layers;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.ChatFormatting;
import net.minecraft.client.model.RabbitModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Rabbit;

public class RabbitShinyLayer extends RenderLayer<Rabbit, RabbitModel<Rabbit>>
{
    private static final RenderType RABBIT_BROWN_LOCATION = RenderType.eyes(new ResourceLocation("textures/entity/rabbit/brown.png"));
    private static final RenderType RABBIT_WHITE_LOCATION = RenderType.eyes(new ResourceLocation("textures/entity/rabbit/white.png"));
    private static final RenderType RABBIT_BLACK_LOCATION = RenderType.eyes(new ResourceLocation("textures/entity/rabbit/black.png"));
    private static final RenderType RABBIT_GOLD_LOCATION = RenderType.eyes(new ResourceLocation("textures/entity/rabbit/gold.png"));
    private static final RenderType RABBIT_SALT_LOCATION = RenderType.eyes(new ResourceLocation("textures/entity/rabbit/salt.png"));
    private static final RenderType RABBIT_WHITE_SPLOTCHED_LOCATION = RenderType.eyes(new ResourceLocation("textures/entity/rabbit/white_splotched.png"));
    private static final RenderType RABBIT_TOAST_LOCATION = RenderType.eyes(new ResourceLocation("textures/entity/rabbit/toast.png"));
    private static final RenderType RABBIT_EVIL_LOCATION = RenderType.eyes(new ResourceLocation("textures/entity/rabbit/caerbannog.png"));

    public RabbitShinyLayer(RenderLayerParent<Rabbit, RabbitModel<Rabbit>> renderer) {
        super(renderer);
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource bufferSource, int packedLightIn, Rabbit entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        VertexConsumer vertexconsumer;

        String s = ChatFormatting.stripFormatting(entity.getName().getString());
        if ("Toast".equals(s)) {
            vertexconsumer = bufferSource.getBuffer(RABBIT_TOAST_LOCATION);
        } else {
            switch(entity.getRabbitType()) {
                case 0:
                default:
                    vertexconsumer = bufferSource.getBuffer(RABBIT_BROWN_LOCATION);
                    break;
                case 1:
                    vertexconsumer = bufferSource.getBuffer(RABBIT_WHITE_LOCATION);
                    break;
                case 2:
                    vertexconsumer = bufferSource.getBuffer(RABBIT_BLACK_LOCATION);
                    break;
                case 3:
                    vertexconsumer = bufferSource.getBuffer(RABBIT_WHITE_SPLOTCHED_LOCATION);
                    break;
                case 4:
                    vertexconsumer = bufferSource.getBuffer(RABBIT_GOLD_LOCATION);
                    break;
                case 5:
                    vertexconsumer = bufferSource.getBuffer(RABBIT_SALT_LOCATION);
                    break;
                case 99:
                    vertexconsumer = bufferSource.getBuffer(RABBIT_EVIL_LOCATION);
                    break;
            }
        }

        this.getParentModel().renderToBuffer(poseStack, vertexconsumer, 15728640, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
    }
}
