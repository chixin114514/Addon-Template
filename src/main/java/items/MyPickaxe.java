package items;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ToolUseHandler;
import me.jiaqiaosu.sfaddon.SFAddon;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class MyPickaxe extends SlimefunItem {
    public MyPickaxe(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }
    @Override
    public void preRegister() {
        ToolUseHandler handler = this::onToolUse;
        addItemHandler(handler);

    }

    private void onToolUse(BlockBreakEvent blockBreakEvent, ItemStack itemStack, int i, List<ItemStack> itemStacks) {
        blockBreakEvent.getPlayer().sendMessage("EXP+1");
        ItemStack item = blockBreakEvent.getPlayer().getInventory().getItemInMainHand();
        List<String> lore = item.getItemMeta().getLore();
        String expString = lore.get(lore.size() - 1);
        String StringExp = expString.substring(expString.indexOf("：")+1);
        Integer exp = Integer.valueOf(StringExp);
        lore.set(item.getItemMeta().getLore().size()-1,("§6EXP："+ ++exp));
        ItemMeta meta = item.getItemMeta();
        meta.setLore(lore);
        item.setItemMeta(meta);

    }
}
