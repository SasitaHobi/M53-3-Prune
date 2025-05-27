package main;

import utils.IPrintable;

public class WorldMap {
    private final Location[][] map;
    private int playerRow;
    private int playerCol;

    public WorldMap(int rows, int cols) {
        map = new Location[rows][cols];
Item potion= new Item("a", "b");
        map[0][0] = new Location("on verra bien", "", false, Item potion= new Item("potion", "bois la potion pour gagner des HP"));
        map[0][1] = new Location("on verra bien", "", false, null);
        map[0][2] = new Location("on verra bien", "", false, null);
        map[1][0] = new Location("on verra bien", "", false, epee= new Item("épée", "vous pouvez découper des trucs"));
        map[1][1] = new Location("on verra bien", "", false,null);
        map[1][2] = new Location("on verra bien", "", false, null);
        map[2][0] = new Location("on verra bien", "", false, null);
        map[2][1] = new Location("on verra bien", "", false, null);
        map[2][2] = new Location("on verra bien", "", false, key= new Item("key", "ceci est une clé"));
        map[3][0] = new Location("on verra bien", "", false, null);
        map[3][1] = new Location("on verra bien", "", false, null);
        map[3][2] = new Location("on verra bien", "", false, null);
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
