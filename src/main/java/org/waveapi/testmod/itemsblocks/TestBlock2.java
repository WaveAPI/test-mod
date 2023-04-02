package org.waveapi.testmod.itemsblocks;


import org.waveapi.api.content.items.block.BlockMaterial;
import org.waveapi.api.content.items.block.MinecraftBlocks;
import org.waveapi.api.content.items.block.WaveBlock;
import org.waveapi.api.content.items.block.model.SixSidedBlockModel;
import org.waveapi.api.math.BlockPos;
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

    @Override
    public void onRandomTick(BlockState state, BlockPos pos, World world) {
        world.setBlockState(pos, MinecraftBlocks.DIAMOND_BLOCK.getDefaultState());
    }
}
