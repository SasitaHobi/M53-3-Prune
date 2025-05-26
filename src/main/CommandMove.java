package main;

public class CommandMove implements ICommand{
    private String verb="move";
    private String descr="Allows Player to move from location to location.";

    public void execute(String direction, Location playerLoc, WorldMap wMap) {
        if (direction.equals("south")) {
            if (playerLoc.accSouth) {
                System.out.println("moved player south");
            } else {
                
            }
        } else {
            
        }
    }
    public String getDescr (){
        return this.descr;
    }
    public String getVerb (){
        return this.verb;
    }
}
