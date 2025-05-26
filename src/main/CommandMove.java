package main;

public class CommandMove implements ICommand {
    private final String verb = "move";
    private final String descr = "Déplace le joueur dans une direction";

    @Override
    public String getVerb() { return verb; }

    @Override
    public String getDescr() { return descr; }

    @Override
    public void execute(String input, Game game) {
        int row = game.worldMap.getPlayerRow();
        int col = game.worldMap.getPlayerCol();

        switch (input.toLowerCase()) {
            case "north": row--; break;
            case "south": row++; break;
            case "east": col++; break;
            case "west": col--; break;
            default:
                System.out.println("Unknown direction.");
                return;
        }

        Location target = game.worldMap.getLocation(row, col);
        if (target == null) {
            System.out.println("impossible to move there");
        } else if (target.isLocked()) {
            System.out.println("zone locked");
        } else {
            game.worldMap.setPlayerLocation(row, col);
            System.out.println(target.getDescr());
        }
    }
}
