package org.ulpgc.is1.model;

public class Phone {
	private String number;

	public Phone(String number){
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	public static boolean isValid(String number){
		return number.matches("\\d{9}");
	}
}
