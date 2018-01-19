package com.Madpoints;

public class Basicburger {
    private String breadRollType;
    private boolean meat;

    public Basicburger(String breadRollType) {
        this.breadRollType = breadRollType;
        this.meat = true;
    }

    public String getBreadRollType() {
        return breadRollType;
    }
}
