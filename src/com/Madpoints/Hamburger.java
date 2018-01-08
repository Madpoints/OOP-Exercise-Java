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

    public double addTopping(int itemNumber) {
        double toppingPrice = 0;

        switch (itemNumber) {
            case 1:
                this.cheese = true;
                toppingPrice = .50;
                this.price += toppingPrice;
                System.out.println("Cheese added");
                break;
            case 2:
                this.onion = true;
                toppingPrice = .25;
                this.price += toppingPrice;
                System.out.println("Onion added");
                break;
            case 3:
                this.jalapeno = true;
                toppingPrice = .35;
                this.price += toppingPrice;
                System.out.println("Jalapeno added");
                break;
            case 4:
                this.bacon = true;
                toppingPrice = 1.00;
                this.price += toppingPrice;
                System.out.println("Bacon added");
                break;
            default:
                break;

        }

        return toppingPrice;
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
