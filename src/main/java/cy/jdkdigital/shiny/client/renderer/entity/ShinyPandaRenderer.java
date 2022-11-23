package cy.jdkdigital.shiny.client.renderer.entity;

import com.google.common.collect.Maps;
import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.PandaShinyLayer;
import net.minecraft.Util;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.PandaRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Panda;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class ShinyPandaRenderer extends PandaRenderer
{
    private static final Map<Panda.Gene, ResourceLocation> TEXTURES = Util.make(Maps.newEnumMap(Panda.Gene.class), (map) -> {
        map.put(Panda.Gene.NORMAL, new ResourceLocation(ShinyMod.MODID, "textures/entity/panda/panda.png"));
        map.put(Panda.Gene.LAZY, new ResourceLocation(ShinyMod.MODID, "textures/entity/panda/lazy_panda.png"));
        map.put(Panda.Gene.WORRIED, new ResourceLocation(ShinyMod.MODID, "textures/entity/panda/worried_panda.png"));
        map.put(Panda.Gene.PLAYFUL, new ResourceLocation(ShinyMod.MODID, "textures/entity/panda/playful_panda.png"));
        map.put(Panda.Gene.BROWN, new ResourceLocation(ShinyMod.MODID, "textures/entity/panda/brown_panda.png"));
        map.put(Panda.Gene.WEAK, new ResourceLocation(ShinyMod.MODID, "textures/entity/panda/weak_panda.png"));
        map.put(Panda.Gene.AGGRESSIVE, new ResourceLocation(ShinyMod.MODID, "textures/entity/panda/aggressive_panda.png"));
    });

    public ShinyPandaRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new PandaShinyLayer(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(Panda entity) {
        return TEXTURES.getOrDefault(entity.getVariant(), TEXTURES.get(Panda.Gene.NORMAL));
    }
}
