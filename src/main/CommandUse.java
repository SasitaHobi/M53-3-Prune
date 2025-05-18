package main;

public class CommandUse implements ICommand{
    private String verb;
    private String descr;

    public String execute(Item it, Location PlayerLoc) {
        String pos = "";
        return pos;
    }
    public String getDescr (){
        return this.descr;
    }
    public String getVerb (){
        return this.verb;
    }
}
