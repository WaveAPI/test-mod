package org.waveapi.testmod;


import org.waveapi.api.content.items.block.BlockMaterial;
import org.waveapi.api.content.items.block.WaveBlock;
import org.waveapi.api.content.items.block.model.SixSidedBlockModel;

public class TestBlock2 extends WaveBlock {
    public TestBlock2() {
        super("test_block_2", TestMod.getInstance(), BlockMaterial.STONE);
        setTab(TestTab.getInstance());
        setModels(new SixSidedBlockModel((String) null));
        setHardness(2.5f);
        setDrop();

        makePickaxeEffective();
        setMiningLevelRequired(1);

        addTranslation("en_us", "The HMM 2.0");
    }
}
