package me.jiaqiaosu.sfaddon;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import items.FireCake;
import items.MyPickaxe;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class SFAddon extends JavaPlugin implements SlimefunAddon {
    public static SFAddon instance;
    @Override
    public void onEnable() {
        getLogger().info("SFAddon is enabled");
    }
    @Override
    public void onDisable() {

    }
    public SlimefunAddon getSFAddon() {
        return this;
    }
    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    @Nullable
    @Override
    public String getBugTrackerURL() {
        return null;
    }

    @Nonnull
    @Override
    public String getPluginVersion() {
        return SlimefunAddon.super.getPluginVersion();
    }

    @Override
    public boolean hasDependency(@Nonnull String dependency) {
        return SlimefunAddon.super.hasDependency(dependency);
    }
}
