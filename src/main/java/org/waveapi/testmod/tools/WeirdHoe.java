package org.waveapi.testmod.tools;

import org.waveapi.api.content.items.models.SimpleToolModel;
import org.waveapi.api.content.items.tools.WaveHoeItem;
import org.waveapi.testmod.TestMod;
import org.waveapi.testmod.TestTab;

public class WeirdHoe extends WaveHoeItem {
    public WeirdHoe() {
        super("weird_hoe", TestMod.getInstance(), TestMod.weird);

        setModel(new SimpleToolModel("test/weird_hoe.png"));
        setTab(TestTab.getInstance());

        addTranslation("en_us", "Weird Hoe");
    }
}
