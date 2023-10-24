package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Menu {
    private String name;
    private MenuType menuType;

    private ArrayList<Restaurant> restaurants;

    private ArrayList<Dish>dishes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuType getMenuType() {
        return menuType;
    }

    public void setMenuType(MenuType menuType) {
        this.menuType = menuType;
    }

    public Menu(String name, MenuType menuType){
        this.restaurants = new ArrayList<Restaurant>();
        this.name = name;
        this.menuType = menuType;
        dishes = new ArrayList<Dish>();
    }

    public void addDish(Dish dish){
        if(!dishes.contains(dish)){
            dishes.add(dish);
        }else{
            System.out.println("El plato ya existe en el menú.");
        }
    }
}
