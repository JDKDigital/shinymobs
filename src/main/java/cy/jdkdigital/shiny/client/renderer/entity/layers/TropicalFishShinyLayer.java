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

import java.util.HashMap;
import java.util.Map;

public class TropicalFishShinyLayer extends RenderLayer<TropicalFish, ColorableHierarchicalModel<TropicalFish>>
{
    private final TropicalFishModelA<TropicalFish> modelA;
    private final TropicalFishModelB<TropicalFish> modelB;
    private static final Map<TropicalFish.Pattern, RenderType> SHINE = new HashMap<>()
    {{
        put(TropicalFish.Pattern.KOB, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/fish/tropical_a_pattern_1.png")));
        put(TropicalFish.Pattern.SUNSTREAK, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/fish/tropical_a_pattern_2.png")));
        put(TropicalFish.Pattern.SNOOPER, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/fish/tropical_a_pattern_3.png")));
        put(TropicalFish.Pattern.DASHER, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/fish/tropical_a_pattern_4.png")));
        put(TropicalFish.Pattern.BRINELY, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/fish/tropical_a_pattern_5.png")));
        put(TropicalFish.Pattern.SPOTTY, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/fish/tropical_a_pattern_6.png")));
        put(TropicalFish.Pattern.FLOPPER, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/fish/tropical_b_pattern_1.png")));
        put(TropicalFish.Pattern.STRIPEY, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/fish/tropical_b_pattern_2.png")));
        put(TropicalFish.Pattern.GLITTER, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/fish/tropical_b_pattern_3.png")));
        put(TropicalFish.Pattern.BLOCKFISH, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/fish/tropical_b_pattern_4.png")));
        put(TropicalFish.Pattern.BETTY, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/fish/tropical_b_pattern_5.png")));
        put(TropicalFish.Pattern.CLAYFISH, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/fish/tropical_b_pattern_6.png")));
    }};

    public TropicalFishShinyLayer(RenderLayerParent<TropicalFish, ColorableHierarchicalModel<TropicalFish>> renderer, EntityModelSet modelSet) {
        super(renderer);
        this.modelA = new TropicalFishModelA<>(modelSet.bakeLayer(ModelLayers.TROPICAL_FISH_SMALL_PATTERN));
        this.modelB = new TropicalFishModelB<>(modelSet.bakeLayer(ModelLayers.TROPICAL_FISH_LARGE_PATTERN));
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource bufferSource, int packedLightIn, TropicalFish entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        if (!entity.isInvisible()) {
            VertexConsumer vertexconsumer = bufferSource.getBuffer(SHINE.get(entity.getVariant()));
            EntityModel<TropicalFish> entityModel = entity.getVariant().base().equals(TropicalFish.Base.SMALL) ? this.modelA : this.modelB;
            this.getParentModel().copyPropertiesTo(entityModel);
            entityModel.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
            entityModel.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            float[] afloat = entity.getPatternColor().getTextureDiffuseColors();
            entityModel.renderToBuffer(poseStack, vertexconsumer, 15728640, OverlayTexture.NO_OVERLAY, afloat[0], afloat[1], afloat[2], 1.0F);
        }
    }

    private static int getPatternVariant(int p_30065_) {
        return Math.min((p_30065_ & '\uff00') >> 8, 5);
    }
}
