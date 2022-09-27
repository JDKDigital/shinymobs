package cy.jdkdigital.shiny.client.renderer.entity.layers;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.model.HorseModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.entity.animal.horse.Variant;

import java.util.Map;

public class HorseShinyLayer extends RenderLayer<Horse, HorseModel<Horse>>
{
    private static final Map<Variant, RenderType> SHINE = Util.make(Maps.newEnumMap(Variant.class), (map) -> {
        map.put(Variant.WHITE, RenderType.eyes(new ResourceLocation("textures/entity/horse/horse_white.png")));
        map.put(Variant.CREAMY, RenderType.eyes(new ResourceLocation("textures/entity/horse/horse_creamy.png")));
        map.put(Variant.CHESTNUT, RenderType.eyes(new ResourceLocation("textures/entity/horse/horse_chestnut.png")));
        map.put(Variant.BROWN, RenderType.eyes(new ResourceLocation("textures/entity/horse/horse_brown.png")));
        map.put(Variant.BLACK, RenderType.eyes(new ResourceLocation("textures/entity/horse/horse_black.png")));
        map.put(Variant.GRAY, RenderType.eyes(new ResourceLocation("textures/entity/horse/horse_gray.png")));
        map.put(Variant.DARKBROWN, RenderType.eyes(new ResourceLocation("textures/entity/horse/horse_darkbrown.png")));
    });

    public HorseShinyLayer(RenderLayerParent<Horse, HorseModel<Horse>> renderer) {
        super(renderer);
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource bufferSource, int packedLightIn, Horse entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        VertexConsumer vertexconsumer = bufferSource.getBuffer(SHINE.get(entity.getVariant()));
        this.getParentModel().renderToBuffer(poseStack, vertexconsumer, 15728640, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
    }
}
