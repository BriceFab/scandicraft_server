package net.scandicraft.items;

import net.minecraft.server.*;

public class ScepterRepair extends Item {

    public ScepterRepair() {
        this.setCreativeTab(CreativeModeTab.tabCombat);
        this.setMaxStackSize(1);
    }

    @Override
    public ItemStack a(ItemStack itemStackIn, World worldIn, EntityHuman playerIn) {    //a = onItemRightClick
        repairStuff(playerIn.inventory.items);          //mainInventory
        repairStuff(playerIn.inventory.armor);          //armorInventory

        if (!playerIn.abilities.canInstantlyBuild) {    //capabilities.isCreativeMode
            --itemStackIn.count;    //stackSize
        }

        return itemStackIn;
    }

    private void repairStuff(ItemStack[] items) {
        for (ItemStack item : items) {
            if (item != null && item.isItemDamaged()) {
                item.setItemDamage(0);
            }
        }
    }

}
