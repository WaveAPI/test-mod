package org.waveapi.testmod.tools;

import org.waveapi.api.content.items.models.SimpleToolModel;
import org.waveapi.api.content.items.tools.WavePickaxeItem;
import org.waveapi.testmod.TestMod;
import org.waveapi.testmod.TestTab;

public class WeirdPickaxe extends WavePickaxeItem {
    public WeirdPickaxe() {
        super("weird_pickaxe", TestMod.getInstance(), TestMod.weird);

        setModel(new SimpleToolModel("test/weird_pickaxe.png"));
        setTab(TestTab.getInstance());

        addTranslation("en_us", "Weird Pickaxe");
    }
}
