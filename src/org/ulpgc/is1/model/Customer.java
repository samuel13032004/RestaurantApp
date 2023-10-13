package org.ulpgc.is1.model;

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

    private Address address;

    public Address getAddress() {
        return address;
    }

    //public void setAddress(Address address) {
        this.address = new Address(street,
                number,
                postalCode,
                city);

    }

    public Customer(String name, String surname, String street, int number, int postalCode, String city){

        this.name = name;
        this.surname = surname;
        //this.address = new Address(street, number, postalCode, city);
    }
}
