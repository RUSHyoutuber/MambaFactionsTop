package br.com.kickpost.ftop.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import br.com.kickpost.ftop.inventory.InventoryLoader;
import br.com.kickpost.ftop.inventory.utils.Type;

public class onPlayerCommand implements Listener {

	@EventHandler(priority = EventPriority.HIGH, ignoreCancelled = true)
	public void onCommand(PlayerCommandPreprocessEvent e) {
		String message = e.getMessage().toLowerCase();
		if (message.startsWith("/f top")) {
			e.setCancelled(true);
			InventoryLoader.open(e.getPlayer(), Type.MENU);
		}
	}

}