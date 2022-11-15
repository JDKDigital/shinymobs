package cy.jdkdigital.shiny.client.renderer.entity.layers;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.model.PandaModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Panda;

import java.util.Map;

public class PandaShinyLayer extends RenderLayer<Panda, PandaModel<Panda>>
{
    private static final Map<Panda.Gene, RenderType> SHINE = Util.make(Maps.newEnumMap(Panda.Gene.class), (map) -> {
        map.put(Panda.Gene.NORMAL, RenderType.eyes(new ResourceLocation("textures/entity/panda/panda.png")));
        map.put(Panda.Gene.LAZY, RenderType.eyes(new ResourceLocation("textures/entity/panda/lazy_panda.png")));
        map.put(Panda.Gene.WORRIED, RenderType.eyes(new ResourceLocation("textures/entity/panda/worried_panda.png")));
        map.put(Panda.Gene.PLAYFUL, RenderType.eyes(new ResourceLocation("textures/entity/panda/playful_panda.png")));
        map.put(Panda.Gene.BROWN, RenderType.eyes(new ResourceLocation("textures/entity/panda/brown_panda.png")));
        map.put(Panda.Gene.WEAK, RenderType.eyes(new ResourceLocation("textures/entity/panda/weak_panda.png")));
        map.put(Panda.Gene.AGGRESSIVE, RenderType.eyes(new ResourceLocation("textures/entity/panda/aggressive_panda.png")));
    });

    public PandaShinyLayer(RenderLayerParent<Panda, PandaModel<Panda>> renderer) {
        super(renderer);
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource bufferSource, int packedLightIn, Panda entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        VertexConsumer vertexconsumer = bufferSource.getBuffer(SHINE.getOrDefault(entity.getVariant(), SHINE.get(Panda.Gene.NORMAL)));
        this.getParentModel().renderToBuffer(poseStack, vertexconsumer, 15728640, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
    }
}
