package org.waveapi.testmod.itemsblocks;


import org.waveapi.api.content.items.block.BlockMaterial;
import org.waveapi.api.content.items.block.WaveBlock;
import org.waveapi.api.content.items.block.blockentities.TileEntityBlock;
import org.waveapi.api.content.items.block.blockentities.WaveTileEntity;
import org.waveapi.api.content.items.block.model.SixSidedBlockModel;
import org.waveapi.api.content.items.drop.Drop;
import org.waveapi.api.content.items.drop.DropHelper;
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
    public Class<? extends WaveTileEntity> getTileEntity() {
        return TestTileEntity.class;
    }
}
