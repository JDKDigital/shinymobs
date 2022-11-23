package cy.jdkdigital.shiny.client.renderer.entity;

import com.google.common.collect.Maps;
import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.CatShinyLayer;
import net.minecraft.Util;
import net.minecraft.client.renderer.entity.CatRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Cat;

import java.util.Map;

public class ShinyCatRenderer extends CatRenderer
{
    public static final Map<Integer, ResourceLocation> TEXTURE_BY_TYPE = Util.make(Maps.newHashMap(), (map) -> {
        map.put(0, new ResourceLocation(ShinyMod.MODID, "textures/entity/cat/tabby.png"));
        map.put(1, new ResourceLocation(ShinyMod.MODID, "textures/entity/cat/black.png"));
        map.put(2, new ResourceLocation(ShinyMod.MODID, "textures/entity/cat/red.png"));
        map.put(3, new ResourceLocation(ShinyMod.MODID, "textures/entity/cat/siamese.png"));
        map.put(4, new ResourceLocation(ShinyMod.MODID, "textures/entity/cat/british_shorthair.png"));
        map.put(5, new ResourceLocation(ShinyMod.MODID, "textures/entity/cat/calico.png"));
        map.put(6, new ResourceLocation(ShinyMod.MODID, "textures/entity/cat/persian.png"));
        map.put(7, new ResourceLocation(ShinyMod.MODID, "textures/entity/cat/ragdoll.png"));
        map.put(8, new ResourceLocation(ShinyMod.MODID, "textures/entity/cat/white.png"));
        map.put(9, new ResourceLocation(ShinyMod.MODID, "textures/entity/cat/jellie.png"));
        map.put(10, new ResourceLocation(ShinyMod.MODID, "textures/entity/cat/all_black.png"));
    });

    public ShinyCatRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new CatShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(Cat entity) {
        return TEXTURE_BY_TYPE.get(entity.getCatType());
    }
}
