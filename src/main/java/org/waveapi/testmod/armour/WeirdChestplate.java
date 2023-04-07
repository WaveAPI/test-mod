package org.waveapi.testmod.armour;

import org.waveapi.api.content.items.armour.ArmourSlot;
import org.waveapi.api.content.items.armour.WaveArmourItem;
import org.waveapi.api.content.items.models.SimpleItemModel;
import org.waveapi.testmod.TestMod;
import org.waveapi.testmod.TestTab;

public class WeirdChestplate extends WaveArmourItem {
    public WeirdChestplate() {
        super("weird_chestplate", TestMod.weird_armour, ArmourSlot.CHESTPLATE, TestMod.getInstance());

        setModel(new SimpleItemModel("test/armour/chestplate.png"));
        setTab(TestTab.getInstance());

        addTranslation("en_us", "Weird Chestplate");
    }
}