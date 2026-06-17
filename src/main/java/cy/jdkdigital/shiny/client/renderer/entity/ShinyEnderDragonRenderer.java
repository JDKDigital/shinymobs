package cy.jdkdigital.shiny.client.renderer.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import cy.jdkdigital.shiny.init.ShinyAttachments;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EnderDragonRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;

public class ShinyEnderDragonRenderer extends EnderDragonRenderer
{
    private static final RenderType SHINY = RenderType.eyes(ResourceLocation.withDefaultNamespace("textures/entity/enderdragon/dragon.png"));
    private static final int FULL_BRIGHT = 15728640;

    private final EnderDragonRenderer.DragonModel shinyModel;

    public ShinyEnderDragonRenderer(EntityRendererProvider.Context context) {
        super(context);
        this.shinyModel = new EnderDragonRenderer.DragonModel(context.bakeLayer(ModelLayers.ENDER_DRAGON));
    }

    @Override
    public void render(EnderDragon entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
        if (!entity.getData(ShinyAttachments.SHINY.get()) || entity.isInvisible() || entity.dragonDeathTime > 0) {
            return;
        }
        poseStack.pushPose();
        float f = (float) entity.getLatencyPos(7, partialTicks)[0];
        float f1 = (float) (entity.getLatencyPos(5, partialTicks)[1] - entity.getLatencyPos(10, partialTicks)[1]);
        poseStack.mulPose(Axis.YP.rotationDegrees(-f));
        poseStack.mulPose(Axis.XP.rotationDegrees(f1 * 10.0F));
        poseStack.translate(0.0F, 0.0F, 1.0F);
        poseStack.scale(-1.0F, -1.0F, 1.0F);
        poseStack.translate(0.0F, -1.501F, 0.0F);
        this.shinyModel.prepareMobModel(entity, 0.0F, 0.0F, partialTicks);
        this.shinyModel.renderToBuffer(poseStack, buffer.getBuffer(SHINY), FULL_BRIGHT, OverlayTexture.NO_OVERLAY);
        poseStack.popPose();
    }
}
