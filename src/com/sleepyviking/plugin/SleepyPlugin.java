package com.sleepyviking.plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class SleepyPlugin extends JavaPlugin {

    @Override
    public void onEnable(){
        getLogger().info("Hello, your Sleepy Viking Plugin has loaded successfully! Now with a Side of Git");
        this.getCommand("doomfist").setExecutor(new TestCommand());
        this.getCommand("airbubble").setExecutor(new AirBubbleCommand());
    }

}
