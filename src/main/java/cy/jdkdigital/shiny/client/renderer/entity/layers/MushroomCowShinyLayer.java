package cy.jdkdigital.shiny.client.renderer.entity.layers;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import cy.jdkdigital.shiny.ShinyMod;
import net.minecraft.Util;
import net.minecraft.client.model.CowModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.MushroomCow;

import java.util.Map;

public class MushroomCowShinyLayer extends RenderLayer<MushroomCow, CowModel<MushroomCow>>
{
    private static final Map<MushroomCow.MushroomType, RenderType> SHINE = Util.make(Maps.newHashMap(), (map) -> {
        map.put(MushroomCow.MushroomType.BROWN, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/cow/brown_mooshroom.png")));
        map.put(MushroomCow.MushroomType.RED, RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/cow/red_mooshroom.png")));
    });

    public MushroomCowShinyLayer(RenderLayerParent<MushroomCow, CowModel<MushroomCow>> renderer) {
        super(renderer);
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource bufferSource, int packedLightIn, MushroomCow entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        if (!entity.isInvisible()) {
            VertexConsumer vertexconsumer = bufferSource.getBuffer(SHINE.get(entity.getVariant()));
            this.getParentModel().renderToBuffer(poseStack, vertexconsumer, 15728640, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        }
    }
}
