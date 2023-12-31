package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Customer {
    private String name;

    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private String surname;

    public void addAddress(String street, int number, int postalCode, String city) {
            address = new Address(street, number, postalCode, city);
    }
    private ArrayList<Order> orders;

    public ArrayList<Order> getOrders(){
        return orders;
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public Address getAddress() {
        return address;
    }

    public Customer(String name, String surname){

        this.name = name;
        this.surname = surname;
        this.orders = new ArrayList<Order>();
    }
}
