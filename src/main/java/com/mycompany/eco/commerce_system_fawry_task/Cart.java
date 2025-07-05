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
public class Cart {
    ArrayList<CartItem> items = new ArrayList<>();

    public void add(Product product, int quantity) {
        if (product.quantity < quantity) {
            System.out.println("Not enough quantity for: " + product.name);
            return;
        }
        items.add(new CartItem(product, quantity));
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public ArrayList<CartItem> getItems() {
        return items;
    }
}
