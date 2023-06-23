package top.WindXDevs.Dirtylanguageblocking;

import org.bukkit.plugin.java.JavaPlugin;
import top.WindXDevs.Dirtylanguageblocking.Commands.Commands;
import top.WindXDevs.Dirtylanguageblocking.Event.Chat;

public class Dirtylanguageblocking extends JavaPlugin {

    private static Dirtylanguageblocking obj;

    public static Dirtylanguageblocking getInstance() {
        return obj;
    }

    @Override
    public void onEnable() {
        obj = this;
        this.getServer().getLogger().info("---------------------------------");
        this.getServer().getLogger().info("这是一个来自WindX Devs的脏话屏蔽插件");
        this.getServer().getLogger().info("支持版本: 全版本");
        this.getServer().getLogger().info("本插件是免费的如过你是买的你就被骗了");
        this.getServer().getLogger().info("插件加载完成");
        this.getServer().getLogger().info("---------------------------------");
        getCommand("zhpb").setExecutor(new Commands());
        saveDefaultConfig();
        this.getServer().getPluginManager().registerEvents(new Chat(),this);
    }

    @Override
    public void onDisable() {
        this.getServer().getLogger().info("---------------------------------");
        this.getServer().getLogger().info("这是一个来自WindX Devs的脏话屏蔽插件");
        this.getServer().getLogger().info("支持版本: 全版本");
        this.getServer().getLogger().info("本插件是免费的如过你是买的你就被骗了");
        this.getServer().getLogger().info("插件卸载完成");
        this.getServer().getLogger().info("---------------------------------");
    }
}
