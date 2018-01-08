package com.Madpoints;

public class HealthyBurger extends Hamburger {
    // Toppings
    private boolean avocado;
    private boolean turkeyBacon;
    private double price;


    public HealthyBurger() {
        super("Brown Rye");
        this.avocado = false;
        this.turkeyBacon = false;
        this.price = 4.25;
    }

    @Override
    public double addTopping(int itemNumber) {
        double toppingPrice = 0;
        toppingPrice += super.addTopping(itemNumber);
        price += toppingPrice;

        switch (itemNumber) {
            case 5:
                this.avocado = true;
                price += .50;
                System.out.println("Avocado added");
                break;
            case 6:
                this.turkeyBacon = true;
                price += 1.00;
                System.out.println("Turkey bacon added");
                break;
            default:
                break;
        }

        return toppingPrice;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvocado() {
        return avocado;
    }

    public boolean isTurkeyBacon() {
        return turkeyBacon;
    }
}