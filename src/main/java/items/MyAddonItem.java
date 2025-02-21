package items;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class MyAddonItem {
    SlimefunItemStack itemStack = new SlimefunItemStack("MY_ADDON_ITEM",
            Material.EMERALD,
            "&a炫酷的绿宝石",
            "", "&7听说很值钱");


//    public MyAddonItem(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
//        super(itemGroup, item, recipeType, recipe);
//    }
}
