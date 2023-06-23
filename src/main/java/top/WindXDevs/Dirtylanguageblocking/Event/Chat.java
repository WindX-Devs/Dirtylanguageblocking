package top.WindXDevs.Dirtylanguageblocking.Event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import top.WindXDevs.Dirtylanguageblocking.Dirtylanguageblocking;

public class Chat implements Listener {

    @EventHandler
    public void onChat(PlayerChatEvent e) {
        if (Dirtylanguageblocking.getInstance().getConfig().getStringList("Chat").contains(e.getMessage())){
            e.setMessage(Dirtylanguageblocking.getInstance().getConfig().getString("replace"));
        }
    }
}
