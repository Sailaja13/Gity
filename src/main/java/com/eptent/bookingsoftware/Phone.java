package com.eptent.bookingsoftware;

import org.springframework.data.annotation.Id;

public class Phone {
	
	@Id private String id;
	
	private String number;
	private String phoneType;

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
