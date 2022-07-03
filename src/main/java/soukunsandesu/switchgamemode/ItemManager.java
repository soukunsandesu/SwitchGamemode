package soukunsandesu.switchgamemode;

import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.ArrayList;

public class ItemManager
{
    public ItemStack SetItem(Material m, String name, String desc, boolean isUnbreakable)
    {
        ItemStack item = new ItemStack (m, 1);
        ArrayList<String> lore = new ArrayList<String>();
        String[] newDesc = desc.split("\n");
        for (int i = 0; i < newDesc.length; i++)
            lore.add(newDesc[i]);

        ItemMeta im = item.getItemMeta();

        if (name != "") //nameが空の時は名前を設定しない
            im.setDisplayName(name);
        if (desc != "") //descが空の時は名前を設定しない
            im.setLore(lore);
        im.setUnbreakable(isUnbreakable);

        im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(im);
        return item;
    }
}