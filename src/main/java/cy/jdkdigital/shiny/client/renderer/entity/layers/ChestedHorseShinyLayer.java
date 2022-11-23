package cy.jdkdigital.shiny.client.renderer.entity.layers;

import com.google.common.collect.ImmutableMap;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.init.ModEntities;
import net.minecraft.client.model.ChestedHorseModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.horse.AbstractChestedHorse;

import java.util.Map;

public class ChestedHorseShinyLayer<T extends AbstractChestedHorse> extends RenderLayer<T, ChestedHorseModel<T>>
{
    private static final Map<EntityType<?>, RenderType> SHINE = ImmutableMap.of(
        ModEntities.DONKEY.get(), RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/horse/donkey.png")),
        ModEntities.MULE.get(), RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/horse/mule.png"))
    );

    public ChestedHorseShinyLayer(RenderLayerParent<T, ChestedHorseModel<T>> renderer) {
        super(renderer);
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource bufferSource, int packedLightIn, T entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        VertexConsumer vertexconsumer = bufferSource.getBuffer(SHINE.get(entity.getType()));
        this.getParentModel().renderToBuffer(poseStack, vertexconsumer, 15728640, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
    }
}
