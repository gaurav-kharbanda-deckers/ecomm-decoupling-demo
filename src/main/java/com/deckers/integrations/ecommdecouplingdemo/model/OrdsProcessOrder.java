package com.deckers.integrations.ecommdecouplingdemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrdsProcessOrder {
	@JsonProperty("P_LINE_COUNT") 
    public String lineCount;
	@JsonProperty("P_LINE_ADJ_COUNT") 
    public String lineAdjCount;
	@JsonProperty("P_TRANSACTION_ID") 
    public String transactionId;
	
	public String getLineCount() {
		return lineCount;
	}
	public void setLineCount(String lineCount) {
		this.lineCount = lineCount;
	}
	public String getLineAdjCount() {
		return lineAdjCount;
	}
	public void setLineAdjCount(String lineAdjCount) {
		this.lineAdjCount = lineAdjCount;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public OrdsProcessOrder(String lineCount, String lineAdjCount, String transactionId) {
		super();
		this.lineCount = lineCount;
		this.lineAdjCount = lineAdjCount;
		this.transactionId = transactionId;
	}
	public OrdsProcessOrder() {
		super();
	}

}
