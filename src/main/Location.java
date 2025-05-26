package main;

import utils.IPrintable;

public class Location implements IPrintable{
    //adresse de Location
    private int col;
    private int row;
    private String name;
    private String desrc;
    private boolean isLocked;

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
    public String getName(){
        return this.name;
    }
    public boolean getIsLocked(){
        return this.isLocked;
    }
    @Override
    public String getPrintableString() {
        return this.getName();
    }
    @Override
    public boolean isGrayedOut() {
       return this.getIsLocked();
    }
}
