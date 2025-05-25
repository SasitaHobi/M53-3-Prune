package main;

public class CommandMove implements ICommand{
    private String verb;
    private String descr;

    public void execute(String direction, Location playerLoc, WorldMap wMap) {
        if (direction.equals("North")) {
            if (playerLoc.accNorth) {
                
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
