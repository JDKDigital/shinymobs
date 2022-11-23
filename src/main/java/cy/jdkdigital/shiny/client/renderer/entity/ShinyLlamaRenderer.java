package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.LlamaShinyLayer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LlamaRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.horse.Llama;
import org.jetbrains.annotations.NotNull;

public class ShinyLlamaRenderer extends LlamaRenderer
{
    private static final ResourceLocation[] LLAMA_LOCATIONS = new ResourceLocation[]{
            new ResourceLocation(ShinyMod.MODID, "textures/entity/llama/creamy.png"),
            new ResourceLocation(ShinyMod.MODID, "textures/entity/llama/white.png"),
            new ResourceLocation(ShinyMod.MODID, "textures/entity/llama/brown.png"),
            new ResourceLocation(ShinyMod.MODID, "textures/entity/llama/gray.png")
    };

    public ShinyLlamaRenderer(EntityRendererProvider.Context context, ModelLayerLocation model) {
        super(context, model);
        addLayer(new LlamaShinyLayer(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(Llama entity) {
        return LLAMA_LOCATIONS[entity.getVariant()];
    }
}
