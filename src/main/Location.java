package main;

public class Location {
    //adresse de Location
    private int col;
    private int row;
    private String name;
    private String desrc;

    //chemin d'accès pour player
    public boolean accNorth;
    public boolean accEast;
    public boolean accSouth;
    public boolean accWest;
    // method unlock

    public Location (int col, int row, String name, String  descr, boolean accNorth, boolean accEast, boolean accSouth, boolean accWest){
        this.col=col;
        this.row=row;
        this.name=name;
        this.desrc=descr;
        this.accNorth=accNorth;
        this.accEast=accEast;
        this.accSouth=accSouth;
        this.accWest=accWest;
    }
    public Location geLocation(){
        return this.geLocation();
    }
    public int getCol(Location location){
        return this.col;
    }
    public int getRow(Location location){
        return this.row;
    }
}
