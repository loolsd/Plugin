package evento;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.weather.ThunderChangeEvent;
import org.bukkit.event.weather.WeatherChangeEvent;


public class Prédefinições 
   implements Listener {
	//Permissões
	   @EventHandler
	   public void Aoentrar(PlayerJoinEvent j) {
		   Player  p = j.getPlayer();
		   Location loc = j.getPlayer().getLocation();
		   j.setJoinMessage("§6Seja bem-vindo_" + "§3" + p.getName());
		   p.getPlayer().getLocation();
		   p.playSound(loc, Sound.EXPLODE, 3.0f, 0.5f );
		   p.teleport(new Location(Bukkit.getWorld("world"), 13, 4, 19));
		   p.getInventory().clear();
	   }
	
	   @EventHandler
       public void ColocarBloco(BlockPlaceEvent e) {
               Block block = e.getBlock();
               Player p = e.getPlayer();
               Location loc = block.getLocation();
               Location ploc = p.getPlayer().getLocation();
               p.playSound(ploc, Sound.LAVA_POP, 3.0f, 0.5f);
               e.setCancelled(true);}

	 @EventHandler
	    public void enderpearl(PlayerInteractEvent e) {
	        Player p = e.getPlayer();
	        if ((e.getAction() == Action.RIGHT_CLICK_BLOCK)||(e.getAction() == Action.RIGHT_CLICK_AIR)||(e.getAction() == Action.LEFT_CLICK_BLOCK)||(e.getAction() == Action.LEFT_CLICK_AIR)) {
	           if(p.getItemInHand().getType().equals(org.bukkit.Material.ENDER_PEARL)){
	              e.setCancelled(true);
	              e.getPlayer().sendMessage("§9Enderpearl está desativada");{}
	           }}
	            	 
	              }

	 @EventHandler
	    public void atirarflecha(PlayerInteractEvent e) {
	        Player p = e.getPlayer();
	        if ((e.getAction() == Action.RIGHT_CLICK_BLOCK)||(e.getAction() == Action.RIGHT_CLICK_AIR)||(e.getAction() == Action.LEFT_CLICK_BLOCK)||(e.getAction() == Action.LEFT_CLICK_AIR)) {
	           if(p.getItemInHand().getType().equals(org.bukkit.Material.BOW)){
	              e.setCancelled(true);
	              e.getPlayer().sendMessage("§9Arco está desativado");}
	           }
	        }
	 @EventHandler
	 public void atirarovo(PlayerInteractEvent e) {
	        Player p = e.getPlayer();
	        if ((e.getAction() == Action.RIGHT_CLICK_BLOCK)||(e.getAction() == Action.RIGHT_CLICK_AIR)||(e.getAction() == Action.LEFT_CLICK_BLOCK)||(e.getAction() == Action.LEFT_CLICK_AIR)) {
	           if(p.getItemInHand().getType().equals(org.bukkit.Material.EGG)){
	              e.setCancelled(true);
	              e.getPlayer().sendMessage("§9ovo está desativado");}
	           }
	        }
	 @EventHandler
	 public void usarvara(PlayerInteractEvent e) {
	        Player p = e.getPlayer();
	        if ((e.getAction() == Action.RIGHT_CLICK_BLOCK)||(e.getAction() == Action.RIGHT_CLICK_AIR)||(e.getAction() == Action.LEFT_CLICK_BLOCK)||(e.getAction() == Action.LEFT_CLICK_AIR)) {
	           if(p.getItemInHand().getType().equals(org.bukkit.Material.FISHING_ROD)){
	              e.setCancelled(true);
	              e.getPlayer().sendMessage("§9Vara de pesca está desativada");}
	           }
	        }
	 @EventHandler
	 public void boladegelo(PlayerInteractEvent e) {
	        Player p = e.getPlayer();
	        if ((e.getAction() == Action.RIGHT_CLICK_BLOCK)||(e.getAction() == Action.RIGHT_CLICK_AIR)||(e.getAction() == Action.LEFT_CLICK_BLOCK)||(e.getAction() == Action.LEFT_CLICK_AIR)) {
	           if(p.getItemInHand().getType().equals(org.bukkit.Material.SNOW_BALL)){
	              e.setCancelled(true);
	              e.getPlayer().sendMessage("§9Bola de neve está desabilitada");}
	           }
	        }
	 @EventHandler
	 public void baldeagua(PlayerInteractEvent e) {
	        Player p = e.getPlayer();
	        if ((e.getAction() == Action.RIGHT_CLICK_BLOCK)||(e.getAction() == Action.RIGHT_CLICK_AIR)||(e.getAction() == Action.LEFT_CLICK_BLOCK)||(e.getAction() == Action.LEFT_CLICK_AIR)) {
	           if(p.getItemInHand().getType().equals(org.bukkit.Material.WATER_BUCKET)){
	              e.setCancelled(true);
	              e.getPlayer().sendMessage("§9este item está desabilitado");}
	           }
	        }
	 @EventHandler
	 public void baldelava(PlayerInteractEvent e) {
	        Player p = e.getPlayer();
	        if ((e.getAction() == Action.RIGHT_CLICK_BLOCK)||(e.getAction() == Action.RIGHT_CLICK_AIR)||(e.getAction() == Action.LEFT_CLICK_BLOCK)||(e.getAction() == Action.LEFT_CLICK_AIR)) {
	           if(p.getItemInHand().getType().equals(org.bukkit.Material.LAVA_BUCKET)){
	              e.setCancelled(true);
	              e.getPlayer().sendMessage("§9este item está desabilitado");}
	           }
	        }

	 @EventHandler
	    public void onPlayerBreakBlock(BlockBreakEvent event) {
	        Player p = event.getPlayer();
	        Block b = event.getBlock();
	        Location loc = p.getPlayer().getLocation();
	        p.playSound(loc, Sound.LAVA_POP, 1.0f, 0.5f);
	      
	        event.setCancelled(true);
	    }
	  @EventHandler
	   public void onHungerDeplete(FoodLevelChangeEvent e) {
	     
	     e.setCancelled(true);
	     e.setFoodLevel(10);}
	              

	
	 
	@EventHandler(priority=EventPriority.HIGHEST)
    public void onWeatherChange(WeatherChangeEvent event) {
      
        boolean rain = event.toWeatherState();
        if(rain)
            event.setCancelled(true);
		  }
	  @EventHandler(priority=EventPriority.HIGHEST)
	    public void onThunderChange(ThunderChangeEvent event) {
	      
	        boolean storm = event.toThunderState();
	        if(storm)
	            event.setCancelled(true);
	    }
	  @EventHandler
	    public void aobater(EntityDamageEvent event){
	        if (event.getEntity() instanceof Player){
	            event.setCancelled(true);
	  
	       }
	        }
	  
	 //MOBS
	  @EventHandler(priority = EventPriority.NORMAL)
	  public void onCreatureSpawn(CreatureSpawnEvent event) {
	 
	  if(event.getLocation().getWorld().getName() != "allowed-world") {
	  if(event.getSpawnReason() != CreatureSpawnEvent.SpawnReason.CUSTOM) {
	  event.setCancelled(true);
	  }
	  }
	  }
	   
	  }

