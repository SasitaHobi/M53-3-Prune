package main;

public class WorldMap {
 private Location wMap [][]= new Location[3][3];  
public Location [][] setupMap (){
Location wMap [][]= new Location[3][3];
wMap [0][0]= new Location (0, 0,"A", "Lake", false, true, true, false);
wMap [1][0]= new Location (1, 0,"B", "River", false, true, false, true);
wMap [2][0]= new Location (2, 0,"C", "Pond", false, false, true, true);
wMap [0][1]= new Location (0, 1,"D", "Field", true, true, true, false);
wMap [1][1]= new Location (1, 1,"E", "Forest", true, true, true, true);
wMap [2][1]= new Location (2, 1,"F", "Clearing", true, false, true, true);
wMap [0][2]= new Location (0, 2,"G", "Mountain", true, true, false, false);
wMap [1][2]= new Location (1, 2,"H", "Cave", true, true, false, true);
wMap [2][2]= new Location (2, 2, "I", "Summit", true, false, false, true);
return wMap;
}
   // method add Location int int
    // get Location int int
    // set PlayerLocation
    // getPlayerLocation
public Location [][] getMap(){
    return this.wMap;
}
    
    public Location getLocation(int col, int row){
        return this.wMap[col][row];
    }
}
