package org.waveapi.testmod;

import org.waveapi.api.Logger;
import org.waveapi.api.content.items.WaveItem;
import org.waveapi.api.content.items.models.ItemModel;
import org.waveapi.api.content.items.models.SimpleItemModel;
import org.waveapi.api.world.inventory.ItemStack;
import org.waveapi.api.world.inventory.ItemUseResult;
import org.waveapi.api.world.inventory.UseHand;

public class TestItem extends WaveItem {
    public TestItem() {
        super("test_item", TestMod.getInstance());
        setModel(new SimpleItemModel("test_item.png"));

        addTranslation("en_us", "Test Item");

        setMaxStackSize(16);
    }

    @Override
    public ItemUseResult onUse(ItemStack item, UseHand hand) {
        item.setAmount(item.getAmount() - 1);
        TestMod.log.log("test");
        return ItemUseResult.SUCCESS;
    }
}
