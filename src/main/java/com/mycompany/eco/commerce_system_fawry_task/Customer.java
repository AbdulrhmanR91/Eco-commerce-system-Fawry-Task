/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eco.commerce_system_fawry_task;

/**
 *
 * @author Dell
 */
public class Customer {
      String name;
     double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public boolean canBuy(double amount) {
        if (balance >= amount){
            return true;
}
        else{
            return false;
        }
    }

    public void pay(double amount) {
        if (canBuy(amount)) {
            balance = balance - amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

