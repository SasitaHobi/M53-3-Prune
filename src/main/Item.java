package main;

public abstract class Item {
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
}
