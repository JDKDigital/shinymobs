package cy.jdkdigital.shiny.common.entity;

import cy.jdkdigital.shiny.init.ModItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Cod;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ShinyCod extends Cod
{
    public ShinyCod(EntityType<? extends Cod> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public ItemStack getBucketItemStack() {
        return new ItemStack(ModItems.SHINY_COD_BUCKET.get());
    }
}
