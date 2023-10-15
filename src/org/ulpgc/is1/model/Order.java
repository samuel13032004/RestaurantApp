package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Order {
    private static int NEXT_ID = 0;
    private final int id;

    private ArrayList<Customer> c;
    private Customer customer;
    private ArrayList<OrderItem> orderItem;
    public void addOrderItem(int quantity, Dish dish) {
        OrderItem orderItem1 = new OrderItem(quantity, dish);
        orderItem.add(orderItem1);
    }
    public Order(Customer customer) {
        this.id = NEXT_ID++;
        this.customer = new Customer();
        this.c =new ArrayList<Customer>();
    }

}
