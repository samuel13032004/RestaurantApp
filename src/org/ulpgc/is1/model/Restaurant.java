package org.ulpgc.is1.model;

public class Restaurant {
	private String name;
	private Phone phone;

	public Restaurant(String name, Phone phone){
		this.name = name;
		this.phone = phone;
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
	//TODO addMenu()
}
