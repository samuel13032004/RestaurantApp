package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Restaurant {
	private String name;

	private String number;

	private ArrayList<Menu> menus;
	private ArrayList<Order> orders;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Restaurant(String name, String number){
		this.name = name;
		if (Phone.isValid(number)){
			this.number = number;
		} else {
			this.number = "XXXX";
		}
		this.menus = new ArrayList<Menu>();
		this.orders = new ArrayList<Order>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addMenu(Menu newMenu){
		if(!menus.contains((newMenu))){
			menus.add(newMenu);
		}else{
			System.out.println("El menú ya existe en este restaurante.");
		}
	}
	public Menu getMenu(int i){
		return this.menus.get(i);
	}
}
