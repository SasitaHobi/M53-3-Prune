package main;

public class CommandInspect implements ICommand {
    private final String verb = "inspect";
    private final String descr = "Affiche le contenu de l'inventaire";

    @Override
    public void execute(String input, Game game) {
        System.out.println("Inventaire :");
        if (game.player.getInventory().getItems().isEmpty()) {
            System.out.println("(Inventaire vide)");
        } else {
            for (Item item : game.player.getInventory().getItems()) {
                System.out.println("- " + item.getName() + " : " + item.getDescr());
            }
        }
    }

    @Override
    public String getDescr() {
        return descr;
    }

    @Override
    public String getVerb() {
        return verb;
    }
}

