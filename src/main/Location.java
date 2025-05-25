package main;

public class Location implements IPrintable{
    private String name;
    private String desrc;
    //chemin d'accès pour player
    public boolean accNorth;
    public boolean accEast;
    public boolean accSouth;
    public boolean accWest;
    // method unlock

    public Location (String name, String  descr, boolean accNorth, boolean accEast, boolean accSouth, boolean accWest){
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
}
