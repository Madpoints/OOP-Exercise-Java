package com.Madpoints;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("White");
        System.out.println(hamburger.getPrice());
        System.out.println(hamburger.hasCheese());
        System.out.println(hamburger.hasOnion());

        hamburger.addTopping(1);
        hamburger.addTopping(2);
        System.out.println(hamburger.getPrice());
        System.out.println(hamburger.hasCheese());
        System.out.println(hamburger.hasOnion());
    }
}
