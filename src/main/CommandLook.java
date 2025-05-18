package main;

public class CommandLook implements ICommand{
    private String verb;
    private String descr;

    public String execute(Location playerLoc) {
        String result = "";
        return result;
    }
    public String getDescr (){
        return this.descr;
    }
    public String getVerb (){
        return this.verb;
    }
}
