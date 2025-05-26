package main;

import utils.Array2DPrinter;

public class CommandMap implements ICommand {
    private final String verb = "map";
    private final String descr = "Affiche la carte du monde";

    @Override
    public String getVerb() { return verb; }

    @Override
    public String getDescr() { return descr; }

    @Override
    public void execute(String input, Game game) {
        Array2Dprinter.print2DArray(game.worldMap.getMap());
    }
}
