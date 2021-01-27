package com.deckers.integrations.ecommdecouplingdemo.model;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Date;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({ @NamedQuery(name = "DoOrderLines.findAll", query = "select o from DoOrderLines o") })
@Table(name = "DO_ORDER_LINES", schema="DO_OM")
public class DoOrderLines implements Serializable {
    private static final long serialVersionUID = -2844554585739641293L;
    @Column(length = 240)
    private String attribute1;
    @Column(length = 240)
    private String attribute10;
    @Column(length = 240)
    private String attribute11;
    @Column(length = 240)
    private String attribute12;
    @Column(length = 240)
    private String attribute13;
    @Column(length = 240)
    private String attribute14;
    @Column(length = 240)
    private String attribute15;
    @Column(length = 240)
    private String attribute2;
    @Column(length = 240)
    private String attribute3;
    @Column(length = 240)
    private String attribute4;
    @Column(length = 240)
    private String attribute5;
    @Column(length = 240)
    private String attribute6;
    @Column(length = 240)
    private String attribute7;
    @Column(length = 240)
    private String attribute8;
    @Column(length = 240)
    private String attribute9;
    @Column(name = "CALCULATE_PRICE_FLAG", nullable = false, length = 1)
    private String calculatePriceFlag;
    @Column(name = "CHANGE_REASON", length = 30)
    private String changeReason;
    @Column(name = "CLOSED_FLAG", nullable = false, length = 1)
    private String closedFlag;
    @Column(name = "CREATED_BY", nullable = false)
    private BigDecimal createdBy;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATION_DATE", nullable = false)
    private Date creationDate;
    @Column(name = "CUSTOMER_PO_NUMBER", length = 50)
    private String customerPoNumber;
    @Column(name = "ERROR_FLAG", nullable = false, length = 1)
    private String errorFlag;
    @Column(name = "FLUID_RECIPE_ID", length = 50)
    private String fluidRecipeId;
    @Column(name = "GLOBAL_ATTRIBUTE19", length = 240)
    private String globalAttribute19;
    @Column(name = "GLOBAL_ATTRIBUTE20", length = 240)
    private String globalAttribute20;
    @Column(name = "HEADER_ID")
    private BigDecimal headerId;
    @Column(name = "INTMED_SHIP_TO_ORG_ID")
    private BigDecimal intmedShipToOrgId;
    @Column(name = "INVENTORY_ITEM_ID", nullable = false)
    private BigDecimal inventoryItemId;
    @Column(name = "LAST_UPDATED_BY", nullable = false)
    private BigDecimal lastUpdatedBy;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_UPDATE_DATE", nullable = false)
    private Date lastUpdateDate;
    @Column(name = "LINE_ID")
    private BigDecimal lineId;
    @Column(name = "LINE_NUMBER", nullable = false)
    private BigDecimal lineNumber;
    @Column(name = "LINE_TYPE_ID")
    private BigDecimal lineTypeId;
    @Column(name = "OPERATION_CODE", nullable = false, length = 30)
    private String operationCode;
    @Column(name = "ORDERED_QUANTITY", nullable = false)
    private BigDecimal orderedQuantity;
    @Column(name = "ORDER_QUANTITY_UOM", nullable = false, length = 3)
    private String orderQuantityUom;
    @Column(name = "ORDER_SOURCE_ID", nullable = false)
    private BigDecimal orderSourceId;
    @Column(name = "ORG_ID", nullable = false)
    private BigDecimal orgId;
    @Id
    @Column(name = "ORIG_SYS_LINE_REF", nullable = false, length = 50)
    private String origSysLineRef;
    @Column(name = "PAYMENT_TERM_ID", nullable = false)
    private BigDecimal paymentTermId;
    @Column(name = "PRICE_LIST_ID")
    private BigDecimal priceListId;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "PRICING_DATE", nullable = false)
    private Date pricingDate;
    @Column(name = "PRICING_QUANTITY", nullable = false)
    private BigDecimal pricingQuantity;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "PROMISE_DATE")
    private Date promiseDate;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REQUEST_DATE", nullable = false)
    private Date requestDate;
    @Column(name = "RETURN_REASON_CODE", length = 30)
    private String returnReasonCode;
    @Column(name = "SALESREP_ID", nullable = false)
    private BigDecimal salesrepId;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "SCHEDULE_SHIP_DATE")
    private Date scheduleShipDate;
    @Column(name = "SHIPPING_INSTRUCTIONS", length = 2000)
    private String shippingInstructions;
    @Column(name = "SHIPPING_METHOD_CODE", length = 30)
    private String shippingMethodCode;
    @Column(name = "SHIP_FROM_ORG_ID")
    private BigDecimal shipFromOrgId;
    @Column(name = "SHIP_TO_ORG_ID", nullable = false)
    private BigDecimal shipToOrgId;
    @Column(name = "SOLD_TO_ORG_ID", nullable = false)
    private BigDecimal soldToOrgId;
    @Column(name = "SORT_ORDER")
    private BigDecimal sortOrder;
    @Column(length = 10)
    private String subinventory;
    @Column(name = "TAX_CODE", length = 50)
    private String taxCode;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TAX_DATE")
    private Date taxDate;
    @Column(name = "TAX_VALUE")
    private BigDecimal taxValue;
    @Column(name = "UNIT_LIST_PRICE", nullable = false)
    private BigDecimal unitListPrice;
    @Column(name = "UNIT_LIST_PRICE_PER_PQTY")
    private BigDecimal unitListPricePerPqty;
    @Column(name = "UNIT_SELLING_PRICE", nullable = false)
    private BigDecimal unitSellingPrice;
    @Column(name = "UNIT_SELLING_PRICE_PER_PQTY")
    private BigDecimal unitSellingPricePerPqty;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "ORIG_SYS_DOCUMENT_REF")
    private DoOrderHeaders doOrderHeaders1;
    @OneToMany(mappedBy = "doOrderLines", cascade = { CascadeType.ALL, CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.REMOVE})
    private List<DoOrderPriceAdjs> doOrderPriceAdjsList1;

    public DoOrderLines() {
    }

    public DoOrderLines(String attribute1, String attribute10, String attribute11, String attribute12,
                        String attribute13, String attribute14, String attribute15, String attribute2,
                        String attribute3, String attribute4, String attribute5, String attribute6, String attribute7,
                        String attribute8, String attribute9, String calculatePriceFlag, String changeReason,
                        String closedFlag, BigDecimal createdBy, Date creationDate, String customerPoNumber,
                        String errorFlag, String fluidRecipeId, String globalAttribute19, String globalAttribute20,
                        BigDecimal headerId, BigDecimal intmedShipToOrgId, BigDecimal inventoryItemId,
                        Date lastUpdateDate, BigDecimal lastUpdatedBy, BigDecimal lineId, BigDecimal lineNumber,
                        BigDecimal lineTypeId, String operationCode, String orderQuantityUom, BigDecimal orderSourceId,
                        BigDecimal orderedQuantity, BigDecimal orgId, DoOrderHeaders doOrderHeaders1,
                        String origSysLineRef, BigDecimal paymentTermId, BigDecimal priceListId, Date pricingDate,
                        BigDecimal pricingQuantity, Date promiseDate, Date requestDate, String returnReasonCode,
                        BigDecimal salesrepId, Date scheduleShipDate, BigDecimal shipFromOrgId, BigDecimal shipToOrgId,
                        String shippingInstructions, String shippingMethodCode, BigDecimal soldToOrgId,
                        BigDecimal sortOrder, String subinventory, String taxCode, Date taxDate, BigDecimal taxValue,
                        BigDecimal unitListPrice, BigDecimal unitListPricePerPqty, BigDecimal unitSellingPrice,
                        BigDecimal unitSellingPricePerPqty) {
        this.attribute1 = attribute1;
        this.attribute10 = attribute10;
        this.attribute11 = attribute11;
        this.attribute12 = attribute12;
        this.attribute13 = attribute13;
        this.attribute14 = attribute14;
        this.attribute15 = attribute15;
        this.attribute2 = attribute2;
        this.attribute3 = attribute3;
        this.attribute4 = attribute4;
        this.attribute5 = attribute5;
        this.attribute6 = attribute6;
        this.attribute7 = attribute7;
        this.attribute8 = attribute8;
        this.attribute9 = attribute9;
        this.calculatePriceFlag = calculatePriceFlag;
        this.changeReason = changeReason;
        this.closedFlag = closedFlag;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.customerPoNumber = customerPoNumber;
        this.errorFlag = errorFlag;
        this.fluidRecipeId = fluidRecipeId;
        this.globalAttribute19 = globalAttribute19;
        this.globalAttribute20 = globalAttribute20;
        this.headerId = headerId;
        this.intmedShipToOrgId = intmedShipToOrgId;
        this.inventoryItemId = inventoryItemId;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.lineId = lineId;
        this.lineNumber = lineNumber;
        this.lineTypeId = lineTypeId;
        this.operationCode = operationCode;
        this.orderQuantityUom = orderQuantityUom;
        this.orderSourceId = orderSourceId;
        this.orderedQuantity = orderedQuantity;
        this.orgId = orgId;
        this.doOrderHeaders1 = doOrderHeaders1;
        this.origSysLineRef = origSysLineRef;
        this.paymentTermId = paymentTermId;
        this.priceListId = priceListId;
        this.pricingDate = pricingDate;
        this.pricingQuantity = pricingQuantity;
        this.promiseDate = promiseDate;
        this.requestDate = requestDate;
        this.returnReasonCode = returnReasonCode;
        this.salesrepId = salesrepId;
        this.scheduleShipDate = scheduleShipDate;
        this.shipFromOrgId = shipFromOrgId;
        this.shipToOrgId = shipToOrgId;
        this.shippingInstructions = shippingInstructions;
        this.shippingMethodCode = shippingMethodCode;
        this.soldToOrgId = soldToOrgId;
        this.sortOrder = sortOrder;
        this.subinventory = subinventory;
        this.taxCode = taxCode;
        this.taxDate = taxDate;
        this.taxValue = taxValue;
        this.unitListPrice = unitListPrice;
        this.unitListPricePerPqty = unitListPricePerPqty;
        this.unitSellingPrice = unitSellingPrice;
        this.unitSellingPricePerPqty = unitSellingPricePerPqty;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute10() {
        return attribute10;
    }

    public void setAttribute10(String attribute10) {
        this.attribute10 = attribute10;
    }

    public String getAttribute11() {
        return attribute11;
    }

    public void setAttribute11(String attribute11) {
        this.attribute11 = attribute11;
    }

    public String getAttribute12() {
        return attribute12;
    }

    public void setAttribute12(String attribute12) {
        this.attribute12 = attribute12;
    }

    public String getAttribute13() {
        return attribute13;
    }

    public void setAttribute13(String attribute13) {
        this.attribute13 = attribute13;
    }

    public String getAttribute14() {
        return attribute14;
    }

    public void setAttribute14(String attribute14) {
        this.attribute14 = attribute14;
    }

    public String getAttribute15() {
        return attribute15;
    }

    public void setAttribute15(String attribute15) {
        this.attribute15 = attribute15;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }

    public String getAttribute6() {
        return attribute6;
    }

    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6;
    }

    public String getAttribute7() {
        return attribute7;
    }

    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7;
    }

    public String getAttribute8() {
        return attribute8;
    }

    public void setAttribute8(String attribute8) {
        this.attribute8 = attribute8;
    }

    public String getAttribute9() {
        return attribute9;
    }

    public void setAttribute9(String attribute9) {
        this.attribute9 = attribute9;
    }

    public String getCalculatePriceFlag() {
        return calculatePriceFlag;
    }

    public void setCalculatePriceFlag(String calculatePriceFlag) {
        this.calculatePriceFlag = calculatePriceFlag;
    }

    public String getChangeReason() {
        return changeReason;
    }

    public void setChangeReason(String changeReason) {
        this.changeReason = changeReason;
    }

    public String getClosedFlag() {
        return closedFlag;
    }

    public void setClosedFlag(String closedFlag) {
        this.closedFlag = closedFlag;
    }

    public BigDecimal getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(BigDecimal createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getCustomerPoNumber() {
        return customerPoNumber;
    }

    public void setCustomerPoNumber(String customerPoNumber) {
        this.customerPoNumber = customerPoNumber;
    }

    public String getErrorFlag() {
        return errorFlag;
    }

    public void setErrorFlag(String errorFlag) {
        this.errorFlag = errorFlag;
    }

    public String getFluidRecipeId() {
        return fluidRecipeId;
    }

    public void setFluidRecipeId(String fluidRecipeId) {
        this.fluidRecipeId = fluidRecipeId;
    }

    public String getGlobalAttribute19() {
        return globalAttribute19;
    }

    public void setGlobalAttribute19(String globalAttribute19) {
        this.globalAttribute19 = globalAttribute19;
    }

    public String getGlobalAttribute20() {
        return globalAttribute20;
    }

    public void setGlobalAttribute20(String globalAttribute20) {
        this.globalAttribute20 = globalAttribute20;
    }

    public BigDecimal getHeaderId() {
        return headerId;
    }

    public void setHeaderId(BigDecimal headerId) {
        this.headerId = headerId;
    }

    public BigDecimal getIntmedShipToOrgId() {
        return intmedShipToOrgId;
    }

    public void setIntmedShipToOrgId(BigDecimal intmedShipToOrgId) {
        this.intmedShipToOrgId = intmedShipToOrgId;
    }

    public BigDecimal getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(BigDecimal inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public BigDecimal getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(BigDecimal lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public BigDecimal getLineId() {
        return lineId;
    }

    public void setLineId(BigDecimal lineId) {
        this.lineId = lineId;
    }

    public BigDecimal getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(BigDecimal lineNumber) {
        this.lineNumber = lineNumber;
    }

    public BigDecimal getLineTypeId() {
        return lineTypeId;
    }

    public void setLineTypeId(BigDecimal lineTypeId) {
        this.lineTypeId = lineTypeId;
    }

    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

    public BigDecimal getOrderedQuantity() {
        return orderedQuantity;
    }

    public void setOrderedQuantity(BigDecimal orderedQuantity) {
        this.orderedQuantity = orderedQuantity;
    }

    public String getOrderQuantityUom() {
        return orderQuantityUom;
    }

    public void setOrderQuantityUom(String orderQuantityUom) {
        this.orderQuantityUom = orderQuantityUom;
    }

    public BigDecimal getOrderSourceId() {
        return orderSourceId;
    }

    public void setOrderSourceId(BigDecimal orderSourceId) {
        this.orderSourceId = orderSourceId;
    }

    public BigDecimal getOrgId() {
        return orgId;
    }

    public void setOrgId(BigDecimal orgId) {
        this.orgId = orgId;
    }


    public String getOrigSysLineRef() {
        return origSysLineRef;
    }

    public void setOrigSysLineRef(String origSysLineRef) {
        this.origSysLineRef = origSysLineRef;
    }

    public BigDecimal getPaymentTermId() {
        return paymentTermId;
    }

    public void setPaymentTermId(BigDecimal paymentTermId) {
        this.paymentTermId = paymentTermId;
    }

    public BigDecimal getPriceListId() {
        return priceListId;
    }

    public void setPriceListId(BigDecimal priceListId) {
        this.priceListId = priceListId;
    }

    public Date getPricingDate() {
        return pricingDate;
    }

    public void setPricingDate(Date pricingDate) {
        this.pricingDate = pricingDate;
    }

    public BigDecimal getPricingQuantity() {
        return pricingQuantity;
    }

    public void setPricingQuantity(BigDecimal pricingQuantity) {
        this.pricingQuantity = pricingQuantity;
    }

    public Date getPromiseDate() {
        return promiseDate;
    }

    public void setPromiseDate(Date promiseDate) {
        this.promiseDate = promiseDate;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getReturnReasonCode() {
        return returnReasonCode;
    }

    public void setReturnReasonCode(String returnReasonCode) {
        this.returnReasonCode = returnReasonCode;
    }

    public BigDecimal getSalesrepId() {
        return salesrepId;
    }

    public void setSalesrepId(BigDecimal salesrepId) {
        this.salesrepId = salesrepId;
    }

    public Date getScheduleShipDate() {
        return scheduleShipDate;
    }

    public void setScheduleShipDate(Date scheduleShipDate) {
        this.scheduleShipDate = scheduleShipDate;
    }

    public String getShippingInstructions() {
        return shippingInstructions;
    }

    public void setShippingInstructions(String shippingInstructions) {
        this.shippingInstructions = shippingInstructions;
    }

    public String getShippingMethodCode() {
        return shippingMethodCode;
    }

    public void setShippingMethodCode(String shippingMethodCode) {
        this.shippingMethodCode = shippingMethodCode;
    }

    public BigDecimal getShipFromOrgId() {
        return shipFromOrgId;
    }

    public void setShipFromOrgId(BigDecimal shipFromOrgId) {
        this.shipFromOrgId = shipFromOrgId;
    }

    public BigDecimal getShipToOrgId() {
        return shipToOrgId;
    }

    public void setShipToOrgId(BigDecimal shipToOrgId) {
        this.shipToOrgId = shipToOrgId;
    }

    public BigDecimal getSoldToOrgId() {
        return soldToOrgId;
    }

    public void setSoldToOrgId(BigDecimal soldToOrgId) {
        this.soldToOrgId = soldToOrgId;
    }

    public BigDecimal getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(BigDecimal sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getSubinventory() {
        return subinventory;
    }

    public void setSubinventory(String subinventory) {
        this.subinventory = subinventory;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public Date getTaxDate() {
        return taxDate;
    }

    public void setTaxDate(Date taxDate) {
        this.taxDate = taxDate;
    }

    public BigDecimal getTaxValue() {
        return taxValue;
    }

    public void setTaxValue(BigDecimal taxValue) {
        this.taxValue = taxValue;
    }

    public BigDecimal getUnitListPrice() {
        return unitListPrice;
    }

    public void setUnitListPrice(BigDecimal unitListPrice) {
        this.unitListPrice = unitListPrice;
    }

    public BigDecimal getUnitListPricePerPqty() {
        return unitListPricePerPqty;
    }

    public void setUnitListPricePerPqty(BigDecimal unitListPricePerPqty) {
        this.unitListPricePerPqty = unitListPricePerPqty;
    }

    public BigDecimal getUnitSellingPrice() {
        return unitSellingPrice;
    }

    public void setUnitSellingPrice(BigDecimal unitSellingPrice) {
        this.unitSellingPrice = unitSellingPrice;
    }

    public BigDecimal getUnitSellingPricePerPqty() {
        return unitSellingPricePerPqty;
    }

    public void setUnitSellingPricePerPqty(BigDecimal unitSellingPricePerPqty) {
        this.unitSellingPricePerPqty = unitSellingPricePerPqty;
    }

    public DoOrderHeaders getDoOrderHeaders1() {
        return doOrderHeaders1;
    }

    public void setDoOrderHeaders1(DoOrderHeaders doOrderHeaders1) {
        this.doOrderHeaders1 = doOrderHeaders1;
    }

    public List<DoOrderPriceAdjs> getDoOrderPriceAdjsList1() {
        return doOrderPriceAdjsList1;
    }

    public void setDoOrderPriceAdjsList1(List<DoOrderPriceAdjs> doOrderPriceAdjsList1) {
        this.doOrderPriceAdjsList1 = doOrderPriceAdjsList1;
    }

    public DoOrderPriceAdjs addDoOrderPriceAdjs(DoOrderPriceAdjs doOrderPriceAdjs) {
        getDoOrderPriceAdjsList1().add(doOrderPriceAdjs);
        doOrderPriceAdjs.setDoOrderLines(this);
        return doOrderPriceAdjs;
    }

    public DoOrderPriceAdjs removeDoOrderPriceAdjs(DoOrderPriceAdjs doOrderPriceAdjs) {
        getDoOrderPriceAdjsList1().remove(doOrderPriceAdjs);
        doOrderPriceAdjs.setDoOrderLines(null);
        return doOrderPriceAdjs;
    }
}
