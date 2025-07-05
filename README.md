# 🛒 Eco-Commerce System - Fawry Internship Challenge

## 📋 Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Architecture](#architecture)
- [System Requirements](#system-requirements)
- [Installation & Setup](#installation--setup)
- [Usage Examples](#usage-examples)
- [Code Structure](#code-structure)
- [Test Cases](#test-cases)
- [Screenshots](#screenshots)
- [Contributing](#contributing)

## 🌟 Overview

This is an e-commerce system developed as part of the Fawry Full Stack Development Internship Challenge. The system demonstrates core e-commerce functionality including product management, shopping cart operations, checkout process, and shipping services.

The system is designed to handle various product types with different characteristics such as expiration dates and shipping requirements, providing a robust foundation for an e-commerce platform.

## ✨ Features

### 🛍️ Product Management
- **Product Definition**: Products have name, price, quantity, and weight
- **Expiration Handling**: Some products may expire (e.g., Cheese, Biscuits) while others don't (e.g., TV, Mobile)
- **Shipping Requirements**: Products can be shippable (Cheese, TV) or non-shippable (Mobile scratch cards)
- **Weight Tracking**: All shippable items provide their weight for shipping calculations

### 🛒 Shopping Cart
- **Add Products**: Customers can add products to cart with specific quantities
- **Quantity Validation**: System prevents adding more items than available in stock
- **Cart Management**: View and manage items in the shopping cart

### 💳 Checkout System
- **Order Processing**: Complete checkout with items in cart
- **Receipt Generation**: Detailed checkout receipt with:
  - Order subtotal (sum of all items' prices)
  - Shipping fees calculation
  - Total paid amount (subtotal + shipping fees)

### 🚚 Shipping Service
- **Shipping Interface**: `Shippable` interface with `getName()` and `getWeight()` methods
- **Shipment Notices**: Automatic generation of shipping notices for shippable items
- **Weight Calculation**: Total package weight calculation

### ⚠️ Error Handling
- **Empty Cart**: Error when attempting to checkout with empty cart
- **Insufficient Balance**: Error when customer balance is insufficient
- **Out of Stock**: Error when product quantity is not available
- **Expired Products**: Error when trying to purchase expired products

## 🏗️ Architecture

The system follows Object-Oriented Programming principles with the following key components:

### Core Classes
- **`Product`**: Represents products with properties and behaviors
- **`Customer`**: Manages customer information and balance
- **`Cart`**: Shopping cart functionality
- **`CartItem`**: Individual items in the cart (implements `Shippable`)
- **`Checkout`**: Handles the checkout process
- **`Shipping`**: Manages shipping operations

### Interfaces
- **`Shippable`**: Interface for items that can be shipped




## 🧪 Test Cases

The system includes various test scenarios:

### ✅ Successful Checkout
- Valid products with sufficient stock
- Customer with adequate balance
- Proper shipping calculation

### ❌ Error Scenarios
1. **Empty Cart Test**
   ```java
   Customer customer = new Customer("Test", 1000);
   Cart emptyCart = new Cart();
   Checkout.process(customer, emptyCart); // Output: "Cart is empty."
   ```

2. **Insufficient Balance Test**
   ```java
   Customer poorCustomer = new Customer("Poor", 50);
   Product expensiveTV = new Product("TV", 500, 1, 5.0, true, false);
   Cart cart = new Cart();
   cart.add(expensiveTV, 1);
   Checkout.process(poorCustomer, cart); // Output: "Insufficient balance."
   ```

3. **Out of Stock Test**
   ```java
   Customer customer = new Customer("Customer", 1000);
   Product limitedCheese = new Product("Cheese", 100, 1, 0.2, true, false);
   Cart cart = new Cart();
   cart.add(limitedCheese, 2); // Trying to add 2 when only 1 available
   Checkout.process(customer, cart); // Output: "Not enough stock for Cheese"
   ```

4. **Expired Product Test**
   ```java
   Customer customer = new Customer("Customer", 1000);
   Product expiredCheese = new Product("Cheese", 100, 5, 0.2, true, true);
   Cart cart = new Cart();
   cart.add(expiredCheese, 1);
   Checkout.process(customer, cart); // Output: "Product Cheese is expired."
   ```

## 📷 Screenshots

The `screenShoots/` directory contains visual demonstrations of the system:
- System execution examples
- Console output samples
- Test case results


**Challenge**: Fawry Full Stack Development Internship  
**Language**: Java  
**Date**: July 2025
