package com.deckers.integrations.ecommdecouplingdemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrdsHeader {
	@JsonProperty("P_DOMS_REQUESTID") 
    public String domsRequestId;
	@JsonProperty("P_WEBSITE_ID") 
    public String websiteId;
	@JsonProperty("P_LOCALE") 
    public String locale;
	@JsonProperty("P_ORDERTYPE") 
    public String orderType;
	@JsonProperty("P_ORDERSOURCE") 
    public String orderSource;
	@JsonProperty("P_TRANSACTION_ID") 
    public String transactionId;
	public String getDomsRequestId() {
		return domsRequestId;
	}
	public void setDomsRequestId(String domsRequestId) {
		this.domsRequestId = domsRequestId;
	}
	public String getWebsiteId() {
		return websiteId;
	}
	public void setWebsiteId(String websiteId) {
		this.websiteId = websiteId;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOrderSource() {
		return orderSource;
	}
	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public OrdsHeader(String domsRequestId, String websiteId, String locale, String orderType, String orderSource,
			String transactionId) {
		super();
		this.domsRequestId = domsRequestId;
		this.websiteId = websiteId;
		this.locale = locale;
		this.orderType = orderType;
		this.orderSource = orderSource;
		this.transactionId = transactionId;
	}
	public OrdsHeader() {
		super();
	}
	
	
}
