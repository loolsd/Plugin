package comandos;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class TPR
 implements CommandExecutor, Listener
 {
	public boolean 
	onCommand(CommandSender sender, Command cmd, String label, String[] args){
		 if (sender instanceof Player){
            Player player = (Player) sender;
            player.sendMessage(ChatColor.YELLOW + "Voc� est� sendo teleportado" );
            player.teleport(new Location(Bukkit.getWorld("world"), 0, 69, 0));
            return true;
        } 
        return false;}

}
