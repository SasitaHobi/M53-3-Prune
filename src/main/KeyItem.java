package main;

import utils.IPrintable;

public class KeyItem extends Item{
    public KeyItem(String name, String descr) {
        super(name, descr);
        
    }

    private String name;
    private String descr;
    
    public void unlockLocation(Game game){
        IPrintable[][] map = game.worldMap.getMap();
int pCol= game.worldMap.getPlayerCol();
int pRow= game.worldMap.getPlayerRow();

boolean check= ((pCol==3)&&(pRow==1))||((pCol==2)&&(pRow==2));
if (check) {
    System.out.println("Ouverture possible");
} else {
    System.out.println("Ouverture impossible");
}

    }

}
