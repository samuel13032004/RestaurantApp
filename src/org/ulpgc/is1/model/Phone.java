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
	public boolean isValid(){
		if (number.length() == 9){
			return true;
		} else {
			setNumber("XXXX");
			return false;
		}
	}
}
