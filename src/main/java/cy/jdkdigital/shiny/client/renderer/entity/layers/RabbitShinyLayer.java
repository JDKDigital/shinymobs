package cy.jdkdigital.shiny.client.renderer.entity.layers;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import cy.jdkdigital.shiny.ShinyMod;
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
    private static final RenderType RABBIT_BROWN_LOCATION = RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/rabbit/brown.png"));
    private static final RenderType RABBIT_WHITE_LOCATION = RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/rabbit/white.png"));
    private static final RenderType RABBIT_BLACK_LOCATION = RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/rabbit/black.png"));
    private static final RenderType RABBIT_GOLD_LOCATION = RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/rabbit/gold.png"));
    private static final RenderType RABBIT_SALT_LOCATION = RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/rabbit/salt.png"));
    private static final RenderType RABBIT_WHITE_SPLOTCHED_LOCATION = RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/rabbit/white_splotched.png"));
    private static final RenderType RABBIT_TOAST_LOCATION = RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/rabbit/toast.png"));
    private static final RenderType RABBIT_EVIL_LOCATION = RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/rabbit/caerbannog.png"));

    public RabbitShinyLayer(RenderLayerParent<Rabbit, RabbitModel<Rabbit>> renderer) {
        super(renderer);
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource bufferSource, int packedLightIn, Rabbit entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        if (!entity.isInvisible()) {
            VertexConsumer vertexconsumer;

            String s = ChatFormatting.stripFormatting(entity.getName().getString());
            if ("Toast".equals(s)) {
                vertexconsumer = bufferSource.getBuffer(RABBIT_TOAST_LOCATION);
            } else {
                vertexconsumer = switch (entity.getVariant()) {
                    case WHITE -> bufferSource.getBuffer(RABBIT_WHITE_LOCATION);
                    case BLACK -> bufferSource.getBuffer(RABBIT_BLACK_LOCATION);
                    case WHITE_SPLOTCHED -> bufferSource.getBuffer(RABBIT_WHITE_SPLOTCHED_LOCATION);
                    case GOLD -> bufferSource.getBuffer(RABBIT_GOLD_LOCATION);
                    case SALT -> bufferSource.getBuffer(RABBIT_SALT_LOCATION);
                    case EVIL -> bufferSource.getBuffer(RABBIT_EVIL_LOCATION);
                    default -> bufferSource.getBuffer(RABBIT_BROWN_LOCATION);
                };
            }

            this.getParentModel().renderToBuffer(poseStack, vertexconsumer, 15728640, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        }
    }
}
