/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.star.pluginhermandad.comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 *
 * @author alexx
 */
public class NombreComando implements CommandExecutor
{
    String nombre;

    @Override
    public boolean onCommand(CommandSender sender, Command cmnd, String label, String[] args) 
    {
        Player player = (Player) sender; //Declara el jugador.
        if(sender instanceof Player)//Verifica que el "sender/jugador" sea un jugador y no la consola.
        {
            player.sendMessage("Comando funciona.");
            if (args.length > 0)//Si el comando no esta vacio, entonces ejecuta el bloque de codigo
            {
                nombre = player.getName();
                player.setDisplayName("[" + args[0] + "]" + nombre);//Cambia el nombre del jugador solo en el chat.
                player.setPlayerListName("[" + args[0] + "]" + nombre);//Cambia el nombre del jugador en el tab.
            } 
            else//Si el comando esta vacio, muestra el uso correcto del mismo.
            {
                sender.sendMessage("/nombre <nombre>");
            }
        }
        else//Si no es un jugador manda error.
        {
            sender.sendMessage("No eres un jugador");
        }
        return true;
    }
    
}
