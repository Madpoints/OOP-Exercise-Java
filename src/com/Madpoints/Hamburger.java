package com.Madpoints;

public class Hamburger {
    // Basic Burger
    private String breadRollType;
    private boolean meat;
    private double price;
    // Options
    private boolean cheese = false;
    private boolean onion = false;
    private boolean bacon = false;
    private boolean jalapeno = false;

    public Hamburger(String bread) {
        this.breadRollType = bread;
        this.meat = true;
        this.price = 4.00;
    }

    public void addTopping(int itemNumber) {
        switch (itemNumber) {
            case 1:
                this.cheese = true;
                this.price += .50;
                System.out.println("Cheese added");
                break;
            case 2:
                this.onion = true;
                this.price += .25;
                System.out.println("Onion added");
                break;
            case 3:
                this.jalapeno = true;
                this.price += .35;
                System.out.println("Jalapeno added");
                break;
            case 4:
                this.bacon = true;
                this.price += 1.00;
                System.out.println("Bacon added");
                break;
            default:
                System.out.println("Not found");
                break;

        }
    }

    public double getPrice() {
        return this.price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public boolean hasCheese() {
        return cheese;
    }

    public boolean hasOnion() {
        return onion;
    }

    public boolean hasBacon() {
        return bacon;
    }

    public boolean hasJalapeno() {
        return jalapeno;
    }
}
