package org.waveapi.testmod;

import org.waveapi.api.content.entities.EntityCreation;
import org.waveapi.api.world.entity.DamageSource;
import org.waveapi.api.world.entity.EntityBase;
import org.waveapi.api.world.entity.interfaces.FlyingItemBasedEntity;
import org.waveapi.api.world.inventory.ItemStack;

public class TestEntity extends EntityBase implements FlyingItemBasedEntity {
    public TestEntity(EntityCreation e) {
        super(e);
    }

    @Override
    public ItemStack getItem() {
        return TestMod.item.getDefaultStack();
    }

    @Override
    public boolean onDamage(DamageSource source, float amount) {
        destroy();
        return true;
    }

    @Override
    public boolean handleAttack() {
        destroy();
        return true;
    }
}
