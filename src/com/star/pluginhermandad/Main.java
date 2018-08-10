
package com.star.pluginhermandad;

import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Kine
 */
public class Main extends JavaPlugin{
    
    //Esta madre es oara cuando se prende     
    public void onEnable(){
    getLogger().info("Disabled!");
    }

    public void onDisable(){
    getLogger().info("Enabled!");
}
}
