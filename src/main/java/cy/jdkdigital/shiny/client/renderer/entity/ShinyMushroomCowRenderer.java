package cy.jdkdigital.shiny.client.renderer.entity;

import com.google.common.collect.Maps;
import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.MushroomCowShinyLayer;
import net.minecraft.Util;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MushroomCowRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.MushroomCow;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class ShinyMushroomCowRenderer extends MushroomCowRenderer
{
    private static final Map<MushroomCow.MushroomType, ResourceLocation> TEXTURES = Util.make(Maps.newHashMap(), (map) -> {
        map.put(MushroomCow.MushroomType.BROWN, new ResourceLocation(ShinyMod.MODID, "textures/entity/cow/brown_mooshroom.png"));
        map.put(MushroomCow.MushroomType.RED, new ResourceLocation(ShinyMod.MODID, "textures/entity/cow/red_mooshroom.png"));
    });

    public ShinyMushroomCowRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new MushroomCowShinyLayer(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(MushroomCow entity) {
        return TEXTURES.get(entity.getMushroomType());
    }
}
