package me.myh.testplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class TestPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Plugin Start");
        System.out.println("맹용환의 플러그인이 포함되어있습니다");
        System.out.println("맹용환의 플러그인이 포함되어있습니다");
        System.out.println("맹용환의 플러그인이 포함되어있습니다");
        System.out.println("맹용환의 플러그인이 포함되어있습니다");

        getLogger().info("Plugin Start Success");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Plugin ShutDown");
    }
}
