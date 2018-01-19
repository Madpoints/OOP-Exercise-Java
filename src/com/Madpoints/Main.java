package com.Madpoints;

public class Main {

    public static void main(String[] args) {
        /* Hamburger class
            Toppings:
            Cheese 1, Onion 2, Jalapeno 3, Bacon 4
         */
        System.out.println("-Regular Burger-");
        Hamburger hamburger = new Hamburger("White");
        hamburger.addTopping(1);
        hamburger.addTopping(2);
        hamburger.addTopping(3);
        hamburger.addTopping(4);
        System.out.println("Hamburger total: " + hamburger.burgerOrder());
        System.out.println();

        /* Healthy burger class
            Toppings:
             All regular burger toppings plus: 5 Avocado, 6 Turkey bacon
         */
        System.out.println("-Healthyburger-");
        HealthyBurger healthyBurger = new HealthyBurger();
        healthyBurger.addTopping(5);
        healthyBurger.addTopping(1);
        System.out.println("Healthyburger total: " + healthyBurger.burgerOrder());
        System.out.println();

        /*Deluxe burger class
            Includes chips and drink
                No additional toppings
        */
        System.out.println("-Deluxeburger-");
        DeluxeBurger deluxeBurger = new DeluxeBurger("White");
        System.out.println("Deluxeburger total: " + deluxeBurger.mealOrder());

    }
}
