package com.deckers.integrations.ecommdecouplingdemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrdsPriceAdjustment {
	@JsonProperty("P_UPC") 
    public String upc;
	@JsonProperty("P_LINE_NUMBER") 
    public String lineNumber;
	@JsonProperty("P_QUANTITY") 
    public String quantity;
	@JsonProperty("P_FREIGHT_CARRIER") 
    public String freightCarrier;
	@JsonProperty("P_SERVICE_LEVEL") 
    public String serviceLevel;
	@JsonProperty("P_LIST_PRICE_PERUNIT") 
    public String listPricePerUnit;
	@JsonProperty("P_NET_PRICE_PERUNIT") 
    public String netPricePerUnit;
	@JsonProperty("P_TRANSACTION_ID") 
    public String transactionId;
	
	public String getUpc() {
		return upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}
	public String getLineNumber() {
		return lineNumber;
	}
	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getFreightCarrier() {
		return freightCarrier;
	}
	public void setFreightCarrier(String freightCarrier) {
		this.freightCarrier = freightCarrier;
	}
	public String getServiceLevel() {
		return serviceLevel;
	}
	public void setServiceLevel(String serviceLevel) {
		this.serviceLevel = serviceLevel;
	}
	public String getListPricePerUnit() {
		return listPricePerUnit;
	}
	public void setListPricePerUnit(String listPricePerUnit) {
		this.listPricePerUnit = listPricePerUnit;
	}
	public String getNetPricePerUnit() {
		return netPricePerUnit;
	}
	public void setNetPricePerUnit(String netPricePerUnit) {
		this.netPricePerUnit = netPricePerUnit;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public OrdsPriceAdjustment(String upc, String lineNumber, String quantity, String freightCarrier,
			String serviceLevel, String listPricePerUnit, String netPricePerUnit, String transactionId) {
		super();
		this.upc = upc;
		this.lineNumber = lineNumber;
		this.quantity = quantity;
		this.freightCarrier = freightCarrier;
		this.serviceLevel = serviceLevel;
		this.listPricePerUnit = listPricePerUnit;
		this.netPricePerUnit = netPricePerUnit;
		this.transactionId = transactionId;
	}
	public OrdsPriceAdjustment() {
		super();
	}
		
}
