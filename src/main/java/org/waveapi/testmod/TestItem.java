package org.waveapi.testmod;

import org.waveapi.api.content.items.WaveItem;
import org.waveapi.api.content.items.models.ItemModel;
import org.waveapi.api.content.items.models.SimpleItemModel;

public class TestItem extends WaveItem {
    public TestItem() {
        super("test_item", TestMod.getInstance());
        setModel(new SimpleItemModel("test_item.png"));

        addTranslation("en_us", "Test Item");
    }

    @Override
    public int getMaxStackSize() {
        return 16;
    }
}
