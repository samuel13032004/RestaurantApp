package org.ulpgc.is1.model;

public class OrderItem {
    private int quantity;

    private Dish dish;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public OrderItem(int quantity, Dish dish){

        this.quantity = quantity;
        this.dish = dish;
    }
}
