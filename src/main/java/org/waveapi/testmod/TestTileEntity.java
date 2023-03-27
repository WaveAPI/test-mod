package org.waveapi.testmod;

import org.waveapi.api.content.items.block.MinecraftBlocks;
import org.waveapi.api.content.items.block.blockentities.DeltaTicking;
import org.waveapi.api.content.items.block.blockentities.TileEntityCreation;
import org.waveapi.api.content.items.block.blockentities.WaveTileEntity;

public class TestTileEntity extends WaveTileEntity implements DeltaTicking {
    public TestTileEntity(TileEntityCreation creation) {
        super(creation);
    }

    public boolean firstTick = true;
    @Override
    public void tick(int i) {
        getWorld().setBlockState(getPosition().add(0, 1, 0), MinecraftBlocks.DIAMOND_BLOCK.getDefaultState());
        if (firstTick) {
            TestMod.log.log("Test tile first ticked, is it on client? " + getWorld().isClientSide());
            firstTick = false;
        }
    }

    @Override
    public int maxTicksUnticked() {
        return 1;
    }
}
