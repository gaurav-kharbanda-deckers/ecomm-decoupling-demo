package com.deckers.integrations.ecommdecouplingdemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShipAddress{
    @JsonProperty("LocationName") 
    public String locationName;
    @JsonProperty("Title") 
    public String title;
    @JsonProperty("FirstName") 
    public String firstName;
    @JsonProperty("LastName") 
    public String lastName;
    @JsonProperty("AddressLine1") 
    public String addressLine1;
    @JsonProperty("AddressLine2") 
    public String addressLine2;
    @JsonProperty("AddressLine3") 
    public String addressLine3;
    @JsonProperty("City") 
    public String city;
    @JsonProperty("State") 
    public String state;
    @JsonProperty("PostalCode") 
    public String postalCode;
    @JsonProperty("Country") 
    public String country;
    @JsonProperty("Phone") 
    public String phone;
    @JsonProperty("ShipEmail") 
    public String shipEmail;
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getAddressLine3() {
		return addressLine3;
	}
	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getShipEmail() {
		return shipEmail;
	}
	public void setShipEmail(String shipEmail) {
		this.shipEmail = shipEmail;
	}
	public ShipAddress(String locationName, String title, String firstName, String lastName, String addressLine1,
			String addressLine2, String addressLine3, String city, String state, String postalCode, String country,
			String phone, String shipEmail) {
		super();
		this.locationName = locationName;
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
		this.phone = phone;
		this.shipEmail = shipEmail;
	}
    
    
}