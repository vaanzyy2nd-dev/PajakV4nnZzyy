package id.pajakanarchy;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class PajakAnarchy extends JavaPlugin {
    @Override
    public void onEnable() {
        saveDefaultConfig();
        getLogger().info("PajakAnarchy JAVA25 Enabled - V8.2");
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) return true;
        Player p = (Player) sender;
        if (args.length > 0 && args[0].equalsIgnoreCase("testwebhook")) {
            p.sendMessage("§aWebhook test - cek config.yml lu!");
            return true;
        }
        p.sendMessage("§6§lPAJAK ANARCHY §8| §fMenu pajak terbuka");
        p.sendMessage("§7/pajak bayar §8- §fBayar pajak farm");
        p.sendMessage("§7/pajak cek §8- §fCek tagihan");
        return true;
    }
}
