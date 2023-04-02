package org.waveapi.testmod.itemsblocks;

import org.waveapi.api.content.items.WaveItem;
import org.waveapi.api.content.items.models.SimpleItemModel;
import org.waveapi.testmod.TestMod;
import org.waveapi.testmod.TestTab;

public class AnotherTestItem extends WaveItem {
    public AnotherTestItem() {
        super("another_test_item", TestMod.getInstance());

        setModel(new SimpleItemModel("test/hmm.png"));
        setTab(TestTab.getInstance());

        addTranslation("en_us", "Another Test Item");
    }
}