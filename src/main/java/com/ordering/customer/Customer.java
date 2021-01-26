package com.ordering.customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Customer {
   HashMap<FoodItem, Integer> cart = new HashMap<>();
    public boolean isEmptyFoodCart() {
        return cart.isEmpty();
    }

    public void addItem(FoodItem item) {
//        if(cart.containsKey(item))
//            cart.put(item, cart.get(item)+1);
//        else
//            cart.put(item, 1);

        cart.put(item, cart.getOrDefault(item, 0)+1);
    }

    public double getSubtotal() {
        double sum = 0;
        for(FoodItem item : cart.keySet()){
            sum = sum + item.getPrice();
        }
        return sum;
    }

    public HashMap<FoodItem, Integer> getCartItems() {
        return cart;
    }

    public List<String> getItemizedList() {
        List<String> list = new ArrayList<>();
        for(FoodItem item : cart.keySet())
        {
            list.add("Name:"+item.getItemName()+" "+"Price:"+item.getPrice()+" "+"Quantity:"+cart.get(item));
        }
        return list;
    }
}
