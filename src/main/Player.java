package main;

public class Player {
    private String name;

    private int playerCol;
    private int playerRow;

    public String getName() {
        return this.name;
    }

   

    public void setPlayerLoc(int col, int row) {
        this.playerCol = col;
        this.playerRow = row;
    }

    public int getPlayerCol() {
        return this.playerCol;
    }

    public int getPlayerRow() {
        return this.playerRow;
    }

    public Player(String name, int playerCol, int playerRow) {
        this.name = name;
        this.playerCol = playerCol;
        this.playerRow = playerRow;
    }
}
