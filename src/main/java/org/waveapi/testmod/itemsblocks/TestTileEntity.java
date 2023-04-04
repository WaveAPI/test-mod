package org.waveapi.testmod.itemsblocks;

import org.waveapi.api.content.items.block.MinecraftBlocks;
import org.waveapi.api.content.items.block.blockentities.DeltaTicking;
import org.waveapi.api.content.items.block.blockentities.TileEntityCreation;
import org.waveapi.api.content.items.block.blockentities.WaveTileEntity;
import org.waveapi.api.misc.NBT;
import org.waveapi.testmod.TestMod;

public class TestTileEntity extends WaveTileEntity implements DeltaTicking {
    public TestTileEntity(TileEntityCreation creation) {
        super(creation);
    }

    public int mode;

    public boolean firstTick = true;
    @Override
    public void tick(int i) {
        if (firstTick) {
            TestMod.log.log("Test tile first ticked, is it on client? " + getWorld().isClientSide());
            firstTick = false;
        }
        if (getWorld().isClientSide()) return;
        if (mode == 0) {
            getWorld().setBlockState(getPosition().add(0, 1, 0), MinecraftBlocks.DIAMOND_BLOCK.getDefaultState());
        } else if (mode == 1) {
            getWorld().setBlockState(getPosition().add(0, 1, 0), MinecraftBlocks.IRON_BLOCK.getDefaultState());
        }
    }

    public void save(NBT nbt) {
        System.out.println("load");
        nbt.writeInt("mode", mode);
    }

    public void load(NBT nbt) {
        System.out.println("Save");
        mode = nbt.readInt("mode");
    }

    @Override
    public int maxTicksUnticked() {
        return 1;
    }
}
