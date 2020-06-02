package net.scandicraft.items;

import net.minecraft.server.*;
import org.bukkit.event.entity.EntityCombustEvent;

public class ScandiumBow extends Item {

    public ScandiumBow() {
        this.maxStackSize = 1;
        this.setMaxDurability(500); //durabilité
        this.setCreativeTab(CreativeModeTab.tabCombat);
    }

    public void a(ItemStack stack, World worldIn, EntityHuman playerIn, int timeLeft) { //a = onPlayerStoppedUsing
        boolean flag = playerIn.abilities.canInstantlyBuild || EnchantmentManager.getEnchantmentLevel(Enchantment.ARROW_INFINITE.id, stack) > 0;

        if (flag || playerIn.inventory.hasItem(Items.ARROW)) {
            int i = this.d(stack) - timeLeft;
            float f = (float) i / 20.0F;
            f = (f * f + f * 2.0F) / 3.0F;

            if ((double) f < 0.1D) {
                return;
            }

            if (f > 1.0F) {
                f = 1.0F;
            }

            EntityArrow entityarrow = new EntityArrow(worldIn, playerIn, f * 2.0F);
            entityarrow.setDamage(entityarrow.getDamage() * 2); //2x plus puissante que la flèche de base

            if (f == 1.0F) {
                entityarrow.setCritical(true);
            }

            int j = EnchantmentManager.getEnchantmentLevel(Enchantment.ARROW_DAMAGE.id, stack);
            if (j > 0) {
                entityarrow.setDamage(entityarrow.getDamage() + (double) j * 0.5D + 0.5D);
            }

            int k = EnchantmentManager.getEnchantmentLevel(Enchantment.ARROW_KNOCKBACK.id, stack);
            if (k > 0) {
                entityarrow.setKnockbackStrength(k);
            }

            if (EnchantmentManager.getEnchantmentLevel(Enchantment.ARROW_FIRE.id, stack) > 0) {
                // CraftBukkit start - call EntityCombustEvent
                EntityCombustEvent event = new EntityCombustEvent(entityarrow.getBukkitEntity(), 100);
                entityarrow.world.getServer().getPluginManager().callEvent(event);

                if (!event.isCancelled()) {
                    entityarrow.setOnFire(event.getDuration());
                }
                // CraftBukkit end
            }

            // CraftBukkit start
            org.bukkit.event.entity.EntityShootBowEvent event = org.bukkit.craftbukkit.event.CraftEventFactory.callEntityShootBowEvent(playerIn, stack, entityarrow, f);
            if (event.isCancelled()) {
                event.getProjectile().remove();
                return;
            }

            if (event.getProjectile() == entityarrow.getBukkitEntity()) {
                worldIn.addEntity(entityarrow);
            }
            // CraftBukkit end

            stack.damage(1, playerIn);
            worldIn.makeSound(playerIn, "random.bow", 1.0F, 1.0F / (ItemBow.g.nextFloat() * 0.4F + 1.2F) + f * 0.5F);
            if (flag) {
                entityarrow.fromPlayer = 2;
            } else {
                playerIn.inventory.a(Items.ARROW);
            }

            playerIn.b(StatisticList.USE_ITEM_COUNT[Item.getId(this)]);
            if (!worldIn.isClientSide) {
                // world.addEntity(entityarrow); // CraftBukkit - moved up
            }
        }
    }

    /**
     * Called when the player finishes using this Item (E.g. finishes eating.). Not called when the player stops using
     * the Item before the action is complete.
     */
    public ItemStack b(ItemStack stack, World worldIn, EntityHuman playerIn) {  //b = onItemUseFinish
        return stack;
    }

    public int d(ItemStack itemstack) {
        return 72000;
    }

    public EnumAnimation e(ItemStack itemstack) {
        return EnumAnimation.BOW;
    }

    public ItemStack a(ItemStack itemstack, World world, EntityHuman entityhuman) {
        if (entityhuman.abilities.canInstantlyBuild || entityhuman.inventory.b(Items.ARROW)) {
            entityhuman.a(itemstack, this.d(itemstack));
        }

        return itemstack;
    }

    public int b() {
        return 1;
    }
}
