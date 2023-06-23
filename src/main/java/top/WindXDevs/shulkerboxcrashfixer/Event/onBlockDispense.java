package top.WindXDevs.shulkerboxcrashfixer.Event;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDispenseEvent;
import org.bukkit.material.Directional;

public class onBlockDispense implements Listener {
    @EventHandler
    public void onBlockDispense(BlockDispenseEvent e) {
        Block b = e.getBlock();
        if (b.getType() == Material.DISPENSER) {
            BlockFace f = ((Directional) b.getState().getData()).getFacing();

            boolean y0FacingDown = b.getY() == 0 &&
                    f == BlockFace.DOWN;
            boolean yMaxFacingDown = b.getY() == b.getWorld().getMaxHeight() - 1 &&
                    f == BlockFace.UP;

            if (y0FacingDown || yMaxFacingDown) {
                if (e.getItem().getType().name().toLowerCase().endsWith("shulker_box")) {
                    e.setCancelled(true);
                    Bukkit.getServer().getLogger().info("一个位于"+b.getWorld().getName()+"世界的X: "+b.getX()+"Y: "+b.getY()+"Z: "+b.getZ()+"坐标的发射器尝试将带有物品的潜影盒发射到世界外，该发射已被取消，“如歌不取消的话您的服务器将会被崩掉。");
                }
            }
        }
    }
}
