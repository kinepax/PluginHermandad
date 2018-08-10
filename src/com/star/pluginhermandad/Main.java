
package com.star.pluginhermandad;

import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Kine
 */
public class Main extends JavaPlugin{
    
          
    public void onEnable(){
    getLogger().info("Disabled!");
    }

    public void onDisable(){
    getLogger().info("Enabled!");
}
}
