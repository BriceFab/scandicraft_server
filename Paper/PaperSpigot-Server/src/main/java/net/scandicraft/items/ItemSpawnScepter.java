package net.scandicraft.items;

import net.minecraft.server.*;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class ItemSpawnScepter extends Item {
    private final int CREEPER_METADATA = 50;

    public ItemSpawnScepter(int max_uses) {
        this.a(CreativeModeTab.j);
        this.setMaxDurability(max_uses - 1); //car 0 est pris en compte
        this.c(1);  //setMaxStackSize
    }

    /**
     * Called when a Block is right-clicked with this Item
     */
    public boolean interactWith(ItemStack stack, EntityHuman playerIn, World worldIn, BlockPosition pos, EnumDirection side, float hitX, float hitY, float hitZ) {
        if (worldIn.isClientSide) {
            return true;
        } else if (!playerIn.a(pos.shift(side), side, stack)) {
            return false;
        } else {
            IBlockData iblockdata = worldIn.getType(pos);

            pos = pos.shift(side);
            double d0 = 0.0D;

            if (side == EnumDirection.UP && iblockdata instanceof BlockFence) {
                d0 = 0.5D;
            }

            Entity entity = spawnCreature(worldIn, CREEPER_METADATA, (double) pos.getX() + 0.5D, (double) pos.getY() + d0, (double) pos.getZ() + 0.5D, CreatureSpawnEvent.SpawnReason.SPAWNER_EGG);

            if (entity != null) {
                if (entity instanceof EntityLiving && stack.hasName()) {
                    entity.setCustomName(stack.getName());
                }
            }

            stack.damage(1, playerIn);

            return true;
        }
    }

    /**
     * Spawns the creature specified by the egg's type in the location specified by the last three parameters.
     * Parameters: world, entityID, x, y, z.
     */
    public static Entity spawnCreature(World world, int i, double d0, double d1, double d2, org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason spawnReason) {
        // CraftBukkit end
        if (!EntityTypes.eggInfo.containsKey(Integer.valueOf(i))) {
            return null;
        } else {
            Entity entity = null;

            for (int j = 0; j < 1; ++j) {
                entity = EntityTypes.a(i, world);
                if (entity instanceof EntityLiving) {
                    EntityInsentient entityinsentient = (EntityInsentient) entity;

                    entity.setPositionRotation(d0, d1, d2, MathHelper.g(world.random.nextFloat() * 360.0F), 0.0F);
                    entityinsentient.aK = entityinsentient.yaw;
                    entityinsentient.aI = entityinsentient.yaw;
                    entityinsentient.prepare(world.E(new BlockPosition(entityinsentient)), (GroupDataEntity) null);
                    // CraftBukkit start - don't return an entity when CreatureSpawnEvent is canceled
                    if (!world.addEntity(entity, spawnReason)) {
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
