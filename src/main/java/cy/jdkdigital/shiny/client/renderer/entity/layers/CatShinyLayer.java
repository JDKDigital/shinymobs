package cy.jdkdigital.shiny.client.renderer.entity.layers;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import cy.jdkdigital.shiny.ShinyMod;
import net.minecraft.Util;
import net.minecraft.client.model.CatModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Cat;

import java.util.Map;

public class CatShinyLayer extends RenderLayer<Cat, CatModel<Cat>>
{
    private static final Map<Integer, RenderType> SHINE = Util.make(Maps.newHashMap(), (map) -> {
        map.put(0, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/cat/tabby.png")));
        map.put(1, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/cat/black.png")));
        map.put(2, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/cat/red.png")));
        map.put(3, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/cat/siamese.png")));
        map.put(4, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/cat/british_shorthair.png")));
        map.put(5, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/cat/calico.png")));
        map.put(6, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/cat/persian.png")));
        map.put(7, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/cat/ragdoll.png")));
        map.put(8, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/cat/white.png")));
        map.put(9, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/cat/jellie.png")));
        map.put(10, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/cat/all_black.png")));
    });

    public CatShinyLayer(RenderLayerParent<Cat, CatModel<Cat>> renderer) {
        super(renderer);
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource bufferSource, int packedLightIn, Cat entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        if (!entity.isInvisible()) {
            VertexConsumer vertexconsumer = bufferSource.getBuffer(SHINE.getOrDefault(entity.getCatVariant(), SHINE.get(0)));
            this.getParentModel().renderToBuffer(poseStack, vertexconsumer, 15728640, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        }
    }
}
