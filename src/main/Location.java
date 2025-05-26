package main;

import utils.IPrintable;

public class Location implements IPrintable {
    private final String name;
    private final String descr;
    private boolean locked;

    public Location(String name, String descr, boolean locked) {
        this.name = name;
        this.descr = descr;
        this.locked = locked;
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