package org.waveapi.testmod.itemsblocks;


import org.waveapi.api.content.items.block.BlockMaterial;
import org.waveapi.api.content.items.block.WaveBlock;
import org.waveapi.api.content.items.block.blockentities.TileEntityBlock;
import org.waveapi.api.content.items.block.blockentities.WaveTileEntity;
import org.waveapi.api.content.items.block.model.SixSidedBlockModel;
import org.waveapi.api.content.items.drop.Drop;
import org.waveapi.api.content.items.drop.DropHelper;
import org.waveapi.api.math.BlockPos;
import org.waveapi.api.world.entity.living.EntityPlayer;
import org.waveapi.api.world.inventory.ItemUseResult;
import org.waveapi.api.world.inventory.UseHand;
import org.waveapi.api.world.world.BlockState;
import org.waveapi.api.world.world.World;
import org.waveapi.testmod.TestMod;
import org.waveapi.testmod.TestTab;

public class TestBlock extends WaveBlock implements TileEntityBlock {
    public TestBlock() {
        super("test_block", TestMod.getInstance(), BlockMaterial.SOIL);
        setTab(TestTab.getInstance());
        setModels(new SixSidedBlockModel((String) null));
        setHardness(0.5f);
        setDrop(new Drop[]{
                DropHelper.ore(this, TestMod.another_item, 5, 10)
        });

        makeHoeEffective();
        setMiningLevelRequired(2);

        addTranslation("en_us", "The HMM");
    }

    @Override
    public ItemUseResult onUse(BlockState blockState, BlockPos pos, World world, EntityPlayer entityPlayer, UseHand useHand) {
        TestTileEntity e = world.getTileEntity(pos, TestTileEntity.class);
        e.markNeedsSaving();
        if (e.mode == 0) {
            e.mode = 1;
        } else {
            e.mode = 0;
        }

        return ItemUseResult.CONSUME;
    }

    @Override
    public Class<? extends WaveTileEntity> getTileEntity() {
        return TestTileEntity.class;
    }
}
