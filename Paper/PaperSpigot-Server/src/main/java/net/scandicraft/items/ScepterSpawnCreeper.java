package net.scandicraft.items;

import net.minecraft.server.*;

public class ScepterSpawnCreeper extends Item {
    private final int CREEPER_METADATA = 50;

    public ScepterSpawnCreeper(int max_uses) {
        this.setCreativeTab(CreativeModeTab.tabCombat);
        this.setMaxDurability(max_uses - 1); //car 0 est pris en compte
        this.setMaxStackSize(1);
    }

    public boolean interactWith(ItemStack stack, EntityHuman playerIn, World worldIn, BlockPosition pos, EnumDirection side, float hitX, float hitY, float hitZ) {
        if (worldIn.isClientSide) {
            return true;
        } else if (!playerIn.canPlayerEdit(pos.shift(side), side, stack)) {
            return false;
        } else {
            IBlockData iblockstate = worldIn.getType(pos);

            pos = pos.shift(side);
            double d0 = 0.0D;

            if (side == EnumDirection.UP && iblockstate instanceof BlockFence) {
                d0 = 0.5D;
            }

            Entity entity = spawnCreature(worldIn, CREEPER_METADATA, (double) pos.getX() + 0.5D, (double) pos.getY() + d0, (double) pos.getZ() + 0.5D, org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason.SPAWNER_EGG);

            if (entity != null) {
                if (entity instanceof EntityLiving && stack.hasName()) {
                    entity.setCustomName(stack.getName());
                }
            }

            stack.damage(1, playerIn);

            return true;
        }
    }

    public static Entity spawnCreature(World worldIn, int entityID, double x, double y, double z, org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason spawnReason) {
        // CraftBukkit end
        if (!EntityTypes.eggInfo.containsKey(entityID)) {
            return null;
        } else {
            Entity entity = null;

            for (int j = 0; j < 1; ++j) {
                entity = EntityTypes.a(entityID, worldIn);
                if (entity instanceof EntityLiving) {
                    EntityInsentient entityinsentient = (EntityInsentient) entity;

                    entity.setPositionRotation(x, y, z, MathHelper.g(worldIn.random.nextFloat() * 360.0F), 0.0F);
                    entityinsentient.aK = entityinsentient.yaw;
                    entityinsentient.aI = entityinsentient.yaw;
                    entityinsentient.prepare(worldIn.E(new BlockPosition(entityinsentient)), null);
                    // CraftBukkit start - don't return an entity when CreatureSpawnEvent is canceled
                    if (!worldIn.addEntity(entity, spawnReason)) {
                        entity = null;
                    } else {
                        entityinsentient.x();
                    }
                    // CraftBukkit end
                }
            }

            return entity;
        }
    }
}
