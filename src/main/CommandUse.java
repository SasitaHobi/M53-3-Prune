package main;

public class CommandUse implements ICommand {
    private String verb;
    private String descr;

    public void execute(String input, Game game) {
        String pos = "";
        System.out.println(pos);
    }

    public String getDescr() {
        return this.descr;
    }

    public String getVerb() {
        return this.verb;
    }
}
