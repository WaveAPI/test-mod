package org.waveapi.testmod;


import org.waveapi.api.content.items.block.BlockMaterial;
import org.waveapi.api.content.items.block.WaveBlock;
import org.waveapi.api.content.items.block.model.SixSidedBlockModel;

public class TestBlock extends WaveBlock {
    public TestBlock() {
        super("test_block", TestMod.getInstance(), BlockMaterial.SOIL);
        setTab(TestTab.getInstance());
        setModels(new SixSidedBlockModel("test/hmm.png"));

        addTranslation("en_us", "The HMM");
    }
}
