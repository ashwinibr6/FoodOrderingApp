package com.ordering.customer;

public class FoodItem {
    private String itemName;
    private double price;

    public FoodItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
