package main;



public class KeyItem extends Item {
    private String name;
    private String descr;

    public String getName() {
        return this.name;
    }

    public String getDescr() {
        return this.descr;
    }

    public KeyItem(String name, String descr) {
        super(name, descr);

    }

    public void unlockLocation(Game game) {
       
        int pCol = game.worldMap.getPlayerCol();
        int pRow = game.worldMap.getPlayerRow();

        boolean check = ((pCol == 3) && (pRow == 1)) || ((pCol == 2) && (pRow == 2));
        if (check) {
            
            Location endLoc=game.worldMap.getLocation(3, 2);
            endLoc.unlock();
            System.out.println("Les portes du château sont ouvertes!");
        } else {
            System.out.println("Il n'y a rien à ouvrir aux alentours.");
        }

    }

}
