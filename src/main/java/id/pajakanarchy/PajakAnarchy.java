package id.pajakanarchy;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class PajakAnarchy extends JavaPlugin implements Listener {

    private Map<String, Double> farmTiers = new HashMap<>();

    @Override
    public void onEnable() {
        saveDefaultConfig();
        Bukkit.getPluginManager().registerEvents(this, this);
        loadTiers();
        getLogger().info("ᴘᴀᴊᴀᴋ ᴀɴᴀʀᴄʜʏ V8.2 JAVA25 Enabled");
    }

    private void loadTiers() {
        farmTiers.clear();
        if (getConfig().getConfigurationSection("tax.farm-tiers") != null) {
            for (String key : getConfig().getConfigurationSection("tax.farm-tiers").getKeys(false)) {
                farmTiers.put(key, getConfig().getDouble("tax.farm-tiers." + key));
            }
        }
    }

    @EventHandler
    public void onCommand(PlayerCommandPreprocessEvent e) {
        String cmd = e.getMessage().toLowerCase();
        Player p = e.getPlayer();
        if (cmd.startsWith("/sethome") || cmd.startsWith("/createhome")) {
            int homes = 0; // hook data homes lu disini, sementara dummy
            // Logic
