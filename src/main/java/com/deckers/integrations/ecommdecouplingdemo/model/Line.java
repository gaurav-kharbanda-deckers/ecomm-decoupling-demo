package com.deckers.integrations.ecommdecouplingdemo.model;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Line{
    @JsonProperty("ShipMethod") 
    public String shipMethod;
    @JsonProperty("UPC") 
    public String uPC;
    @JsonProperty("LineNumber") 
    public BigDecimal lineNumber;
    @JsonProperty("TotalLineCost") 
    public BigDecimal totalLineCost;
    @JsonProperty("Quantity") 
    public BigDecimal quantity;
    @JsonProperty("PriceAdjustmentPercentage") 
    public BigDecimal priceAdjustmentPercentage;
    @JsonProperty("PriceAdjustments") 
    public List<PriceAdjustment> priceAdjustments;
    @JsonProperty("NetLineCost") 
    public BigDecimal netLineCost;
    @JsonProperty("SellingCostPerUnit") 
    public BigDecimal sellingCostPerUnit;
    @JsonProperty("TotalSellingLineCost") 
    public BigDecimal totalSellingLineCost;
    @JsonProperty("NetSellingCost") 
    public BigDecimal netSellingCost;
    @JsonProperty("GiftMessage") 
    public String giftMessage;
    @JsonProperty("ShippingEmailAddr") 
    public String shippingEmailAddr;
    @JsonProperty("IsGift") 
    public boolean isGift;
    @JsonProperty("GiftWrap") 
    public boolean giftWrap;
    @JsonProperty("PreOrder_BackOrder") 
    public boolean preOrder_BackOrder;
	public String getShipMethod() {
		return shipMethod;
	}
	public void setShipMethod(String shipMethod) {
		this.shipMethod = shipMethod;
	}
	public String getuPC() {
		return uPC;
	}
	public void setuPC(String uPC) {
		this.uPC = uPC;
	}
	public BigDecimal getLineNumber() {
		return lineNumber;
	}
	public void setLineNumber(BigDecimal lineNumber) {
		this.lineNumber = lineNumber;
	}
	public BigDecimal getTotalLineCost() {
		return totalLineCost;
	}
	public void setTotalLineCost(BigDecimal totalLineCost) {
		this.totalLineCost = totalLineCost;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getPriceAdjustmentPercentage() {
		return priceAdjustmentPercentage;
	}
	public void setPriceAdjustmentPercentage(BigDecimal priceAdjustmentPercentage) {
		this.priceAdjustmentPercentage = priceAdjustmentPercentage;
	}
	public List<PriceAdjustment> getPriceAdjustments() {
		return priceAdjustments;
	}
	public void setPriceAdjustments(List<PriceAdjustment> priceAdjustments) {
		this.priceAdjustments = priceAdjustments;
	}
	public BigDecimal getNetLineCost() {
		return netLineCost;
	}
	public void setNetLineCost(BigDecimal netLineCost) {
		this.netLineCost = netLineCost;
	}
	public BigDecimal getSellingCostPerUnit() {
		return sellingCostPerUnit;
	}
	public void setSellingCostPerUnit(BigDecimal sellingCostPerUnit) {
		this.sellingCostPerUnit = sellingCostPerUnit;
	}
	public BigDecimal getTotalSellingLineCost() {
		return totalSellingLineCost;
	}
	public void setTotalSellingLineCost(BigDecimal totalSellingLineCost) {
		this.totalSellingLineCost = totalSellingLineCost;
	}
	public BigDecimal getNetSellingCost() {
		return netSellingCost;
	}
	public void setNetSellingCost(BigDecimal netSellingCost) {
		this.netSellingCost = netSellingCost;
	}
	public String getGiftMessage() {
		return giftMessage;
	}
	public void setGiftMessage(String giftMessage) {
		this.giftMessage = giftMessage;
	}
	public String getShippingEmailAddr() {
		return shippingEmailAddr;
	}
	public void setShippingEmailAddr(String shippingEmailAddr) {
		this.shippingEmailAddr = shippingEmailAddr;
	}
	public boolean isGift() {
		return isGift;
	}
	public void setGift(boolean isGift) {
		this.isGift = isGift;
	}
	public boolean isGiftWrap() {
		return giftWrap;
	}
	public void setGiftWrap(boolean giftWrap) {
		this.giftWrap = giftWrap;
	}
	public boolean isPreOrder_BackOrder() {
		return preOrder_BackOrder;
	}
	public void setPreOrder_BackOrder(boolean preOrder_BackOrder) {
		this.preOrder_BackOrder = preOrder_BackOrder;
	}
	public Line(String shipMethod, String uPC, BigDecimal lineNumber, BigDecimal totalLineCost, BigDecimal quantity,
			BigDecimal priceAdjustmentPercentage, List<PriceAdjustment> priceAdjustments, BigDecimal netLineCost,
			BigDecimal sellingCostPerUnit, BigDecimal totalSellingLineCost, BigDecimal netSellingCost, String giftMessage,
			String shippingEmailAddr, boolean isGift, boolean giftWrap, boolean preOrder_BackOrder) {
		super();
		this.shipMethod = shipMethod;
		this.uPC = uPC;
		this.lineNumber = lineNumber;
		this.totalLineCost = totalLineCost;
		this.quantity = quantity;
		this.priceAdjustmentPercentage = priceAdjustmentPercentage;
		this.priceAdjustments = priceAdjustments;
		this.netLineCost = netLineCost;
		this.sellingCostPerUnit = sellingCostPerUnit;
		this.totalSellingLineCost = totalSellingLineCost;
		this.netSellingCost = netSellingCost;
		this.giftMessage = giftMessage;
		this.shippingEmailAddr = shippingEmailAddr;
		this.isGift = isGift;
		this.giftWrap = giftWrap;
		this.preOrder_BackOrder = preOrder_BackOrder;
	}
    
    
}