package cy.jdkdigital.shiny.common.entity;

import cy.jdkdigital.shiny.init.ModItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Pufferfish;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ShinyPufferfish extends Pufferfish
{
    public ShinyPufferfish(EntityType<? extends Pufferfish> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public ItemStack getBucketItemStack() {
        return new ItemStack(ModItems.SHINY_PUFFERFISH_BUCKET.get());
    }
}
