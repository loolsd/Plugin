package evento;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

	public class MeuInv 
	implements Listener {
		public static Inventory inventario = Bukkit.createInventory(null, 18, "§6Inventario");
		static {
			
			inventario.setItem(0, new ItemStack(Material.GOLD_AXE, 1));
			inventario.setItem(1, new ItemStack(Material.STAINED_GLASS_PANE, 1));
			inventario.setItem(2, new ItemStack(Material.STAINED_GLASS_PANE, 1));
			inventario.setItem(3, new ItemStack(Material.STAINED_GLASS_PANE, 1));
			inventario.setItem(4, new ItemStack(Material.STAINED_GLASS_PANE, 1));
			inventario.setItem(5, new ItemStack(Material.STAINED_GLASS_PANE, 1));
			inventario.setItem(6, new ItemStack(Material.STAINED_GLASS_PANE, 1));
			inventario.setItem(7, new ItemStack(Material.STAINED_GLASS_PANE, 1));
			inventario.setItem(8, new ItemStack(Material.GOLD_BLOCK, 1));
			inventario.setItem(9, new ItemStack(Material.STAINED_GLASS_PANE, 1));
			inventario.setItem(10, new ItemStack(Material.STAINED_GLASS_PANE, 1));
			inventario.setItem(11, new ItemStack(Material.STAINED_GLASS_PANE, 1));
			inventario.setItem(12, new ItemStack(Material.STAINED_GLASS_PANE, 1));
			inventario.setItem(13, new ItemStack(Material.STAINED_GLASS_PANE, 1));
			inventario.setItem(14, new ItemStack(Material.STAINED_GLASS_PANE, 1));
			inventario.setItem(15, new ItemStack(Material.STAINED_GLASS_PANE, 1));
			inventario.setItem(16, new ItemStack(Material.STAINED_GLASS_PANE, 1));
			inventario.setItem(17, new ItemStack(Material.STAINED_GLASS_PANE, 1));
			
		}
		@EventHandler
		public void clicarnoinventario(InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked(); 
		ItemStack clicked = event.getCurrentItem(); 
		Inventory inventory = event.getInventory(); 
		if (inventory.getName().equals(inventario.getName())) { 
		if (clicked.getType() == Material.GOLD_AXE) { 
		event.setCancelled(true); 
		player.closeInventory(); 
		player.teleport(new Location(Bukkit.getWorld("world"), 0, 69, 0));
		if (clicked.getType() == Material.GOLD_BLOCK) {
		player.closeInventory();
			
		}
		}
		}
		}
		@EventHandler
		public void Maça(PlayerInteractEvent e) {
	        Player p = e.getPlayer();
	        if ((e.getAction() == Action.RIGHT_CLICK_BLOCK)||(e.getAction() == Action.RIGHT_CLICK_AIR)||(e.getAction() == Action.LEFT_CLICK_BLOCK)||(e.getAction() == Action.LEFT_CLICK_AIR)) {
	           if(p.getItemInHand().getType().equals(org.bukkit.Material.COMPASS)){
	        	   p.openInventory(inventario);
	              
		}
		}
	}
		}


