package org.waveapi.testmod;

import org.waveapi.api.content.items.WaveItem;

public class TestItem extends WaveItem {
    public TestItem() {
        super("test_item", TestMod.getInstance());
    }
}
