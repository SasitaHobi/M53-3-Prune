package main;

public class CommandTeleport implements ICommand {
    private final String verb = "teleport";
    private final String descr = "Permet de se téléporter à un lieu déjà visité (si vous avez le cristal)";

    @Override
    public String getVerb() {
        return verb;
    }

    @Override
    public String getDescr() {
        return descr;
    }

    @Override
    public void execute(String input, Game game) {
        if (game.player.getInventory().findItemByName("teleport crystal") == null) {
            System.out.println("Vous n’avez pas de cristal de téléportation.");
            return;
        }

        if (input.isBlank()) {
            System.out.println("Veuillez indiquer un lieu à téléporter.");
            return;
        }

        Location[][] map = game.worldMap.getRawMap();
        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {
                Location loc = map[row][col];
                if (loc != null && loc.getName().equalsIgnoreCase(input)) {
                    if (loc.isVisited()) {
                        game.worldMap.setPlayerLocation(row, col);
                        System.out.println("Vous avez été téléporté à : " + loc.getName());
                        System.out.println(loc.getDescr());
                        return;
                    } else {
                        System.out.println("Vous n’avez pas encore visité ce lieu.");
                        return;
                    }
                }
            }
        }

        System.out.println("Lieu introuvable.");
    }
}
