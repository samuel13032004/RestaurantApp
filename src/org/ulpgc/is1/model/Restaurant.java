package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Restaurant {
	private String name;
	private Phone phone;

	private ArrayList<Menu>menus;

	public Restaurant(String name, Phone phone){
		this.name = name;
		this.phone = phone;
		this.menus = new ArrayList<Menu>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public Menu getMenu(int i){
		return this.menus.get(i);
	}

	public void addMenu(Menu newMenu){
		this.menus.add(newMenu);
	}
}
