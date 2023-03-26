package org.waveapi.testmod;


import org.waveapi.api.content.items.block.BlockMaterial;
import org.waveapi.api.content.items.block.WaveBlock;
import org.waveapi.api.content.items.block.blockentities.TileEntityBlock;
import org.waveapi.api.content.items.block.blockentities.WaveTileEntity;
import org.waveapi.api.content.items.block.model.SixSidedBlockModel;

public class TestBlock extends WaveBlock implements TileEntityBlock {
    public TestBlock() {
        super("test_block", TestMod.getInstance(), BlockMaterial.SOIL);
        setTab(TestTab.getInstance());
        setModels(new SixSidedBlockModel("test/hmm.png"));

        addTranslation("en_us", "The HMM");
    }


    @Override
    public Class<? extends WaveTileEntity> getTileEntity() {
        return TestTileEntity.class;
    }
}
