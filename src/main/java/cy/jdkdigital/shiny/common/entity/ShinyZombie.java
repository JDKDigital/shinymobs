package cy.jdkdigital.shiny.common.entity;

import cy.jdkdigital.shiny.init.ModEntities;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.level.Level;

public class ShinyZombie extends Zombie
{
    public ShinyZombie(EntityType<? extends Zombie> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected void doUnderWaterConversion() {
        this.convertToZombieType(ModEntities.DROWNED.get());
        if (!this.isSilent()) {
            this.level.levelEvent(null, 1040, this.blockPosition(), 0);
        }
    }
}
