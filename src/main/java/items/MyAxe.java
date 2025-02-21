package items;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;

public class MyAxe extends stdItem {

    public MyAxe(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }



}
//    public void initialize() {
//        id = "My_Axe";
//        material = Material.DIAMOND_AXE;
//        name = "&r钻石斧（自定义）";
//        lore = new String[0];
//    }
//    public MyAxe(ItemGroup itemGroup){
//        SlimefunItemStack item =
//        this(itemGroup,)
//    }
//    public MyAxe(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
//        super(itemGroup, item, recipeType, recipe);
//    }
//
//    @Override
//    public void preRegister() {
//
//    }
//}
