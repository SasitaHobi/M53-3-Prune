package main;

import utils.IPrintable;

public class WorldMap {
    private final Location[][] map;
    private int playerRow;
    private int playerCol;

    public WorldMap(int rows, int cols) {
        map = new Location[rows][cols];
Item potion= new Item("potion", "bois la potion pour gagner des HP");
Item epee= new Item("épée", "vous pouvez découper des trucs");

Item treasure= new Item("Trésor", "Félicitations! Vous avez trouvé le trésor! Vous pouvez quitter le jeu grâce à la commande quit.");
Item riddle1= new LetterItem("Mon premier", "Mon premier  est un surplus...");


        map[0][0] = new Location("Prairie", "Ceci est une prairie.", false, potion);
        map[0][1] = new Location("Chemin", "Ceci est un chemin.", false, null);
        map[0][2] = new Location("Cascade", "Ceci est une cascade.", false, null);
        map[1][0] = new Location("Rivière", "Ceci est une rivière.", false, epee);
        map[1][1] = new Location("Lac", "Ceci est un lac.", false, null);
        map[1][2] = new Location("Forêt", "Ceci est une forêt.", false, null);
        map[2][0] = new Location("Clairière", "Ceci est une clairère.", false, null);
        map[2][1] = new Location("Marais", "Ceci est un marais.", false, null);
        map[2][2] = new Location("Montagne", "Ceci est une montagne.", false, null);
        map[3][0] = new Location("Grotte", "Ceci est une grotte.", false, null);
        map[3][1] = new Location("Sommet", "Ceci est un sommet.", false, riddle1);
        map[3][2] = new Location("Château", "Ceci est un château.", true, treasure);
    }

    public Location getLocation(int row, int col) {
        if (row < 0 || row >= map.length || col < 0 || col >= map[0].length)
            return null;
        return map[row][col];
    }

    public void addLocation(Location location, int row, int col) {
        map[row][col] = location;
    }

    public Location getPlayerLocation() {
        return getLocation(playerRow, playerCol);
    }

    public void setPlayerLocation(int row, int col) {
        this.playerRow = row;
        this.playerCol = col;
    }

    public int getPlayerRow() {
        return playerRow;
    }

    public int getPlayerCol() {
        return playerCol;
    }

    public IPrintable[][] getMap() {
        return map;
    }
}
