package main;

import utils.IPrintable;

public class Location implements IPrintable {
    private final String name;
    private final String descr;
    private boolean locked;
    private Item item;

    public Location(String name, String descr, boolean locked, Item item) {
        this.name = name;
        this.descr = descr;
        this.locked = locked;
        this.item= item;
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

    @Override
    public String getPrintableString() {
        return this.getName();
    }

    public boolean isGrayedOut() {
        return false;
    }
}