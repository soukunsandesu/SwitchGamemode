package soukunsandesu.switchgamemode;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class ChangeGamemode implements Listener {
    @EventHandler
    public void SwitchGamemode(PlayerInteractEvent e) {
        if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (e.getItem().getType() == Material.DIAMOND) {

                if (e.getPlayer().getGameMode() == GameMode.CREATIVE) {
                    e.getPlayer().setGameMode(GameMode.SURVIVAL);
                    e.getPlayer().sendMessage("\u30B2\u30FC\u30E0\u30E2\u30FC\u30C9\u304C" + ChatColor.RED + "\u30B5\u30D0\u30A4\u30D0\u30EB\u30E2\u30FC\u30C9" + ChatColor.WHITE + "\u306B\u5909\u66F4\u3055\u308C\u307E\u3057\u305F");
                    return;
                }
                if (e.getPlayer().getGameMode() != GameMode.CREATIVE) {
                    e.getPlayer().setGameMode(GameMode.CREATIVE);
                    e.getPlayer().sendMessage("\u30B2\u30FC\u30E0\u30E2\u30FC\u30C9\u304C" + ChatColor.YELLOW + "\u30AF\u30EA\u30A8\u30A4\u30C6\u30A3\u30D6\u30E2\u30FC\u30C9" + ChatColor.WHITE + "\u306B\u5909\u66F4\u3055\u308C\u307E\u3057\u305F");
                }
            }
        }
    }
}