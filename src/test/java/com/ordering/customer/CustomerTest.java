package com.ordering.customer;

import com.ordering.customer.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CustomerTest {
    Customer customer;
    FoodItem item1 = new FoodItem("Burger", 10.99);
    FoodItem item2 = new FoodItem("Deep dish Pizza", 20.0);
    @BeforeEach
    public void setUp(){
       customer  = new Customer();
    }

    @Test
    public void isEmpty_foodCart(){
        assertTrue(customer.isEmptyFoodCart());
    }

    @Test
    public void addingAnItem_updatesTotalPrice(){
        assertTrue(customer.isEmptyFoodCart());
        customer.addItem(item1);
        double actualPrice = customer.getSubtotal();
        assertEquals(10.99, actualPrice);

    }

    @Test
    public void addingMultipleItems_updatesTotalPrice(){
        assertTrue(customer.isEmptyFoodCart());
        customer.addItem(item1);
        customer.addItem(item2);
        double actualPrice = customer.getSubtotal();
        assertEquals(30.99, actualPrice,0.1);

    }
}
