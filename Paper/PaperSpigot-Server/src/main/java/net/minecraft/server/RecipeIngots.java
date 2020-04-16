package net.minecraft.server;

public class RecipeIngots {
    private Object[][] a = new Object[][]{
            {Blocks.GOLD_BLOCK, new ItemStack(Items.GOLD_INGOT, 9)},
            {Blocks.IRON_BLOCK, new ItemStack(Items.IRON_INGOT, 9)},
            {Blocks.DIAMOND_BLOCK, new ItemStack(Items.DIAMOND, 9)},
            {Blocks.EMERALD_BLOCK, new ItemStack(Items.EMERALD, 9)},
            {Blocks.LAPIS_BLOCK, new ItemStack(Items.DYE, 9, EnumColor.BLUE.getInvColorIndex())},
            {Blocks.REDSTONE_BLOCK, new ItemStack(Items.REDSTONE, 9)},
            {Blocks.COAL_BLOCK, new ItemStack(Items.COAL, 9, 0)},
            {Blocks.HAY_BLOCK, new ItemStack(Items.WHEAT, 9)},
            {Blocks.SLIME, new ItemStack(Items.SLIME, 9)},
            {Blocks.SCANDIUM_BLOCK, new ItemStack(Items.SCANDIUM, 9)},
            {Blocks.PYRITE_BLOCK, new ItemStack(Items.PYRITE, 9)},
            {Blocks.LAZURITE_BLOCK, new ItemStack(Items.LAZURITE, 9)}
    };

    public void a(CraftingManager paramCraftingManager) {
        for (byte b = 0; b < this.a.length; b++) {
            Block block = (Block) this.a[b][0];
            ItemStack itemStack = (ItemStack) this.a[b][1];
            paramCraftingManager.registerShapedRecipe(new ItemStack(block), "###", "###", "###", '#', itemStack);
            paramCraftingManager.registerShapedRecipe(itemStack, "#", '#', block);
        }
        paramCraftingManager.registerShapedRecipe(new ItemStack(Items.GOLD_INGOT), "###", "###", "###", '#', Items.GOLD_NUGGET);
        paramCraftingManager.registerShapedRecipe(new ItemStack(Items.GOLD_NUGGET, 9), "#", '#', Items.GOLD_INGOT);
    }
}
