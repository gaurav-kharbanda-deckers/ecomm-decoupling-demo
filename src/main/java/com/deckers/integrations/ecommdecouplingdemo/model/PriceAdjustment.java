package com.deckers.integrations.ecommdecouplingdemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PriceAdjustment{
    @JsonProperty("NetPrice") 
    public int netPrice;
    @JsonProperty("Tax") 
    public int tax;
    @JsonProperty("GrossPrice") 
    public int grossPrice;
    @JsonProperty("LineItemText") 
    public String lineItemText;
    @JsonProperty("PromotionId") 
    public String promotionId;
    @JsonProperty("CampaignId") 
    public String campaignId;
    @JsonProperty("Type") 
    public int type;
    @JsonProperty("ItemID") 
    public String itemID;
    @JsonProperty("ItemLineNumber") 
    public int itemLineNumber;
    @JsonProperty("CouponID") 
    public String couponID;
    @JsonProperty("PercentValue") 
    public int percentValue;
    @JsonProperty("Level") 
    public int level;
    @JsonProperty("CostPerUnit") 
    public int costPerUnit;
	public int getNetPrice() {
		return netPrice;
	}
	public void setNetPrice(int netPrice) {
		this.netPrice = netPrice;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public int getGrossPrice() {
		return grossPrice;
	}
	public void setGrossPrice(int grossPrice) {
		this.grossPrice = grossPrice;
	}
	public String getLineItemText() {
		return lineItemText;
	}
	public void setLineItemText(String lineItemText) {
		this.lineItemText = lineItemText;
	}
	public String getPromotionId() {
		return promotionId;
	}
	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
	}
	public String getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getItemID() {
		return itemID;
	}
	public void setItemID(String itemID) {
		this.itemID = itemID;
	}
	public int getItemLineNumber() {
		return itemLineNumber;
	}
	public void setItemLineNumber(int itemLineNumber) {
		this.itemLineNumber = itemLineNumber;
	}
	public String getCouponID() {
		return couponID;
	}
	public void setCouponID(String couponID) {
		this.couponID = couponID;
	}
	public int getPercentValue() {
		return percentValue;
	}
	public void setPercentValue(int percentValue) {
		this.percentValue = percentValue;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getCostPerUnit() {
		return costPerUnit;
	}
	public void setCostPerUnit(int costPerUnit) {
		this.costPerUnit = costPerUnit;
	}
	public PriceAdjustment(int netPrice, int tax, int grossPrice, String lineItemText, String promotionId,
			String campaignId, int type, String itemID, int itemLineNumber, String couponID, int percentValue,
			int level, int costPerUnit) {
		super();
		this.netPrice = netPrice;
		this.tax = tax;
		this.grossPrice = grossPrice;
		this.lineItemText = lineItemText;
		this.promotionId = promotionId;
		this.campaignId = campaignId;
		this.type = type;
		this.itemID = itemID;
		this.itemLineNumber = itemLineNumber;
		this.couponID = couponID;
		this.percentValue = percentValue;
		this.level = level;
		this.costPerUnit = costPerUnit;
	}
    
    
}