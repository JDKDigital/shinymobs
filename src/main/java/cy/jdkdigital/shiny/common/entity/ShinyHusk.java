package cy.jdkdigital.shiny.common.entity;

import cy.jdkdigital.shiny.init.ModEntities;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Husk;
import net.minecraft.world.level.Level;

public class ShinyHusk extends Husk
{
    public ShinyHusk(EntityType<? extends Husk> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected void doUnderWaterConversion() {
        this.convertToZombieType(ModEntities.ZOMBIE.get());
        if (!this.isSilent()) {
            this.level().levelEvent(null, 1040, this.blockPosition(), 0);
        }
    }
}
