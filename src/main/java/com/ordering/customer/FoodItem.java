package com.ordering.customer;

public class FoodItem {
    private String itemName;
    private double price;
    private int discount;

    public FoodItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public FoodItem(String itemName, double price, int discount) {
        this.itemName = itemName;
        this.price = price;
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public String getItemName() {
        return itemName;
    }

    public int getDiscount() {
        return discount;
    }
}
