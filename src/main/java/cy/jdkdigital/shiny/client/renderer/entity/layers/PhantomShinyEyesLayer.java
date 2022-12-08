package cy.jdkdigital.shiny.client.renderer.entity.layers;

import cy.jdkdigital.shiny.ShinyMod;
import net.minecraft.client.model.PhantomModel;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Phantom;

public class PhantomShinyEyesLayer<T extends Phantom> extends EyesLayer<T, PhantomModel<T>>
{
    private static final RenderType PHANTOM_EYES = RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/phantom_eyes.png"));

    public PhantomShinyEyesLayer(RenderLayerParent<T, PhantomModel<T>> p_117342_) {
        super(p_117342_);
    }

    public RenderType renderType() {
        return PHANTOM_EYES;
    }
}