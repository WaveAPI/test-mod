package org.waveapi.testmod.armour;

import org.waveapi.api.content.items.armour.ArmourSlot;
import org.waveapi.api.content.items.armour.WaveArmourItem;
import org.waveapi.api.content.items.models.SimpleItemModel;
import org.waveapi.testmod.TestMod;
import org.waveapi.testmod.TestTab;

public class WeirdHelmet extends WaveArmourItem {
    public WeirdHelmet() {
        super("weird_helmet", TestMod.weird_armour, ArmourSlot.HELMET, TestMod.getInstance());

        setModel(new SimpleItemModel("test/armour/helmet.png"));
        setTab(TestTab.getInstance());

        addTranslation("en_us", "Weird Helmet");
    }
}