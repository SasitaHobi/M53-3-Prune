package main;

import utils.Array2Dprinter;
import utils.IPrintable;

public class CommandMap implements ICommand {
    private final String verb = "map";
    private final String descr = "Affiche la map";

    @Override
    public String getVerb() { 
        return this.verb; 
    }

    @Override
    public String getDescr() { 
        return this.descr; 
    }

   

    @Override
    public void execute(String input, Game game) {
        IPrintable [][] map=game.worldMap.getMap();
       String output= Array2Dprinter.print2DArray(map, 0, 0);
        System.out.println(output);
        
    }

    } 

