package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.SpiderShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.SpiderRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Spider;

public class ShinySpiderRenderer<T extends Spider> extends SpiderRenderer<T>
{
    private static final ResourceLocation SPIDER_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/spider/spider.png");

    public ShinySpiderRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new SpiderShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(T p_116009_) {
        return SPIDER_LOCATION;
    }
}
