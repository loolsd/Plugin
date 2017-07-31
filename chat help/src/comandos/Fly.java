package comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly 
implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player)sender;
		if (cmd.getName().equalsIgnoreCase("fly"))
		{
		}
		    if(args.length == 0)
		    {
		        player.setAllowFlight(!player.getAllowFlight());
		    }
		    else if(args.length == 1)
		    {
		        if(args[0].equalsIgnoreCase("on"))
		        {
		            player.setAllowFlight(true);
		        }
		        else if(args[0].equalsIgnoreCase("off"))
		        {
		            player.setAllowFlight(false);
		        }
		        else
		        {
		            
		            player.sendMessage("use /fly on:off");
		            return true;
		        }
		    }
		    player.sendMessage("§6Voar está "+(player.getAllowFlight() ? "habilitado" : "desabilitado"));
			return false;
		}
	}
		