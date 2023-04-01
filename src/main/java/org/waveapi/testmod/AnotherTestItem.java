package org.waveapi.testmod;

import org.waveapi.api.content.items.WaveItem;
import org.waveapi.api.content.items.models.SimpleItemModel;

public class AnotherTestItem extends WaveItem {
    public AnotherTestItem() {
        super("another_test_item", TestMod.getInstance());

        setModel(new SimpleItemModel("test/hmm.png"));
        setTab(TestTab.getInstance());

        addTranslation("en_us", "Another Test Item");
    }
}