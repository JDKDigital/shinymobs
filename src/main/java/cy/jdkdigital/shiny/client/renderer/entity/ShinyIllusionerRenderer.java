package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.IllusionerShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.IllusionerRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Illusioner;

public class ShinyIllusionerRenderer extends IllusionerRenderer
{
    private static final ResourceLocation ILLUSIONER = new ResourceLocation(ShinyMod.MODID, "textures/entity/illager/illusioner.png");

    public ShinyIllusionerRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new IllusionerShinyLayer<>(this));
    }

    public ResourceLocation getTextureLocation(Illusioner p_114950_) {
        return ILLUSIONER;
    }
}
