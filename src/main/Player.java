package main;

public class Player {
    private String name;
    private Location playerLoc;
    public String getName(){
        return this.name;
    }
    public Location getPlayerLoc (){
        return this.playerLoc;
    }
    public void setPlayerLoc (Location newLocation){
        this.playerLoc=newLocation;
    }
}
