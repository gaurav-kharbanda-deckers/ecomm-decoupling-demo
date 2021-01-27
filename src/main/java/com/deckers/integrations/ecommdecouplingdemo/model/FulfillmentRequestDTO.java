package com.deckers.integrations.ecommdecouplingdemo.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FulfillmentRequestDTO {
    @JsonProperty("RequestId") 
    public String requestId;
    @JsonProperty("Shippable") 
    public boolean shippable;
    @JsonProperty("CustomerPoNumber") 
    public String customerPoNumber;
    @JsonProperty("WebsiteID") 
    public String websiteID;
    @JsonProperty("Locale") 
    public String locale;
    @JsonProperty("ShipAddress") 
    public ShipAddress shipAddress;
    @JsonProperty("Currency") 
    public String currency;
    @JsonProperty("FulfillmentCenter") 
    public FulfillmentCenter fulfillmentCenter;
    @JsonProperty("Lines") 
    public List<Line> lines;
    @JsonProperty("OrderDate") 
    public Date orderDate;
    @JsonProperty("OrderType") 
    public String orderType;
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public boolean isShippable() {
		return shippable;
	}
	public void setShippable(boolean shippable) {
		this.shippable = shippable;
	}
	public String getCustomerPoNumber() {
		return customerPoNumber;
	}
	public void setCustomerPoNumber(String customerPoNumber) {
		this.customerPoNumber = customerPoNumber;
	}
	public String getWebsiteID() {
		return websiteID;
	}
	public void setWebsiteID(String websiteID) {
		this.websiteID = websiteID;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public ShipAddress getShipAddress() {
		return shipAddress;
	}
	public void setShipAddress(ShipAddress shipAddress) {
		this.shipAddress = shipAddress;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public FulfillmentCenter getFulfillmentCenter() {
		return fulfillmentCenter;
	}
	public void setFulfillmentCenter(FulfillmentCenter fulfillmentCenter) {
		this.fulfillmentCenter = fulfillmentCenter;
	}
	public List<Line> getLines() {
		return lines;
	}
	public void setLines(List<Line> lines) {
		this.lines = lines;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public FulfillmentRequestDTO(String requestId, boolean shippable, String customerPoNumber, String websiteID,
			String locale, ShipAddress shipAddress, String currency, FulfillmentCenter fulfillmentCenter,
			List<Line> lines, Date orderDate, String orderType) {
		super();
		this.requestId = requestId;
		this.shippable = shippable;
		this.customerPoNumber = customerPoNumber;
		this.websiteID = websiteID;
		this.locale = locale;
		this.shipAddress = shipAddress;
		this.currency = currency;
		this.fulfillmentCenter = fulfillmentCenter;
		this.lines = lines;
		this.orderDate = orderDate;
		this.orderType = orderType;
	}
    
    
}
