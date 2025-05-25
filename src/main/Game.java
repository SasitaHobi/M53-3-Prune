package main;

import examples.StringManipulation;

public class Game {
    private Player player1;
    private WorldMap worldMap;
    private ItemManager itemManager;

    public Game() {
        System.out.println("Initializing game...");
    }

    public void start() {
        WorldMap wMap1 = new WorldMap();
        Player player1 = new Player("Toto", 0, 0);
        System.out.println("Running game...");

        wMap1.setupMap();
        
        String userInput = "move South";
        userInput = userInput.trim();
        userInput = userInput.toLowerCase();
        String[] partsInput = userInput.split(" ");

        if (partsInput[0].equals("move")) {
            CommandMove cMove = new CommandMove();
            cMove.execute(partsInput[1], wMap1.getLocation(player1.getPlayerCol(), player1.getPlayerRow()), worldMap);
            
            System.out.println("moved player to the " + partsInput[1]);
        }
    }

}