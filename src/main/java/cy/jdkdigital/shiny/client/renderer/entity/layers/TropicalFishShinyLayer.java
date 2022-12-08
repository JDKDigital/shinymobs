package cy.jdkdigital.shiny.client.renderer.entity.layers;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import cy.jdkdigital.shiny.ShinyMod;
import net.minecraft.client.model.ColorableHierarchicalModel;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.TropicalFishModelA;
import net.minecraft.client.model.TropicalFishModelB;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.TropicalFish;

public class TropicalFishShinyLayer extends RenderLayer<TropicalFish, ColorableHierarchicalModel<TropicalFish>>
{
    private final TropicalFishModelA<TropicalFish> modelA;
    private final TropicalFishModelB<TropicalFish> modelB;
    private static final RenderType[] SHINE_A = new RenderType[]{
            RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/fish/tropical_a_pattern_1.png")),
            RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/fish/tropical_a_pattern_2.png")),
            RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/fish/tropical_a_pattern_3.png")),
            RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/fish/tropical_a_pattern_4.png")),
            RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/fish/tropical_a_pattern_5.png")),
            RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/fish/tropical_a_pattern_6.png"))
    };
    private static final RenderType[] SHINE_B = new RenderType[]{
            RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/fish/tropical_b_pattern_1.png")),
            RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/fish/tropical_b_pattern_2.png")),
            RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/fish/tropical_b_pattern_3.png")),
            RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/fish/tropical_b_pattern_4.png")),
            RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/fish/tropical_b_pattern_5.png")),
            RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/fish/tropical_b_pattern_6.png"))
    };

    public TropicalFishShinyLayer(RenderLayerParent<TropicalFish, ColorableHierarchicalModel<TropicalFish>> renderer, EntityModelSet modelSet) {
        super(renderer);
        this.modelA = new TropicalFishModelA<>(modelSet.bakeLayer(ModelLayers.TROPICAL_FISH_SMALL_PATTERN));
        this.modelB = new TropicalFishModelB<>(modelSet.bakeLayer(ModelLayers.TROPICAL_FISH_LARGE_PATTERN));
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource bufferSource, int packedLightIn, TropicalFish entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        if (!entity.isInvisible()) {
            VertexConsumer vertexconsumer = bufferSource.getBuffer(TropicalFish.getBaseVariant(entity.getVariant()) == 0 ? SHINE_A[getPatternVariant(entity.getVariant())] : SHINE_B[getPatternVariant(entity.getVariant())]);
            EntityModel<TropicalFish> entityModel = entity.getBaseVariant() == 0 ? this.modelA : this.modelB;
            this.getParentModel().copyPropertiesTo(entityModel);
            entityModel.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
            entityModel.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            float[] afloat = entity.getPatternColor();
            entityModel.renderToBuffer(poseStack, vertexconsumer, 15728640, OverlayTexture.NO_OVERLAY, afloat[0], afloat[1], afloat[2], 1.0F);
        }
    }

    private static int getPatternVariant(int p_30065_) {
        return Math.min((p_30065_ & '\uff00') >> 8, 5);
    }
}
