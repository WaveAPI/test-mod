package org.waveapi.testmod;

import org.waveapi.api.content.entities.EntityCreation;
import org.waveapi.api.content.items.block.MinecraftBlocks;
import org.waveapi.api.math.BlockPos;
import org.waveapi.api.world.entity.DamageSource;
import org.waveapi.api.world.entity.interfaces.FlyingItemBasedEntity;
import org.waveapi.api.world.entity.living.EntityLiving;
import org.waveapi.api.world.inventory.ItemStack;

import java.util.Random;

public class TestEntity extends EntityLiving implements FlyingItemBasedEntity {

    Random r = new Random();
    public TestEntity(EntityCreation e) {
        super(e);
    }

    public int change = 0;

    @Override
    public void tick() {
        getWorld().setBlockState(new BlockPos(getPosition()), MinecraftBlocks.BLUE_STAINED_GLASS_PANE.getDefaultState());
        if (change <= 0) {
            damage(DamageSource.GENERIC, 1);
            change = 5;
            setVelocity(getVelocity().add(r.nextDouble() - 0.5, r.nextDouble() - 0.4, r.nextDouble() - 0.5));
        }
        change-=1;
        super.tick();
    }

    @Override
    public ItemStack getItem() {
        return TestMod.item.getDefaultStack();
    }
}
