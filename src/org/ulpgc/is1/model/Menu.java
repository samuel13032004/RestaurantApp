package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Menu {
    private String name;
private ArrayList<Dish> dishes;
    private MenuType menuType;

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

        this.name = name;
        this.menuType = menuType;
        dishes = new ArrayList<Dish>();
    }
    public void addDish(Dish dish){
        dishes.add(dish);
    }
}
