package org.waveapi.testmod;

import org.waveapi.api.content.items.WaveItem;
import org.waveapi.api.content.items.WaveShapedRecipe;
import org.waveapi.api.content.items.models.SimpleItemModel;
import org.waveapi.api.math.Vector3;
import org.waveapi.api.world.entity.DamageSource;
import org.waveapi.api.world.entity.living.EntityPlayer;
import org.waveapi.api.world.inventory.ItemStack;
import org.waveapi.api.world.inventory.ItemUseResult;
import org.waveapi.api.world.inventory.UseHand;

public class TestItem extends WaveItem {
    public TestItem() {
        super("test_item", TestMod.getInstance());

        setModel(new SimpleItemModel("test/test_item.png"));
        setTab(TestTab.getInstance());

        addTranslation("en_us", "Test Item");


        new WaveShapedRecipe(this,
                    new String[] {
                            "###",
                            "#@#",
                            "###"
                    }, TestMod.getInstance())
                .addIngredient('#', "minecraft:stone")
                .addIngredient('@' , "minecraft:emerald");
    }

    @Override
    public ItemUseResult onUse(ItemStack item, UseHand hand, EntityPlayer player) {
        item.setAmount(item.getAmount() - 1);
        player.setVelocity(new Vector3(0, 0.5, 3.5).rotateY(-player.getHeadYaw() * (float)Math.PI / 180f));
        player.damage(DamageSource.GENERIC, 2);
        return ItemUseResult.SUCCESS;
    }
}