package net.scandicraft.items;

import net.minecraft.server.*;
import net.scandicraft.potion.ScandiPotion;
import net.scandicraft.utils.MathUtils;

public class ScepterFalling extends Item {

    public ScepterFalling() {
        this.setCreativeTab(CreativeModeTab.tabCombat);
        this.setMaxStackSize(1);
    }

    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityHuman playerIn) {
        if (!playerIn.abilities.canInstantlyBuild) {
            --itemStackIn.count;
        }

        //20 ticks = 1 seconde
        playerIn.addPotionEffect(new MobEffect(ScandiPotion.feather_falling.id, MathUtils.convertMinutesToTicks(5)));    //5 mn

        return itemStackIn;
    }

}
