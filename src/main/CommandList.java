package main;

public class CommandList implements ICommand{
    private String verb;
    private String descr;

    public String execute() {
        String cList = "";
        return cList;
    }
    public String getDescr (){
        return this.descr;
    }
    public String getVerb (){
        return this.verb;
    }
}
