package cy.jdkdigital.shiny.client.renderer.entity;

import com.google.common.collect.Maps;
import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.AxolotlShinyLayer;
import net.minecraft.Util;
import net.minecraft.client.renderer.entity.AxolotlRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.axolotl.Axolotl;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class ShinyAxolotlRenderer extends AxolotlRenderer
{
    private static final Map<Axolotl.Variant, ResourceLocation> TEXTURE_BY_TYPE = Util.make(Maps.newHashMap(), (textureMap) -> {
        for(Axolotl.Variant variant : Axolotl.Variant.BY_ID) {
            textureMap.put(variant, new ResourceLocation(ShinyMod.MODID, String.format("textures/entity/axolotl/axolotl_%s.png", variant.getName())));
        }
    });

    public ShinyAxolotlRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new AxolotlShinyLayer(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(Axolotl entity) {
        return TEXTURE_BY_TYPE.get(entity.getVariant());
    }
}
