package me.kepchyk1101.testspringlifyplugin.service;

import jakarta.annotation.PostConstruct;
import net.kyori.adventure.text.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.springframework.stereotype.Service;

@Service
public class BlockService implements Listener {

    @PostConstruct
    public void init() {
        System.out.println("BlockService init...");
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        event.getPlayer().sendMessage(Component.text(event.getBlock().getType().toString()));
    }

}
