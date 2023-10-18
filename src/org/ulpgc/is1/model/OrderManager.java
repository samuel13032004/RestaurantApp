package org.ulpgc.is1.model;

import java.util.ArrayList;

public class OrderManager {
    //private final ArrayList<Customer> customers;
    //public void removeCustomer(int index) {
        //customers.remove(index);
    //}

    private ArrayList<Customer> customers;
    private ArrayList<Restaurant> restaurants;
    private ArrayList<Dish> dishes;

    public void addCustomer(String name, String surname, Address address){
        Customer it = new Customer (name, surname, address);
        customers.add(it);
    }

    public void addRestaurant(String name, Phone phone) {

        Restaurant itRestarurant = new Restaurant(name, phone);
        restaurants.add(itRestarurant);
    }
    public void addDish(String name, String description, int price){
        Dish itDish = new Dish(name, description, price);
        dishes.add(itDish);
    }

    public Customer getCustomer(int id){
        return customers.get(id);
    }

    public Restaurant getRestaurant(int id){
        return restaurants.remove(id);
    }

    public Dish getDish(int id){
        return dishes.remove(id);
    }
    public order(){}
}
