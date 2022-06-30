package soukunsandesu.switchgamemode;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class ChangeGamemode implements Listener
{
    @EventHandler
    public void SwitchGamemode(PlayerInteractEvent event)
    {
        GameMode CurrentGameMode = event.getPlayer().getGameMode();
        boolean ClickedDiamond = (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) && event.getItem().getType() == Material.DIAMOND;
        if (ClickedDiamond)
        {
            switch (CurrentGameMode)
            {
                case CREATIVE:
                    SwitchTo(event, GameMode.SURVIVAL);
                    break;
                case SURVIVAL:
                    SwitchTo(event, GameMode.CREATIVE);
                    break;
            }
        }
    }
    private static void SwitchTo(PlayerInteractEvent event, GameMode gamemode)
    {
        String GameModeText = "";
        ChatColor color = ChatColor.WHITE;
        switch (gamemode)
        {
            case CREATIVE:
                GameModeText = "\u30af\u30ea\u30a8\u30a4\u30c6\u30a3\u30d6\u30e2\u30fc\u30c9";
                color = ChatColor.LIGHT_PURPLE;
                break;
            case SURVIVAL:
                GameModeText = "\u30b5\u30d0\u30a4\u30d0\u30eb\u30e2\u30fc\u30c9";
                color = ChatColor.GREEN;
                break;
            case ADVENTURE:
                GameModeText = "\u30a2\u30c9\u30d9\u30f3\u30c1\u30e3\u30fc\u30e2\u30fc\u30c9";
                color = ChatColor.RED;
                break;
            case SPECTATOR:
                GameModeText = "\u30b9\u30da\u30af\u30c6\u30a4\u30bf\u30fc\u30e2\u30fc\u30c9";
                color = ChatColor.GRAY;
                break;
            default:
                break;
        }
        event.getPlayer().setGameMode(gamemode);
        event.getPlayer().sendMessage("\u30B2\u30FC\u30E0\u30E2\u30FC\u30C9\u304C" + color + GameModeText + ChatColor.WHITE + "\u306B\u5909\u66F4\u3055\u308C\u307E\u3057\u305F");
    }
}