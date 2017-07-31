package evento;
import org.bukkit.block.Chest;
import org.bukkit.block.DoubleChest;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;



public class Inventarios 

implements Listener{

	 @EventHandler
	    public void Bau(InventoryOpenEvent e){
	        if (e.getInventory().getHolder() instanceof Chest || e.getInventory().getHolder() instanceof DoubleChest){
	        	e.setCancelled(true);}
	           
	        }
	 }
	
	 
	
	


