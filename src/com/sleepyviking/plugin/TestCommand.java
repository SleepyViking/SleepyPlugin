package com.sleepyviking.plugin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class TestCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if(sender instanceof Player){
            Player player = (Player) sender;

            ItemStack dirt = new ItemStack(Material.DIRT, 1);

            dirt.addUnsafeEnchantment(Enchantment.KNOCKBACK, 20);

            ItemMeta meta = dirt.getItemMeta();

            meta.setDisplayName(ChatColor.DARK_RED + "Doom Fist");

            dirt.setItemMeta(meta);

            player.getInventory().addItem(dirt);
        }
        return true;
    }
}
