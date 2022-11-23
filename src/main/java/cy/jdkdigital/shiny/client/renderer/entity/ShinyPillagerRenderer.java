package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.PillagerShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.PillagerRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Pillager;

public class ShinyPillagerRenderer extends PillagerRenderer
{
    private static final ResourceLocation PILLAGER = new ResourceLocation(ShinyMod.MODID, "textures/entity/illager/pillager.png");

    public ShinyPillagerRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new PillagerShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(Pillager p_115720_) {
        return PILLAGER;
    }
}
