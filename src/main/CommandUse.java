package main;

public class CommandUse implements ICommand {
    private final String verb = "use";
    private final String descr = "Utilise un objet de l'inventaire";

    @Override
    public void execute(String input, Game game) {
        if (input.isBlank()) {
            System.out.println("Précisez l'objet à utiliser.");
            return;
        }

        Item item = game.player.getInventory().findItemByName(input);
        if (item == null) {
            System.out.println("Vous ne possédez pas cet objet.");
            return;
        }


        if (item.getName().equals("Clef")) {
            item.unlockLocation(game);
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
