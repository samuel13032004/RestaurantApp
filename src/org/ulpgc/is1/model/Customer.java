package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Customer {
    private String name;

    private ArrayList<Address> address;

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
        Address a = new Address(street, number, postalCode, city);
        address.add(a);
    }
    //creamos una nueva lista
    private ArrayList<Order> orders;


    public Customer(){

        this.name = name;
        this.surname = surname;
        this.orders = new ArrayList<Order>();
    }
}
