package org.ulpgc.is1.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Order {
    private static int NEXT_ID = 0;
    private final int id;

    private Customer customer;
    //private ArrayList<Customer> c;
    private ArrayList<OrderItem> orderItem;

    private Restaurant restaurant;

    public void addOrderItem(int quantity, Dish dish) {
        OrderItem orderItem1 = new OrderItem(quantity, dish);
        orderItem.add(orderItem1);
    }
    public Order(Customer customer, Restaurant restaurant) {
        this.id = NEXT_ID++;
        this.customer = customer;
        this.restaurant = restaurant;
        this.orderItem = new ArrayList<>();
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public ArrayList<OrderItem> getOrderItem(){
        return orderItem;
    }

    public int price() {
        int totalPrice = 0;
        for (OrderItem item : orderItem) {
            totalPrice += item.price();
        }
        return totalPrice;
    }
}
