package org.waveapi.testmod;


import org.waveapi.api.content.items.block.BlockMaterial;
import org.waveapi.api.content.items.block.WaveBlock;
import org.waveapi.api.content.items.block.blockentities.TileEntityBlock;
import org.waveapi.api.content.items.block.blockentities.WaveTileEntity;
import org.waveapi.api.content.items.block.model.SixSidedBlockModel;
import org.waveapi.api.content.items.drop.Drop;
import org.waveapi.api.content.items.drop.DropFunction;
import org.waveapi.api.content.items.drop.ItemDrop;
import org.waveapi.api.content.items.drop.SilkTouchDrop;

public class TestBlock extends WaveBlock implements TileEntityBlock {
    public TestBlock() {
        super("test_block", TestMod.getInstance(), BlockMaterial.SOIL);
        setTab(TestTab.getInstance());
        setModels(new SixSidedBlockModel((String) null));
        setHardness(0.5f);
        setDrop(new Drop[]{
                new SilkTouchDrop(getAsSimpleDrop(), new ItemDrop(TestMod.another_item, 1, 3).apply(DropFunction.ORE_FORTUNE))
        });

        addTranslation("en_us", "The HMM");
    }


    @Override
    public Class<? extends WaveTileEntity> getTileEntity() {
        return TestTileEntity.class;
    }
}
