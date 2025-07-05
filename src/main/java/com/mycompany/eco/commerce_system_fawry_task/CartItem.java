/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eco.commerce_system_fawry_task;

/**
 *
 * @author Dell
 */
public class CartItem implements Shippable {
     Product product;
     int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    @Override
    public String getName() {
        return product.name;
    }
    
     @Override
     public double getWeight() {
        return product.weight * quantity;
    }
}
