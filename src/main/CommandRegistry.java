package main;

import java.util.*;

public class CommandRegistry {
    private final Map<String, ICommand> commandMap = new HashMap<>();

    public void register(ICommand command) {
        commandMap.put(command.getVerb(), command);
    }

    public void execute(String input, Game game) {
        String[] parts = input.trim().split(" ", 2);
        String verb = parts[0];
        String args = (parts.length > 1) ? parts[1] : "";

        ICommand cmd = commandMap.get(verb);
        if (cmd != null) {
            cmd.execute(args, game);
        } else {
            System.out.println("Commande inconnue.");
        }
    }

    public ICommand getCommand(String verb) {
        return commandMap.get(verb);
    }
}
