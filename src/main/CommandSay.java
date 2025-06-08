package main;

public class CommandSay implements ICommand {
    private String verb;
    private String descr;
    private static int stack = 0;

    public void execute(String input, Game game) {
        if (input.isBlank()) {
            System.out.println("Je n'ai pas bien entendu");

        }
        if (stack == 0) {
            Item item = game.player.getInventory().findItemByName("Mon premier");
            if (item == null) {
                System.out.println("Vous ne possédez pas encore d'énigme.");

            } else {
                if (input.toLowerCase().equals("trop")) {
                    System.out.println(
                            "Bien joué, c'est la bonne réponse! Encore 2 morceaux. Le prochain viens d'apparaître.");
                    stack++;
                    Item riddle2 = new LetterItem("Mon second", "...mon second est une négation...", false);
                    game.worldMap.getLocation(2, 1).setItem(riddle2);
                } else {
                    System.out.println("Ce n'est pas la bonne réponse...");
                }
            }
        } else {
            if (stack == 1) {
                Item item = game.player.getInventory().findItemByName("Mon second");
                if (item == null) {
                    System.out.println("Vous ne possédez pas encore la seonde énigme, cherchez bien.");

                } else {
                    if (input.toLowerCase().equals("ne")) {
                        System.out.println(
                                "Bien joué, c'est la bonne réponse! Encore 1 morceaux. Le prochain viens d'apparaître.");
                        stack++;
                        Item riddle3 = new LetterItem("Mon tout", "...mon tout est un type de siège", false);
                        game.worldMap.getLocation(2, 0).setItem(riddle3);
                    } else {
                        System.out.println("Ce n'est pas la bonne réponse...");
                    }
                }
            }

        }

    }

    public String getDescr() {
        return this.descr;
    }

    public String getVerb() {
        return this.verb;
    }
}
