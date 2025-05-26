package main;

public class CommandTake implements ICommand {
    private String verb;
    private String descr;

    public void execute(String input, Game game) {
        String result = "";
        System.out.println(result);
    }

    public String getDescr() {
        return this.descr;
    }

    public String getVerb() {
        return this.verb;
    }
}
