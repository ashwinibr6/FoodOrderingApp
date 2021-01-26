package com.ordering.customer;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Customer {
   LinkedHashMap<FoodItem, Integer> cart = new LinkedHashMap<>();
    private double subTotal;

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
        return subTotal;
    }

    public void calculateSubtotal(){
        double sum = 0;
        for(FoodItem item : cart.keySet()){
            double dicountAmt = item.getPrice() - (item.getPrice()*item.getDiscount()/100);
            dicountAmt = dicountAmt * cart.get(item);
            sum = sum + dicountAmt;
        }
        this.subTotal = sum;
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

    public List<String> getDiscountedItems() {
        List<String> list = new ArrayList<>();
        for(FoodItem item : cart.keySet())
        {
            if(item.getDiscount() > 0)
                list.add("Name:"+item.getItemName()+" "+"Price:"+item.getPrice()+" "+"Quantity:"+cart.get(item));
        }
        return list;
    }

    public void order(LocalDateTime dateTime) {
        LocalTime fromTime = LocalTime.of(21,00,00);
        LocalTime toTime = LocalTime.of(06,00,00);

        LocalTime target = dateTime.toLocalTime();
        System.out.println(target);
        Boolean targetInZone = (
                target.isAfter( LocalTime.parse( "21:00:00" ) )
                        &&
                        target.isBefore( LocalTime.parse( "06:00:00" ) )
        ) ;

        if(targetInZone) {
          System.out.println(this.subTotal);
          setSubtotal(this.subTotal*0.1);
          System.out.println(this.subTotal);
      }
      }

    private void setSubtotal(double subTotal) {
        this.subTotal = subTotal;
    }

}
