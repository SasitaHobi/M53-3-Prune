package main;

public class CommandTake implements ICommand {
    private final String verb = "take";
    private final String descr = "Permet de ramasser un objet dans la zone actuelle";

    @Override
    public void execute(String input, Game game) {
        Location loc = game.worldMap.getPlayerLocation();
        Item item = loc.item;

        if (item != null) {
            game.player.getInventory().addItem(item);
            System.out.println("Vous avez ramassé : " + item.getName());
            loc.item = null;
        } else {
            System.out.println("Il n’y a rien à ramasser ici.");
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

