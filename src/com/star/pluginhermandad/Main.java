
package com.star.pluginhermandad;

import com.star.pluginhermandad.comandos.NombreComando;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Kine
 */
public class Main extends JavaPlugin
{
    
    //Esta madre es oara cuando se prende     
    public void onEnable()
    {
        getLogger().info("Disabled!");
        this.getCommand("nombre").setExecutor((CommandExecutor)new NombreComando());
    }

    public void onDisable()
    {
        getLogger().info("Enabled!");
    }
}
