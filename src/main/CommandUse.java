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

        Location loc = game.worldMap.getPlayerLocation();

        if (item.getName().equalsIgnoreCase("key") && loc.isLocked()) {
            loc.unlock();
            game.player.getInventory().removeItem(item);
            System.out.println("Vous avez déverrouillé la zone avec la clé !");
        } else {
            System.out.println("Cet objet ne peut pas être utilisé ici.");
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
