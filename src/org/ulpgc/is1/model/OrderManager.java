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

    public void addCustomer(String name, String surname){
    //public void addCustomer(String name, String surname, Address address){
        Customer it = new Customer (name, surname);
        //Customer it = new Customer (name, surname, address);
        customers.add(it);
    }

    public void addRestaurant(String name, Phone phone) {

        Restaurant itRestarurant = new Restaurant(name, phone);
        restaurants.add(itRestarurant);
    }
    //public void addDish(String name, String description, int price, OrderItem quantity){
    public void addDish(String name, String description, int price){
        //Dish itDish = new Dish(name, description, price, quantity);
        Dish itDish = new Dish(name, description, price);
        dishes.add(itDish);
    }

    public Customer getCustomer(int id){
        return customers.get(id);
    }

    public Restaurant getRestaurant(int id){
        return restaurants.get(id);
    }

    public Dish getDish(int id){
        return dishes.get(id);
    }

    public void delCustomer(int id) {
        customers.remove(id);
    }

    public void order(Customer customer, Restaurant restaurant, ArrayList<Integer> dishesId, ArrayList<Integer> quantity){
        Order newOrder = new Order(customer, restaurant);
        for (int i = 0; i < dishesId.size(); i++) {
            int dishId = dishesId.get(i);
            int dishQuantity = quantity.get(i);
            if (dishId >= 0 && dishId < dishes.size()) {
                Dish selectedDish = dishes.get(dishId);
                newOrder.addOrderItem(dishQuantity, selectedDish);
            } else {
                System.out.println("Invalid dish ID: " + dishId);
            }
        }
    }

    public int getCustomersCount(){
        int count = 0;
        for (int i = 0; i<customers.size();i++){
            count++;
        }
        return count;
    }
}

