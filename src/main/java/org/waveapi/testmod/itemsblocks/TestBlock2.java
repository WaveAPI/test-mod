package org.waveapi.testmod.itemsblocks;


import org.waveapi.api.content.items.block.BlockMaterial;
import org.waveapi.api.content.items.block.MinecraftBlocks;
import org.waveapi.api.content.items.block.WaveBlock;
import org.waveapi.api.content.items.block.model.SixSidedBlockModel;
import org.waveapi.api.math.BlockPos;
import org.waveapi.api.world.entity.living.EntityPlayer;
import org.waveapi.api.world.inventory.ItemUseResult;
import org.waveapi.api.world.inventory.UseHand;
import org.waveapi.api.world.world.BlockState;
import org.waveapi.api.world.world.World;
import org.waveapi.testmod.TestMod;
import org.waveapi.testmod.TestTab;

public class TestBlock2 extends WaveBlock {
    public TestBlock2() {
        super("test_block_2", TestMod.getInstance(), BlockMaterial.STONE);
        setTab(TestTab.getInstance());
        setModels(new SixSidedBlockModel((String) null));
        setHardness(2.5f);
        setDrop();

        enableRandomTick();

        makePickaxeEffective();
        setMiningLevelRequired(1);

        addTranslation("en_us", "The HMM 2.0");
    }

    private static int[][] ADD = new int[][] {
            {1, 0, 0},
            {-1, 0, 0},
            {0, 1, 0},
            {0, -1, 0},
            {0, 0, 1},
            {0, 0, -1},
    };

    @Override
    public void onRandomTick(BlockState state, BlockPos pos, World world) {
        for (int[] add : ADD) {
            BlockPos p = pos.add(add[0], add[1], add[2]);
            if (world.getBlockState(p).getBlock() == MinecraftBlocks.STONE) {
                world.setBlockState(p, getDefaultState());
            }
        }
    }

    @Override
    public ItemUseResult onUse(BlockState blockState, BlockPos pos, World world, EntityPlayer entityPlayer, UseHand useHand) {
        world.setBlockState(pos, MinecraftBlocks.DIAMOND_BLOCK.getDefaultState());
        return ItemUseResult.SUCCESS;
    }
}
