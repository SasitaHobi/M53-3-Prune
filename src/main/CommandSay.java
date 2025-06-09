package main;

public class CommandSay implements ICommand {
    private final String verb="say";
    private final String descr="Permet de donner la réponse à une énigme. ";
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
                    Item riddle2 = new LetterItem("Mon second", "...mon second est une négation...");
                    game.worldMap.getLocation(2, 1).setItem(riddle2);
                } else {
                    System.out.println("Ce n'est pas la bonne réponse...");
                }
            }
        } else if (stack == 1) {

            Item item = game.player.getInventory().findItemByName("Mon second");
            if (item == null) {
                System.out.println("Vous ne possédez pas encore la seonde énigme, cherchez bien.");

            } else {
                if (input.toLowerCase().equals("ne")) {
                    System.out.println(
                            "Bien joué, c'est la bonne réponse! Encore 1 morceau. Le prochain viens d'apparaître.");
                    stack++;
                    Item riddle3 = new LetterItem("Mon tout", "...mon tout est un type de siège (Sans accent)");
                    game.worldMap.getLocation(2, 0).setItem(riddle3);
                } else {
                    System.out.println("Ce n'est pas la bonne réponse...");
                }
            }
        } else if (stack == 2) {
            Item item = game.player.getInventory().findItemByName("Mon tout");
            if (item == null) {
                System.out.println("Vous ne possédez pas encore la dernière énigme, cherchez bien.");

            } else {
                if (input.toLowerCase().equals("trone")) {
                    System.out.println(
                            "Bien joué, c'est la bonne réponse! Une clé apparaît mystérieusement dans votre inventaire.");
                    stack++;
                    Item key= new Item("Clé", "Ceci est une clé. Une étiquette y est suspendue, avec le mot: château.");
                    game.player.getInventory().addItem(key);
                } else {
                    System.out.println("Ce n'est pas la bonne réponse...");
                }
            }
        } else if (stack>=3){
            System.out.println("Vous avez déjà résolu toutes les énigmes.");
        }

    }

    public String getDescr() {
        return this.descr;
    }

    public String getVerb() {
        return this.verb;
    }
}
