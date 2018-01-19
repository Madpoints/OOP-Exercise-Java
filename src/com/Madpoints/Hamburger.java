package com.Madpoints;

public class Hamburger extends Basicburger {
    // Basic Burger
    private String breadRollType;
    private double basePrice;
    private double totalPrice;
    // Options
    private boolean cheese = false;
    private boolean onion = false;
    private boolean bacon = false;
    private boolean jalapeno = false;

    public Hamburger(String breadRollType) {
        super(breadRollType);
        this.basePrice = 4.00;
        this.totalPrice = this.basePrice;
    }

    public double addTopping(int itemNumber) {
        double toppingPrice = 0;
        switch (itemNumber) {
            case 1:
                this.cheese = true;
                toppingPrice = .50;
                this.totalPrice += toppingPrice;
                System.out.println("Cheese added");
                break;
            case 2:
                this.onion = true;
                toppingPrice = .25;
                this.totalPrice += toppingPrice;
                System.out.println("Onion added");
                break;
            case 3:
                this.jalapeno = true;
                toppingPrice = .35;
                this.totalPrice += toppingPrice;
                System.out.println("Jalapeno added");
                break;
            case 4:
                this.bacon = true;
                toppingPrice = 1.00;
                this.totalPrice += toppingPrice;
                System.out.println("Bacon added");
                break;
            default:
                break;

        }

        return toppingPrice;
    }

    public void burgerOrder() {
        System.out.println("Your burger order: ");
        System.out.println(" Base price: " + this.basePrice);
        if (this.cheese) {
            System.out.println(" Cheese: .50");
        }
        if (this.onion) {
            System.out.println(" Onion: .25");
        }
        if (this.jalapeno) {
            System.out.println(" Jalapeno: .35");
        }
        if (this.bacon){
            System.out.println(" Bacon: 1.00");
        }

        System.out.println("Total: " + this.totalPrice);
    }

}
