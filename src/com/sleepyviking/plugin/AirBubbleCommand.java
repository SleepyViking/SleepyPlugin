package com.sleepyviking.plugin;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class AirBubbleCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if(sender instanceof Player){
            Player player = (Player) sender;

            Location ploc = player.getLocation();

            player.getWorld().getBlockAt(ploc.getBlockX(), ploc.getBlockY() - 1, ploc.getBlockZ()).setType(Material.AIR);
            player.getWorld().getBlockAt(ploc.getBlockX(), ploc.getBlockY() - 2, ploc.getBlockZ()).setType(Material.AIR);
            player.getWorld().getBlockAt(ploc.getBlockX(), ploc.getBlockY() - 3, ploc.getBlockZ()).setType(Material.AIR);
            player.getWorld().getBlockAt(ploc.getBlockX(), ploc.getBlockY() - 4, ploc.getBlockZ()).setType(Material.AIR);
            player.sendMessage(ChatColor.DARK_RED + "ERRROR: " + ChatColor.WHITE + ChatColor.ITALIC + " 4 Blocks Removed. Please Board up Error and Try again.");

            /**
            double rot = (player.getLocation().getYaw() - 90) % 360;
            if (rot < 0) {
                rot += 360.0;
            }

            if (0 <= rot && rot < 45) {
                //North
            } else if (45 <= rot && rot < 135) {
                //East
            } else if (135 <= rot && rot < 225) {
                //South
            }  else if (225 <= rot && rot < 315) {
                //West
            }  else if (315 <= rot && rot < 360) {
                //North
            } else {
                player.sendMessage("Sorry your Command could not be fufilled.");
            }
             **/
        }
        return true;
    }
}
