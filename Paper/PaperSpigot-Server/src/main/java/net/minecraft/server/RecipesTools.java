package net.minecraft.server;

public class RecipesTools {
  private String[][] a = new String[][] { { "XXX", " # ", " # " }, { "X", "#", "#" }, { "XX", "X#", " #" }, { "XX", " #", " #" } };
  
  private Object[][] b = new Object[][] {
          //ScandiCraft: BriceFab RecipesTools
          { Blocks.PLANKS, Blocks.COBBLESTONE, Items.IRON_INGOT, Items.DIAMOND, Items.GOLD_INGOT, Items.SCANDIUM, Items.PYRITE, Items.LAZURITE },
          { Items.WOODEN_PICKAXE, Items.STONE_PICKAXE, Items.IRON_PICKAXE, Items.DIAMOND_PICKAXE, Items.GOLDEN_PICKAXE, Items.SCANDIUM_PICKAXE, Items.PYRITE_PICKAXE, Items.LAZURITE_PICKAXE },
          { Items.WOODEN_SHOVEL, Items.STONE_SHOVEL, Items.IRON_SHOVEL, Items.DIAMOND_SHOVEL, Items.GOLDEN_SHOVEL, Items.SCANDIUM_SHOVEL, Items.PYRITE_SHOVEL, Items.LAZURITE_SHOVEL },
          { Items.WOODEN_AXE, Items.STONE_AXE, Items.IRON_AXE, Items.DIAMOND_AXE, Items.GOLDEN_AXE, Items.SCANDIUM_AXE, Items.PYRITE_AXE, Items.LAZURITE_AXE },
          { Items.WOODEN_HOE, Items.STONE_HOE, Items.IRON_HOE, Items.DIAMOND_HOE, Items.GOLDEN_HOE, Items.SCANDIUM_HOE, Items.PYRITE_HOE, Items.LAZURITE_HOE }
  };
  
  public void a(CraftingManager paramCraftingManager) {
    for (byte b = 0; b < (this.b[0]).length; b++) {
      Object object = this.b[0][b];
      for (byte b1 = 0; b1 < this.b.length - 1; b1++) {
        Item item = (Item)this.b[b1 + 1][b];
        paramCraftingManager.registerShapedRecipe(new ItemStack(item), this.a[b1], '#', Items.STICK, 'X', object);
      } 
    } 
    paramCraftingManager.registerShapedRecipe(new ItemStack(Items.SHEARS), " #", "# ", '#', Items.IRON_INGOT);
  }
}
