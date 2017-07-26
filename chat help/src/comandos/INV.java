package comandos;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class INV
  implements Listener, CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args)
  {
    if (!(sender instanceof Player))
    {
      sender.sendMessage("Comandos apenas no servidor!");
      return true;
    }
    Player p = (Player)sender;
    if (cmd.getName().equalsIgnoreCase("inv"))
    {
      {
        sender.sendMessage("Escolha o nome do jogador!");
        if (args.length > 0)
        {
          Player player = Bukkit.getPlayer(args[0]);
          if (player == null)
          {
            sender.sendMessage("O jogador esta offline");
            return true;
          }
          sender.sendMessage("Voce abriu o inventario do jogador " + player.getName());
          p.openInventory(player.getInventory());
        }
      }
      
      {
        p.sendMessage("");
      }
      return true;
    }
    return true;
  }
}
