package cy.jdkdigital.shiny.client.renderer.entity;

import com.google.common.collect.Maps;
import cy.jdkdigital.shiny.client.renderer.entity.layers.HorseShinyLayer;
import net.minecraft.Util;
import net.minecraft.client.model.HorseModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.AbstractHorseRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.entity.animal.horse.Variant;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class ShinyHorseRenderer extends AbstractHorseRenderer<Horse, HorseModel<Horse>>
{
    private static final Map<Variant, ResourceLocation> MAP = Util.make(Maps.newEnumMap(Variant.class), (map) -> {
        map.put(Variant.WHITE, new ResourceLocation("textures/entity/horse/horse_white.png"));
        map.put(Variant.CREAMY, new ResourceLocation("textures/entity/horse/horse_creamy.png"));
        map.put(Variant.CHESTNUT, new ResourceLocation("textures/entity/horse/horse_chestnut.png"));
        map.put(Variant.BROWN, new ResourceLocation("textures/entity/horse/horse_brown.png"));
        map.put(Variant.BLACK, new ResourceLocation("textures/entity/horse/horse_black.png"));
        map.put(Variant.GRAY, new ResourceLocation("textures/entity/horse/horse_gray.png"));
        map.put(Variant.DARK_BROWN, new ResourceLocation("textures/entity/horse/horse_darkbrown.png"));
    });

    public ShinyHorseRenderer(EntityRendererProvider.Context context) {
        super(context, new HorseModel<>(context.bakeLayer(ModelLayers.HORSE)), 1.1F);
        addLayer(new HorseShinyLayer(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(Horse entity) {
        return MAP.get(entity.getVariant());
    }
}
