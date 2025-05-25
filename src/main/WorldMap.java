package main;

public class WorldMap {
Location wMap [][]= new Location[3][3];  
public void setupMap (){
wMap [0][0]= new Location ("A", "Lake", false, true, true, false);
wMap [1][0]= new Location ("B", "River", false, true, false, true);
wMap [2][0]= new Location ("C", "Pond", false, false, true, true);
wMap [0][1]= new Location ("D", "Field", true, true, true, false);
wMap [1][1]= new Location ("E", "Forest", true, true, true, true);
wMap [2][1]= new Location ("F", "Clearing", true, false, true, true);
wMap [0][2]= new Location ("G", "Mountain", true, true, false, false);
wMap [1][2]= new Location ("H", "Cave", true, true, false, true);
wMap [2][2]= new Location ("I", "Summit", true, false, false, true);
}
   // method add Location int int
    // get Location int int
    // set PlayerLocation
    // getPlayerLocation
public Location [][] getMap(){
    return this.wMap;
}
    
    
}
