package main;

public class CommandList implements ICommand {
    private String verb;
    private String descr;

    @Override
    public void execute(String input, Game game) {
        String cList = "";
        System.out.println(cList);
    }

    @Override
    public String getDescr() {
        return this.descr;
    }

    public String getVerb() {
        return this.verb;
    }
}
