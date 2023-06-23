package top.WindXDevs.shulkerboxcrashfixer;

import org.bukkit.plugin.java.JavaPlugin;
import top.WindXDevs.shulkerboxcrashfixer.Event.onBlockDispense;

public class ShulkerBoxCrashFixer extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getLogger().info("---------------------------------");
        this.getServer().getLogger().info("这是一个来自WindX Devs的潜影盒修复插件");
        this.getServer().getLogger().info("支持版本: 1.12.2");
        this.getServer().getLogger().info("本插件是免费的如过你是买的你就被骗了");
        this.getServer().getLogger().info("插件加载完成");
        this.getServer().getLogger().info("---------------------------------");
        this.getServer().getPluginManager().registerEvents(new onBlockDispense(),this);
    }

    @Override
    public void onDisable() {
        this.getServer().getLogger().info("---------------------------------");
        this.getServer().getLogger().info("这是一个来自WindX Devs的潜影盒修复插件");
        this.getServer().getLogger().info("支持版本: 1.12.2");
        this.getServer().getLogger().info("本插件是免费的如过你是买的你就被骗了");
        this.getServer().getLogger().info("插件卸载完成");
        this.getServer().getLogger().info("---------------------------------");
    }
}
