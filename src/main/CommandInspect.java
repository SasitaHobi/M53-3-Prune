package main;

public class CommandInspect implements ICommand {
    private String verb;
    private String descr;

    @Override
    public void execute(String input, Game game) {
        String result = "";
        System.out.println(result);
    }

    @Override
    public String getDescr() {
        return this.descr;
    }

    @Override
    public String getVerb() {
        return this.verb;
    }
}
