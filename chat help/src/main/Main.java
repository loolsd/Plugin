package main;
	
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import evento.Prédefinições;

public class Main extends JavaPlugin{
	
	public static org.bukkit.plugin.Plugin me;
	
	@Override
	public void onEnable() {
		plugin = this;
		
		//REGISTRAR EVENTO
		Bukkit.getServer().getPluginManager().registerEvents(new Prédefinições(), this);
		//AOLIGAR
		System.out.print("§3Ligado");
		this.me = this;
		super.onEnable();
		
	}
	@Override
	public void onDisable() {
		System.out.print("§4Desligado");
		super.onDisable();
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(cmd.getName().equalsIgnoreCase("LOOLSD")){
            Player player = (Player) sender;
            player.sendMessage(ChatColor.YELLOW + "Você está sendo teleportado" + ChatColor.DARK_GREEN + "28" + ChatColor.YELLOW + "segundos.");
            player.teleport(new Location(Bukkit.getWorld("world"), 0, 69, 0));
            return true;
        } 
        return true;}
	public static Main plugin;






	}

	
    







