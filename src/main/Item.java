package main;

public class Item {
    private String name;
    private String descr;

    public String getName() {
        return this.name;
    }

    public String getDescr() {
        return this.descr;
    }
    public Item(String name, String descr){
        this.name=name;
        this.descr=descr;
    }
    public void unlockLocation(Game game) {
       
        int pCol = game.worldMap.getPlayerCol();
        int pRow = game.worldMap.getPlayerRow();

        boolean check = ((pCol == 1) && (pRow == 3)) || ((pCol == 2) && (pRow == 2));
        if (check) {
            
            Location endLoc=game.worldMap.getLocation(3, 2);
            endLoc.unlock();
            System.out.println("Les portes du château sont ouvertes!");
        } else {
            System.out.println("Il n'y a rien à ouvrir aux alentours.");
        }

    }
}

    