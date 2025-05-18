package main;

public class CommandMove implements ICommand{
    private String verb;
    private String descr;

    public void execute(String direction, Location playerLoc) {
        
    }
    public String getDescr (){
        return this.descr;
    }
    public String getVerb (){
        return this.verb;
    }
}
