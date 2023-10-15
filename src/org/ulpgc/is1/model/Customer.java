package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Customer {
    private String name;

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

    private ArrayList<Address> address;

    public void addAddress(String street, int number, int postalCode, String city) {
        Address a = new Address (street, number, postalCode, city);
        address.add( a );
    }

    public Customer(String name, String surname, String street, int number, int postalCode, String city){

        this.name = name;
        this.surname = surname;
    }
}
