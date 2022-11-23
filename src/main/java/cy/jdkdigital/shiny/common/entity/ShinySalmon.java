package cy.jdkdigital.shiny.common.entity;

import cy.jdkdigital.shiny.init.ModItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Salmon;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ShinySalmon extends Salmon
{
    public ShinySalmon(EntityType<? extends Salmon> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public ItemStack getBucketItemStack() {
        return new ItemStack(ModItems.SHINY_SALMON_BUCKET.get());
    }
}
