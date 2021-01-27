package com.deckers.integrations.ecommdecouplingdemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DummyJsonModel {
	@JsonProperty("id") 
    public String hotelId;
	@JsonProperty("hotel_name") 
    public String hotelName;
	@JsonProperty("name") 
    public String custName;
	@JsonProperty("phone") 
    public String custPhone;
	@JsonProperty("count") 
    public String custCount;
	public DummyJsonModel(String hotelId, String hotelName, String custName, String custPhone, String custCount) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.custName = custName;
		this.custPhone = custPhone;
		this.custCount = custCount;
	}
	public DummyJsonModel() {
		super();
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}
	public String getCustCount() {
		return custCount;
	}
	public void setCustCount(String custCount) {
		this.custCount = custCount;
	}
	
	
}
