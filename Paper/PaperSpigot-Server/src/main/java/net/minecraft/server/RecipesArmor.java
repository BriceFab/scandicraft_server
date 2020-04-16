package net.minecraft.server;

public class RecipesArmor {

    private String[][] a = new String[][]{{"XXX", "X X"}, {"X X", "XXX", "XXX"}, {"XXX", "X X", "X X"}, {"X X", "X X"}};
    private Item[][] b;

    public RecipesArmor() {
        //ScandiCraft: BriceFab RecipesArmor
        this.b = new Item[][]{
                {Items.LEATHER, Items.IRON_INGOT, Items.DIAMOND, Items.GOLD_INGOT, Items.SCANDIUM, Items.PYRITE, Items.LAZURITE},
                {Items.LEATHER_HELMET, Items.IRON_HELMET, Items.DIAMOND_HELMET, Items.GOLDEN_HELMET, Items.SCANDIUM_HELMET, Items.PYRITE_HELMET, Items.LAZURITE_HELMET},
                {Items.LEATHER_CHESTPLATE, Items.IRON_CHESTPLATE, Items.DIAMOND_CHESTPLATE, Items.GOLDEN_CHESTPLATE, Items.SCANDIUM_CHESTPLATE, Items.PYRITE_CHESTPLATE, Items.LAZURITE_CHESTPLATE},
                {Items.LEATHER_LEGGINGS, Items.IRON_LEGGINGS, Items.DIAMOND_LEGGINGS, Items.GOLDEN_LEGGINGS, Items.SCANDIUM_LEGGINGS, Items.PYRITE_LEGGINGS, Items.LAZURITE_LEGGINGS},
                {Items.LEATHER_BOOTS, Items.IRON_BOOTS, Items.DIAMOND_BOOTS, Items.GOLDEN_BOOTS, Items.SCANDIUM_BOOTS, Items.PYRITE_BOOTS, Items.LAZURITE_BOOTS}
        };
    }

    public void a(CraftingManager craftingmanager) {
        for (int i = 0; i < this.b[0].length; ++i) {
            Item item = this.b[0][i];

            for (int j = 0; j < this.b.length - 1; ++j) {
                Item item1 = this.b[j + 1][i];

                craftingmanager.registerShapedRecipe(new ItemStack(item1), new Object[]{this.a[j], Character.valueOf('X'), item});
            }
        }

    }
}
