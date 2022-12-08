package cy.jdkdigital.shiny.client.renderer.entity.layers;

import cy.jdkdigital.shiny.ShinyMod;
import net.minecraft.client.model.SpiderModel;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import org.jetbrains.annotations.NotNull;

public class SpiderShinyEyesLayer<T extends Entity, M extends SpiderModel<T>> extends EyesLayer<T, M>
{
    private static final RenderType SPIDER_EYES = RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/spider_eyes.png"));

    public SpiderShinyEyesLayer(RenderLayerParent<T, M> p_117507_) {
        super(p_117507_);
    }

    @Override
    public @NotNull RenderType renderType() {
        return SPIDER_EYES;
    }
}