package net.minecraft.server;

public class RecipesWeapons {
    private String[][] a = new String[][]{{"X", "X", "#"}};

    private Object[][] b = new Object[][]{
            {Blocks.PLANKS, Blocks.COBBLESTONE, Items.IRON_INGOT, Items.DIAMOND, Items.GOLD_INGOT, Items.SCANDIUM, Items.PYRITE, Items.LAZURITE},
            {Items.WOODEN_SWORD, Items.STONE_SWORD, Items.IRON_SWORD, Items.DIAMOND_SWORD, Items.GOLDEN_SWORD, Items.SCANDIUM_SWORD, Items.PYRITE_SWORD, Items.LAZURITE_SWORD}
    };

    public void a(CraftingManager paramCraftingManager) {
        for (byte b = 0; b < (this.b[0]).length; b++) {
            Object object = this.b[0][b];
            for (byte b1 = 0; b1 < this.b.length - 1; b1++) {
                Item item = (Item) this.b[b1 + 1][b];
                paramCraftingManager.registerShapedRecipe(new ItemStack(item), this.a[b1], '#', Items.STICK, 'X', object);
            }
        }
        paramCraftingManager.registerShapedRecipe(new ItemStack(Items.BOW, 1), " #X", "# X", " #X", 'X', Items.STRING, '#', Items.STICK);
        paramCraftingManager.registerShapedRecipe(new ItemStack(Items.ARROW, 4), "X", "#", "Y", 'Y', Items.FEATHER, 'X', Items.FLINT, '#', Items.STICK);
    }
}
