package cy.jdkdigital.shiny.client.renderer.entity.layers;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import cy.jdkdigital.shiny.ShinyMod;
import net.minecraft.client.model.LlamaModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.horse.Llama;

import java.util.HashMap;
import java.util.Map;

public class LlamaShinyLayer extends RenderLayer<Llama, LlamaModel<Llama>>
{
    private static final Map<Llama.Variant, RenderType> SHINE = new HashMap<>()
    {{
        put(Llama.Variant.CREAMY, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/llama/creamy.png")));
        put(Llama.Variant.WHITE, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/llama/white.png")));
        put(Llama.Variant.BROWN, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/llama/brown.png")));
        put(Llama.Variant.GRAY, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/llama/gray.png")));
    }};

    public LlamaShinyLayer(RenderLayerParent<Llama, LlamaModel<Llama>> renderer) {
        super(renderer);
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource bufferSource, int packedLightIn, Llama entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        if (!entity.isInvisible()) {
            VertexConsumer vertexconsumer = bufferSource.getBuffer(SHINE.get(entity.getVariant()));
            this.getParentModel().renderToBuffer(poseStack, vertexconsumer, 15728640, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        }
    }
}
