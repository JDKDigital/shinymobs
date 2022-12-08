package cy.jdkdigital.shiny.client.renderer.entity.layers;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import cy.jdkdigital.shiny.ShinyMod;
import net.minecraft.Util;
import net.minecraft.client.model.AxolotlModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.axolotl.Axolotl;

import java.util.Map;

public class AxolotlShinyLayer extends RenderLayer<Axolotl, AxolotlModel<Axolotl>>
{
    private static final Map<Axolotl.Variant, RenderType> SHINE = Util.make(Maps.newHashMap(), (map) -> {
        for(Axolotl.Variant axolotl$variant : Axolotl.Variant.BY_ID) {
            map.put(axolotl$variant, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, String.format("textures/entity/axolotl/axolotl_%s.png", axolotl$variant.getName()))));
        }
    });

    public AxolotlShinyLayer(RenderLayerParent<Axolotl, AxolotlModel<Axolotl>> renderer) {
        super(renderer);
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource bufferSource, int packedLightIn, Axolotl entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        if (!entity.isInvisible()) {
            VertexConsumer vertexconsumer = bufferSource.getBuffer(SHINE.get(entity.getVariant()));
            this.getParentModel().renderToBuffer(poseStack, vertexconsumer, 15728640, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        }
    }
}
