package top.WindXDevs.Dirtylanguageblocking.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import top.WindXDevs.Dirtylanguageblocking.Dirtylanguageblocking;

public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (s.equalsIgnoreCase("zhpb")){
            if (commandSender.isOp()){
                switch (strings[0]){
                    case "reload":
                        if (commandSender.isOp()){
                            Dirtylanguageblocking.getInstance().reloadConfig();
                            commandSender.sendMessage("配置文件重载成功");
                        }
                        break;
                }
            } else {
                commandSender.sendMessage("你没有权限使用这个指令");
            }
        }
        return false;
    }
}
