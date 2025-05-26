package main;

public class CommandLook implements ICommand {
    private final String verb = "look";
    private final String descr = "Affiche la description de la zone actuelle";

    @Override
    public String getVerb() { return verb; }

    @Override
    public String getDescr() { return descr; }

    @Override
    public void execute(String input, Game game) {
        Location loc = game.worldMap.getPlayerLocation();
        System.out.println(loc.getDescr());
    }
}
