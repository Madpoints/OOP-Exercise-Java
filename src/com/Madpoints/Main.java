package com.Madpoints;

public class Main {

    public static void main(String[] args) {
        /* Hamburger class
            Toppings:
            Cheese 1, Onion 2, Jalapeno 3, Bacon 4
         */
//        Hamburger hamburger = new Hamburger("White");
//        System.out.println(hamburger.getPrice());
//        System.out.println(hamburger.hasCheese());
//        System.out.println(hamburger.hasOnion());
//
//        hamburger.addTopping(1);
//        hamburger.addTopping(2);
//        System.out.println(hamburger.getPrice());
//        System.out.println(hamburger.hasCheese());
//        System.out.println(hamburger.hasOnion());

        HealthyBurger healthyBurger = new HealthyBurger();
        System.out.println(healthyBurger.getPrice());
        System.out.println(healthyBurger.getBreadRollType());

        healthyBurger.addTopping(5);
        System.out.println(healthyBurger.hasCheese());
        System.out.println(healthyBurger.getPrice());
    }
}
