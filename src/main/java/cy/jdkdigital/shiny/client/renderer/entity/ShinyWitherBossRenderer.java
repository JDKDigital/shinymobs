package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.WitherBossShinyLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.WitherBossRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.boss.wither.WitherBoss;

public class ShinyWitherBossRenderer extends WitherBossRenderer
{
    private static final ResourceLocation WITHER_INVULNERABLE_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/wither/wither_invulnerable.png");
    private static final ResourceLocation WITHER_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/wither/wither.png");

    public ShinyWitherBossRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new WitherBossShinyLayer(this));
    }

    public ResourceLocation getTextureLocation(WitherBoss p_116437_) {
        int i = p_116437_.getInvulnerableTicks();
        return i > 0 && (i > 80 || i / 5 % 2 != 1) ? WITHER_INVULNERABLE_LOCATION : WITHER_LOCATION;
    }
}
