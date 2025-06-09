package main;

import utils.IPrintable;

public class Location implements IPrintable {
    private final String name;
    private final String descr;
    private boolean locked;
    private boolean visited = false;
    public Item item;

    public Location(String name, String descr, boolean locked, Item item) {
        this.name = name;
        this.descr = descr;
        this.locked = locked;
        this.item = item;
    }

    public void unlock() {
        this.locked = false;
    }

    public boolean isLocked() {
        return locked;
    }

    public String getDescr() {
        return descr;
    }

    public String getName() {
        return this.name;
    }

    public Item getItem() {
        return this.item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public String getPrintableString() {
        return this.getName();
    }

    public boolean isGrayedOut() {
        return false;
    }
}
