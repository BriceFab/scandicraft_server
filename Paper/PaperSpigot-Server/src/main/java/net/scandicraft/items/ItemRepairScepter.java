package net.scandicraft.items;

import net.minecraft.server.*;

public class ItemRepairScepter extends Item {

    public ItemRepairScepter() {
        this.a(CreativeModeTab.j);  //setCreativeTab
        this.c(1);                  //setMaxStackSize
    }

    /**
     * Called when a Block is right-clicked with this Item
     */
    public ItemStack a(ItemStack itemStackIn, World worldIn, EntityHuman playerIn) {
        repairStuff(playerIn.inventory.items); //mainInventory
        repairStuff(playerIn.inventory.armor);

        if (!playerIn.abilities.canInstantlyBuild) {
            --itemStackIn.count;
        }

        return itemStackIn;
    }

    private void repairStuff(ItemStack[] items) {
        for (ItemStack item : items) {
            if (item != null && item.g()) { //g = isItemDamaged
                item.setData(0); //setItemDamage
            }
        }
    }

}
