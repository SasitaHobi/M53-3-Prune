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

    @Override
    public String getPrintSymbol() {
        return name.substring(0, 1).toUpperCase();
    }

    public boolean isGrayedOut() {
        return false;
    }

    public String getPrintableString() {
        return getPrintSymbol();
    }
}
