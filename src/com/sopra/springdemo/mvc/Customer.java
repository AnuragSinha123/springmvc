package com.sopra.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {


	private String firstName;
	
	@NotNull(message = "is not empty")
	@Size(min=1 , message = "is required")
	private String lastName;
	
	@Min(value=1 , message = "value must be more than zero")
	@Max(value=10 , message = "value must be less than ten")
	public int freePass;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getFreePass() {
		return freePass;
	}
	public void setFreePass(int freePass) {
		this.freePass = freePass;
	}
	
	
}
