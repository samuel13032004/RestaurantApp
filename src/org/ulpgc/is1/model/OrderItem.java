package org.ulpgc.is1.model;

public class OrderItem {
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public OrderItem(int quantity){
        this.quantity = quantity;
    }
}
