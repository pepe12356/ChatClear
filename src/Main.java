import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements CommandExecutor {

    @Override
    public void onEnable() {
    }

    @Override
    public void onDisable() {
    }

   @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
       Player player = (Player) sender;
       if (label.equalsIgnoreCase("cc"))
       if (!player.hasPermission("cc.admin")) {
           player.sendMessage("nincs ehhez jogod!");
       }else {
           for (int i= 0; i < 105; ++i) {
               for (Player all : Bukkit.getOnlinePlayers()) {
                if (!all.hasPermission("cc.admin")) {
                    all.sendMessage("");
                }
               }
           }
           Bukkit.broadcastMessage("Sikeren törölve lett a chat" + player.getName() + "által!");
       }
       return false;
   }
}
