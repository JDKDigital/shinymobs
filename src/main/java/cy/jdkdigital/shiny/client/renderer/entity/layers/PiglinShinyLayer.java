package cy.jdkdigital.shiny.client.renderer.entity.layers;

import com.google.common.collect.ImmutableMap;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.init.ModEntities;
import net.minecraft.client.model.PiglinModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;

import java.util.Map;

public class PiglinShinyLayer extends RenderLayer<Mob, PiglinModel<Mob>>
{
    private static final Map<EntityType<?>, RenderType> SHINE = ImmutableMap.of(
            ModEntities.PIGLIN.get(), RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/piglin/piglin.png")),
            ModEntities.ZOMBIFIED_PIGLIN.get(), RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/piglin/zombified_piglin.png")),
            ModEntities.PIGLIN_BRUTE.get(), RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/piglin/piglin_brute.png"))
    );

    public PiglinShinyLayer(RenderLayerParent<Mob, PiglinModel<Mob>> renderer) {
        super(renderer);
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource bufferSource, int packedLightIn, Mob entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        if (!entity.isInvisible()) {
            VertexConsumer vertexconsumer = bufferSource.getBuffer(SHINE.get(entity.getType()));
            this.getParentModel().renderToBuffer(poseStack, vertexconsumer, 15728640, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        }
    }
}
