package com.Madpoints;

public class Main {

    public static void main(String[] args) {
        /* Hamburger class
            Toppings:
            Cheese 1, Onion 2, Jalapeno 3, Bacon 4
         */
//        Hamburger hamburger = new Hamburger("White");
//        hamburger.addTopping(1);
//        hamburger.addTopping(2);
//        hamburger.addTopping(3);
//        hamburger.addTopping(4);
//        hamburger.burgerOrder();

        /* Healthy burger class
            Toppings:
             5 Avocado, 6 Turkey bacon
         */
        HealthyBurger healthyBurger = new HealthyBurger();
        System.out.println(healthyBurger.getBreadRollType());
        healthyBurger.addTopping(5);
        healthyBurger.addTopping(1);
        healthyBurger.burgerOrder();

        /*Deluxe burger class
            Includes chips and drink
                No additional toppings
        */
//        DeluxeBurger deluxeBurger = new DeluxeBurger("White");
//        System.out.println(deluxeBurger.getPrice());


    }
}
