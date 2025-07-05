/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eco.commerce_system_fawry_task;

/**
 *
 * @author Dell
 */
public class Main {
    public static void main(String[] args) {
        Product cheese = new Product("Cheese", 100, 5, 0.2, true, false);
        Product biscuits = new Product("Biscuits", 150, 3, 0.7, true, false);

        Customer abdo = new Customer("Abdulrhman", 1000);

        Cart cart = new Cart();
        cart.add(cheese, 2);
        cart.add(biscuits, 1);

        Chekout.process(abdo, cart);

        //
        // Customer c1 = new Customer("abdo", 1000);
        // Cart cart1 = new Cart();
        // Chekout.process(c1, cart1);

        // Customer c2 = new Customer("abdo", 50);
        // Product tv = new Product("TV", 150, 3, 5.0, true, false);
        // Cart cart2 = new Cart();
        // cart2.add(tv, 1);
        // Chekout.process(c2, cart2);

        // Customer c2 = new Customer("abdo", 1000);
        // Product cheese = new Product("Cheese", 100, 1, 0.2, true, false);
        // Cart cart2 = new Cart();
        // cart2.add(cheese, 2);
        // Chekout.process(c2, cart2);
    }
}
