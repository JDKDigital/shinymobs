package cy.jdkdigital.shiny.client.renderer.entity.layers;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import cy.jdkdigital.shiny.ShinyMod;
import net.minecraft.client.model.ParrotModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Parrot;

import java.util.HashMap;
import java.util.Map;

public class ParrotShinyLayer extends RenderLayer<Parrot, ParrotModel>
{
    private static final Map<Parrot.Variant, RenderType> SHINE = new HashMap<>()
    {{
        put(Parrot.Variant.RED_BLUE, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/parrot/parrot_red_blue.png")));
        put(Parrot.Variant.BLUE, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/parrot/parrot_blue.png")));
        put(Parrot.Variant.GREEN, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/parrot/parrot_green.png")));
        put(Parrot.Variant.YELLOW_BLUE, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/parrot/parrot_yellow_blue.png")));
        put(Parrot.Variant.GRAY, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/parrot/parrot_grey.png")));
    }};

    public ParrotShinyLayer(RenderLayerParent<Parrot, ParrotModel> renderer) {
        super(renderer);
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource bufferSource, int packedLightIn, Parrot entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        if (!entity.isInvisible()) {
            VertexConsumer vertexconsumer = bufferSource.getBuffer(SHINE.get(entity.getVariant()));
            this.getParentModel().renderToBuffer(poseStack, vertexconsumer, 15728640, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        }
    }
}
