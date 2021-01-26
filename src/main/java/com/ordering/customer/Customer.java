package com.ordering.customer;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    List<FoodItem> cart = new ArrayList<>();
    public boolean isEmptyFoodCart() {
        return cart.isEmpty();
    }

    public void addItem(FoodItem item) {
        cart.add(item);
    }

    public double getSubtotal() {
        double sum = 0;
        for(FoodItem item : cart){
            sum = sum + item.getPrice();
        }
        return sum;
    }
}
