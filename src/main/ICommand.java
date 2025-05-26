package main;

public interface ICommand {
    String getVerb();

    String getDescr();

    void execute(String input, Game game);
}
