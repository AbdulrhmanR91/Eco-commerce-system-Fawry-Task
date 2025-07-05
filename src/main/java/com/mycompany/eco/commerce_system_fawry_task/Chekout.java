/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eco.commerce_system_fawry_task;
import java.util.ArrayList;
/**
 *
 * @author Dell
 */
public class Chekout {
     public static void process(Customer customer, Cart cart) {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        double subtotal = 0;
        double shippingFee = 0;
        ArrayList<Shippable> shippableItems = new ArrayList<>();

        for (CartItem item : cart.getItems()) {
            Product p = item.product;
            int qty = item.quantity;

            if (p.isExpired) {
                System.out.println("Product " + p.name + " is expired.");
                return;
            }

            if (p.quantity < qty) {
                System.out.println("Not enough stock for " + p.name);
                return;
            }

            subtotal += p.price * qty;
            p.quantity -= qty;

            if (p.isShippable) {
                shippableItems.add(item);
            }
        }

        if (!shippableItems.isEmpty()) {
            shippingFee = 30;
        }

        double total = subtotal + shippingFee;

        if (!customer.canBuy(total)) {
            System.out.println("Insufficient balance.");
            return;
        }

        customer.pay(total);

        if (!shippableItems.isEmpty()) {
            Shippng.ship(shippableItems);
        }

        System.out.println("\n** Checkout receipt **");
        for (CartItem item : cart.getItems()) {
        System.out.println(item.quantity + "x " + item.product.name + " " + (int)(item.quantity * item.product.price));
        }

        System.out.println("----------------------");
        System.out.println("Subtotal " + (int)subtotal);
        System.out.println("Shipping " + (int)shippingFee);
        System.out.println("Amount " + (int)total);
//        System.out.println("Remaining balance: " + customer.getBalance());
    }
}
