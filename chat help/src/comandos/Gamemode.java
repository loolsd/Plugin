package comandos;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gamemode
  implements CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
  {

	    Player player = (Player)sender;
	    Player jogador = (Player)sender;
	    if (cmd.getName().equalsIgnoreCase("gm"))
	    {
	      if (!jogador.hasPermission("comando.gm"))
	      {
	        jogador.sendMessage("");
	        return true;
	      }
	      if (args.length != 1)
	      {
	        player.sendMessage("Use /Gm (0)(1)(2)");
	        return true;
	      }
	      if (args.length == 1)
	      {
	        if (args[0].equalsIgnoreCase("0"))
	        {
	          player.setGameMode(GameMode.SURVIVAL);
	          player.sendMessage("Gamemode Atualizado");
	        }
	        if (args[0].equalsIgnoreCase("1"))
	        {
	          player.setGameMode(GameMode.CREATIVE);
	          player.sendMessage("Gamemode Atualizado");
	        }
	        if (args[0].equalsIgnoreCase("2"))
	        {
	          player.setGameMode(GameMode.ADVENTURE);
	          player.sendMessage("Gamemode Atualizado");
	        }
	        return true;
	      }
	    }
	    return false;
	  }
	}