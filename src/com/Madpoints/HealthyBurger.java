package com.Madpoints;

public class HealthyBurger extends Hamburger {
    private double price;
    // Toppings
    private boolean avocado = false;
    private boolean turkeyBacon = false;


    public HealthyBurger() {
        super("Brown Rye");
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

    public boolean hasAvocado() {
        return avocado;
    }

    public boolean hasTurkeyBacon() {
        return turkeyBacon;
    }
}
