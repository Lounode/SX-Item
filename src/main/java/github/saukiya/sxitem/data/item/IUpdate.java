package github.saukiya.sxitem.data.item;

import github.saukiya.sxitem.nbt.NBTWrapper;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * 用于表示这个 IGenerator 适合更新
 *
 * @author Saukiya
 */
public interface IUpdate {

    String getKey();

    ConfigurationSection getConfig();

    boolean isUpdate();

    int updateCode();

    ItemStack update(ItemStack oldItem, NBTWrapper oldWrapper, Player player);
}
