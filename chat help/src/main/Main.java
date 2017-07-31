package main;
	
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import comandos.Fly;
import comandos.Gamemode;
import comandos.INV;
import comandos.TPR;
import evento.Inventarios;
import evento.Prédefinições;

public class Main extends JavaPlugin implements Listener{
	public static org.bukkit.plugin.Plugin me;
	
	
	@Override
	public void onEnable() {
		plugin = this;
		
	{
		getConfig().options().copyDefaults(true);
		saveConfig();
		//REGISTRAR EVENTO
		Bukkit.getServer().getPluginManager().registerEvents(new Prédefinições(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new Inventarios(), this);
		 this.getCommand("tpr").setExecutor(new TPR());
		 this.getCommand("gm").setExecutor(new Gamemode());
		 this.getCommand("inv").setExecutor(new INV());
		 this.getCommand("fly").setExecutor(new Fly());
		 
		
		//AOLIGAR
		System.out.print("§3Ligado");
		Main.me = this;
		
		super.onEnable();
		}
	
		
	}
	@Override
	public void onDisable() {
		System.out.print("§4Desligado");
		super.onDisable();
	}
	public boolean 
	onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(cmd.getName().equalsIgnoreCase("LOOLSD")){
            Player player = (Player) sender;
            player.sendMessage(ChatColor.YELLOW + "Você está sendo teleportado" + ChatColor.DARK_GREEN + "28" + ChatColor.YELLOW + "segundos.");
            player.teleport(new Location(Bukkit.getWorld("world"), 0, 69, 0));
            return true;
        } 
        return false;}
	public static Main plugin;






	}

	
    







