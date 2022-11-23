package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.EvokerShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EvokerRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Evoker;
import org.jetbrains.annotations.NotNull;

public class ShinyEvokerRenderer<T extends Evoker> extends EvokerRenderer<T>
{
    private static final ResourceLocation EVOKER_ILLAGER = new ResourceLocation(ShinyMod.MODID, "textures/entity/illager/evoker.png");

    public ShinyEvokerRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new EvokerShinyLayer(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(T entity) {
        return EVOKER_ILLAGER;
    }
}
