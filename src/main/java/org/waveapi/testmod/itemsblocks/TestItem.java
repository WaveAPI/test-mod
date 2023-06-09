package org.waveapi.testmod.itemsblocks;

import org.waveapi.api.content.entities.EntityCreation;
import org.waveapi.api.content.items.WaveItem;
import org.waveapi.api.content.items.models.SimpleItemModel;
import org.waveapi.api.content.items.recipes.WaveShapedRecipe;
import org.waveapi.api.math.BlockPos;
import org.waveapi.api.math.Vector3;
import org.waveapi.api.world.entity.EntityBase;
import org.waveapi.api.world.entity.living.EntityPlayer;
import org.waveapi.api.world.inventory.ItemStack;
import org.waveapi.api.world.inventory.ItemUseResult;
import org.waveapi.api.world.inventory.UseHand;
import org.waveapi.api.world.world.World;
import org.waveapi.testmod.TestMod;
import org.waveapi.testmod.TestTab;

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
    public ItemUseResult onUse(ItemStack item, UseHand hand, EntityPlayer player, World world) {
        BlockPos lookingAt = player.getBlockLookingAt(4.0);
        if (lookingAt != null && !world.isClientSide()) {
            item.setAmount(item.getAmount() - 1);
            Vector3 loc = lookingAt.toVector3().add(0.5, 1.5, 0.5);

            EntityBase entityBase = EntityCreation.create(TestMod.entityType, world);
            entityBase.setPosition(loc);

            player.sendActionBar("[Successfully placed a Test Item!]");

            player.giveItem(TestMod.another_item.getDefaultStack());

            world.addEntity(entityBase);

        }
        return ItemUseResult.SUCCESS;
    }
}