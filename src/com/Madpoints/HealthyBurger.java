package com.Madpoints;

public class HealthyBurger extends Hamburger {
    private double basePrice;
    private double totalPrice;
    // Toppings
    private boolean avocado = false;
    private boolean turkeyBacon = false;


    public HealthyBurger() {
        super("Brown Rye");
        this.basePrice = 4.25;
        this.totalPrice = basePrice;
    }


    @Override
    public double addTopping(int itemNumber) {
        double toppingPrice = super.addTopping(itemNumber);
        totalPrice += toppingPrice;

        switch (itemNumber) {
            case 5:
                this.avocado = true;
                totalPrice += .50;
                System.out.println("Avocado added");
                break;
            case 6:
                this.turkeyBacon = true;
                totalPrice += 1.00;
                System.out.println("Turkey bacon added");
                break;
            default:
                break;
        }

        return toppingPrice;
    }

    @Override
    public double burgerOrder() {
        super.burgerOrder();
        if (this.avocado) {
            System.out.println(" Avocado: .50");
        }
        if (this.turkeyBacon) {
            System.out.println(" Turkey bacon: 1.00");
        }

        return this.totalPrice;
    }
}
