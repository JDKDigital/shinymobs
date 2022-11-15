package cy.jdkdigital.shiny.client.renderer.entity.layers;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.model.FrogModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.frog.Frog;

import java.util.Map;

public class FrogShinyLayer extends RenderLayer<Frog, FrogModel<Frog>>
{
    private static final Map<String, RenderType> SHINE = Util.make(Maps.newHashMap(), (map) -> {
        map.put("temperate", RenderType.eyes(new ResourceLocation("textures/entity/frog/temperate_frog.png")));
        map.put("warm", RenderType.eyes(new ResourceLocation("textures/entity/frog/warm_frog.png")));
        map.put("cold", RenderType.eyes(new ResourceLocation("textures/entity/frog/cold_frog.png")));
    });

    public FrogShinyLayer(RenderLayerParent<Frog, FrogModel<Frog>> renderer) {
        super(renderer);
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource bufferSource, int packedLightIn, Frog entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        VertexConsumer vertexconsumer = bufferSource.getBuffer(SHINE.getOrDefault(entity.getVariant().toString(), SHINE.get("temperate")));
        this.getParentModel().renderToBuffer(poseStack, vertexconsumer, 15728640, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
    }
}
