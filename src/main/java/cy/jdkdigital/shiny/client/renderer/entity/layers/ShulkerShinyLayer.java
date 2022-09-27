package cy.jdkdigital.shiny.client.renderer.entity.layers;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.ShulkerModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Shulker;

public class ShulkerShinyLayer extends RenderLayer<Shulker, ShulkerModel<Shulker>>
{
    private static final RenderType SHINE = RenderType.eyes(new ResourceLocation("textures/" + Sheets.DEFAULT_SHULKER_TEXTURE_LOCATION.texture().getPath() + ".png"));
    private static final RenderType[] SHINE_COLOR = Sheets.SHULKER_TEXTURE_LOCATION.stream().map((material) -> RenderType.eyes(new ResourceLocation("textures/" + material.texture().getPath() + ".png"))).toArray(RenderType[]::new);

    public ShulkerShinyLayer(RenderLayerParent<Shulker, ShulkerModel<Shulker>> renderer) {
        super(renderer);
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource bufferSource, int packedLightIn, Shulker entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        VertexConsumer vertexconsumer = bufferSource.getBuffer(entity.getColor() != null ? SHINE_COLOR[entity.getColor().getId()] : SHINE);
        this.getParentModel().renderToBuffer(poseStack, vertexconsumer, 15728640, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
    }
}
