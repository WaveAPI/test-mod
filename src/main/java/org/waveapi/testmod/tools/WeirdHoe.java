package org.waveapi.testmod.tools;

import org.waveapi.api.content.items.models.SimpleToolModel;
import org.waveapi.api.content.items.tools.WaveHoeItem;
import org.waveapi.testmod.TestMod;
import org.waveapi.testmod.TestTab;

public class WeirdHoe extends WaveHoeItem {
    public WeirdHoe() {
        super("weird_hoe", TestMod.weird, TestMod.getInstance());

        setModel(new SimpleToolModel("test/tools/weird_hoe.png"));
        setTab(TestTab.getInstance());

        addTranslation("en_us", "Weird Hoe");
    }
}
