package main;

public class CommandInspect implements ICommand{
    private String verb;
    private String descr;

    public String execute() {
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
