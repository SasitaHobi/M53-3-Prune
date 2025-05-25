package main;

public class Game {
    private Player player1;
    private WorldMap worldMap;

    public Game() {
        System.out.println("Initializing game...");
    }

    public void start() {
        System.out.println("Running game...");
        setupMap ();
        setPlayerLoc()
    }

}