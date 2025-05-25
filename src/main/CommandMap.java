package main;

public class CommandMap implements ICommand{
    private String verb="map";
    private String descr="permet d'afficher la carte";

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
