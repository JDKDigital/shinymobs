package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.CaveSpiderShinyLayer;
import net.minecraft.client.renderer.entity.CaveSpiderRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.CaveSpider;
import org.jetbrains.annotations.NotNull;

public class ShinyCaveSpiderRenderer extends CaveSpiderRenderer
{
    private static final ResourceLocation CAVE_SPIDER_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/spider/cave_spider.png");

    public ShinyCaveSpiderRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new CaveSpiderShinyLayer(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(CaveSpider entity) {
        return CAVE_SPIDER_LOCATION;
    }
}
