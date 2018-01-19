package com.Madpoints;

public class DeluxeBurger extends Basicburger {
    private double price;
    // Sides
    private boolean chips;
    private boolean drink;

    public DeluxeBurger(String breadRollType) {
        super(breadRollType);
        this.chips = true;
        this.drink = true;
        this.price = 6.00;
    }

    public double getPrice() {
        return price;
    }
}
