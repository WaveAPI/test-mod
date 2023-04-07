package org.waveapi.testmod.tools;

import org.waveapi.api.content.items.models.SimpleToolModel;
import org.waveapi.api.content.items.tools.WaveShovelItem;
import org.waveapi.testmod.TestMod;
import org.waveapi.testmod.TestTab;

public class WeirdShovel extends WaveShovelItem {
    public WeirdShovel() {
        super("weird_shovel", TestMod.weird, TestMod.getInstance());

        setModel(new SimpleToolModel("test/tools/weird_shovel.png"));
        setTab(TestTab.getInstance());

        addTranslation("en_us", "Weird Shovel");
    }
}
