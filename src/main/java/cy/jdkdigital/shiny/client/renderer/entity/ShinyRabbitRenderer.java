package cy.jdkdigital.shiny.client.renderer.entity;

import cy.jdkdigital.shiny.ShinyMod;
import cy.jdkdigital.shiny.client.renderer.entity.layers.RabbitShinyLayer;
import net.minecraft.ChatFormatting;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.RabbitRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Rabbit;
import org.jetbrains.annotations.NotNull;

public class ShinyRabbitRenderer extends RabbitRenderer
{
    private static final ResourceLocation RABBIT_BROWN_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/rabbit/brown.png");
    private static final ResourceLocation RABBIT_WHITE_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/rabbit/white.png");
    private static final ResourceLocation RABBIT_BLACK_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/rabbit/black.png");
    private static final ResourceLocation RABBIT_GOLD_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/rabbit/gold.png");
    private static final ResourceLocation RABBIT_SALT_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/rabbit/salt.png");
    private static final ResourceLocation RABBIT_WHITE_SPLOTCHED_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/rabbit/white_splotched.png");
    private static final ResourceLocation RABBIT_TOAST_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/rabbit/toast.png");
    private static final ResourceLocation RABBIT_EVIL_LOCATION = new ResourceLocation(ShinyMod.MODID, "textures/entity/rabbit/caerbannog.png");

    public ShinyRabbitRenderer(EntityRendererProvider.Context context) {
        super(context);
        addLayer(new RabbitShinyLayer(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(Rabbit entity) {
        String s = ChatFormatting.stripFormatting(entity.getName().getString());
        if ("Toast".equals(s)) {
            return RABBIT_TOAST_LOCATION;
        } else {
            return switch (entity.getRabbitType()) {
                case 1 -> RABBIT_WHITE_LOCATION;
                case 2 -> RABBIT_BLACK_LOCATION;
                case 3 -> RABBIT_WHITE_SPLOTCHED_LOCATION;
                case 4 -> RABBIT_GOLD_LOCATION;
                case 5 -> RABBIT_SALT_LOCATION;
                case 99 -> RABBIT_EVIL_LOCATION;
                default -> RABBIT_BROWN_LOCATION;
            };
        }
    }
}
