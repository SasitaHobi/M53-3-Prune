package main;

import java.util.List;

public class CommandHelp implements ICommand {
    private final String verb = "help";
    private final String descr = "Liste les commandes disponibles";
    private final List<ICommand> commands;

    public CommandHelp(List<ICommand> commands) {
        this.commands = commands;
    }

    @Override
    public String getVerb() { return verb; }

    @Override
    public String getDescr() { return descr; }

    @Override
    public void execute(String input, Game game) {
        for (ICommand c : commands) {
            System.out.println(c.getVerb() + " - " + c.getDescr());
        }
    }
}
