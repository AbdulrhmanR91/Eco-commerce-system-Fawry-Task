/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eco.commerce_system_fawry_task;

/**
 *
 * @author Dell
 */
public class Product {
    String name;
    int quantity;
    double price,weight;
    boolean isShippable;
    boolean isExpired;
    
public Product(String name, double price, int quantity, double weight, boolean isShippable, boolean isExpired) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.weight = weight;
        this.isShippable = isShippable;
        this.isExpired = isExpired;
    }    
}
