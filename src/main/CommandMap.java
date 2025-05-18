package main;

public class CommandMap implements ICommand{
    private String verb;
    private String descr;

    public String execute() {
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
