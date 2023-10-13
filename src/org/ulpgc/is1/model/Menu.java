package org.ulpgc.is1.model;

public class Menu {
    private String name;

    private MenuType menuType;
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
    }

}
