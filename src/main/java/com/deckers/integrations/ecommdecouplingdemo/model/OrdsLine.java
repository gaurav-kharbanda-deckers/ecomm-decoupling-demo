package com.deckers.integrations.ecommdecouplingdemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrdsLine {
	@JsonProperty("P_LINE_NUMBER") 
    public String lineNumber;
	@JsonProperty("P_LINE_TYPE") 
    public String lineType;
	@JsonProperty("P_UPC") 
    public String upc;
	@JsonProperty("P_QUANTITY") 
    public String quantity;
	@JsonProperty("P_TRANSACTION_ID") 
    public String transactionId;
	
	public String getLineNumber() {
		return lineNumber;
	}
	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	public String getLineType() {
		return lineType;
	}
	public void setLineType(String lineType) {
		this.lineType = lineType;
	}
	public String getUpc() {
		return upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public OrdsLine(String lineNumber, String lineType, String upc, String quantity, String transactionId) {
		super();
		this.lineNumber = lineNumber;
		this.lineType = lineType;
		this.upc = upc;
		this.quantity = quantity;
		this.transactionId = transactionId;
	}
	public OrdsLine() {
		super();
	}
	
		
}
