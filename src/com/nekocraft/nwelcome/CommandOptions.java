package com.nekocraft.nwelcome;

import org.bukkit.command.*;
import org.bukkit.entity.*;

public class CommandOptions implements CommandExecutor
{
    public boolean onCommand(final CommandSender commandSender, final Command command, final String s, final String[] array) {
        if (!(commandSender instanceof Player)) {
            commandSender.sendMessage(Messages.No_Console());
            return true;
        }
        final Player p = (Player)commandSender;
        //if (Command.)
        return true;
    }
}
