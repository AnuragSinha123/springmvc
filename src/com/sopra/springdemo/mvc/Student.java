package com.sopra.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String Country;
	
	private LinkedHashMap<String , String> CountryOptions;
	
	private String favouriteLanguage;
	
	public Student() {
		
		CountryOptions = new LinkedHashMap<>();
		CountryOptions.put("IN", "India");
		CountryOptions.put("BR", "Brazil");
		CountryOptions.put("US", "USA");
		CountryOptions.put("FR", "France");
		CountryOptions.put("DE", "Germany");

	}
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
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return CountryOptions;
	}
	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}
	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}
	
	
}
