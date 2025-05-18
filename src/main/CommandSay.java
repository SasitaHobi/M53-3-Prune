package main;

public class CommandSay implements ICommand{
    private String verb;
    private String descr;

    public String execute(String answer, Location playerLoc) {
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
