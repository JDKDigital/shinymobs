package cy.jdkdigital.shiny.client.renderer.entity.layers;

import cy.jdkdigital.shiny.ShinyMod;
import net.minecraft.client.model.EndermanModel;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;

public class EndermanShinyEyesLayer<T extends LivingEntity> extends EyesLayer<T, EndermanModel<T>>
{
    private static final RenderType ENDERMAN_EYES = RenderType.eyes(new ResourceLocation(ShinyMod.MODID, "textures/entity/enderman/enderman_eyes.png"));

    public EndermanShinyEyesLayer(RenderLayerParent<T, EndermanModel<T>> p_116964_) {
        super(p_116964_);
    }

    public RenderType renderType() {
        return ENDERMAN_EYES;
    }
}