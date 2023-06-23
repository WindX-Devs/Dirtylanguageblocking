package top.WindXDevs.Dirtylanguageblocking.Event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import top.WindXDevs.Dirtylanguageblocking.Dirtylanguageblocking;

public class Chat implements Listener {

    @EventHandler
    public void onChat(PlayerChatEvent e) {
        for (String pbzh : Dirtylanguageblocking.getInstance().getConfig().getStringList("Chat")) {
            if (e.getMessage().contains(pbzh)) {
                String replaceMessage = Dirtylanguageblocking.getInstance().getConfig().getString("replace");
                e.setMessage(replaceMessage);
                break;
            }
        }
    }
}
