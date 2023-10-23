package org.ulpgc.is1.model;

public class Dish {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private String name;
    private String description;
    private int price;

    private int ID;

    public int getID() {
        return ID;
    }

    public Dish(String name, String description, int price, int ID){
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
