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
public class Shippng {
      public static void ship(ArrayList<Shippable> items) {
        double totalWeight = 0;
        System.out.println("** Shipment notice **");

        for (Shippable item : items) {
            if (item instanceof CartItem) {
                CartItem cartItem = (CartItem) item;
                int quantity = cartItem.quantity;
                int itemWeight = (int)(item.getWeight() * 1000); 
                System.out.println(quantity + "x " + item.getName() + " " + itemWeight + "g");
                totalWeight += item.getWeight();
            }
        }
        System.out.println("Total package weight: " + totalWeight + "kg");
    }
}
