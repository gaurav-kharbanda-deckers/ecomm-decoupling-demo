package com.deckers.integrations.ecommdecouplingdemo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({ @NamedQuery(name = "DoOrderHeaders.findAll", query = "select o from DoOrderHeaders o") })
@Table(name = "DO_ORDER_HEADERS", schema="DO_OM")
public class DoOrderHeaders implements Serializable {
    private static final long serialVersionUID = 7648547084912876557L;
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
    @Column(name = "BOOKED_FLAG", nullable = false, length = 1)
    private String bookedFlag;
    @Column(name = "CANCELLED_FLAG", nullable = false, length = 1)
    private String cancelledFlag;
    @Column(name = "CHANGE_REASON", length = 30)
    private String changeReason;
    @Column(name = "CLOSED_FLAG", nullable = false, length = 1)
    private String closedFlag;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CONVERSION_RATE_DATE")
    private Date conversionRateDate;
    @Column(name = "CONVERSION_TYPE_CODE", length = 30)
    private String conversionTypeCode;
    @Column(name = "CREATED_BY", nullable = false)
    private BigDecimal createdBy;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATION_DATE", nullable = false)
    private Date creationDate;
    @Column(name = "CUSTOMER_ID", nullable = false)
    private BigDecimal customerId;
    @Column(name = "CUSTOMER_PO_NUMBER", length = 50)
    private String customerPoNumber;
    @Column(name = "DELIVER_TO_ORG_ID")
    private BigDecimal deliverToOrgId;
    @Column(name = "DEMAND_CLASS_CODE", length = 30)
    private String demandClassCode;
    @Column(name = "ERROR_FLAG", nullable = false, length = 1)
    private String errorFlag;
    @Column(name = "FOB_POINT_CODE", length = 30)
    private String fobPointCode;
    @Column(name = "FREIGHT_TERMS_CODE", length = 30)
    private String freightTermsCode;
    @Column(name = "GLOBAL_ATTRIBUTE18", length = 240)
    private String globalAttribute18;
    @Column(name = "GLOBAL_ATTRIBUTE19", length = 240)
    private String globalAttribute19;
    @Column(name = "HEADER_ID")
    private BigDecimal headerId;
    @Column(name = "INVOICE_TO_ORG_ID", nullable = false)
    private BigDecimal invoiceToOrgId;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_UPDATE_DATE", nullable = false)
    private Date lastUpdateDate;
    @Column(name = "LAST_UPDATED_BY", nullable = false)
    private BigDecimal lastUpdatedBy;
    @Column(name = "OPERATION_CODE", nullable = false, length = 30)
    private String operationCode;
    @Column(name = "ORDER_CATEGORY", nullable = false, length = 30)
    private String orderCategory;
    @Column(name = "ORDER_NUMBER")
    private BigDecimal orderNumber;
    @Column(name = "ORDER_SOURCE_ID", nullable = false)
    private BigDecimal orderSourceId;
    @Column(name = "ORDER_TYPE_ID", nullable = false)
    private BigDecimal orderTypeId;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ORDERED_DATE", nullable = false)
    private Date orderedDate;
    @Column(name = "ORG_ID", nullable = false)
    private BigDecimal orgId;
    @Id
    @Column(name = "ORIG_SYS_DOCUMENT_REF", nullable = false, length = 50)
    private String origSysDocumentRef;
    @Column(name = "PACKING_INSTRUCTIONS", length = 2000)
    private String packingInstructions;
    @Column(name = "PAYMENT_TERM_ID", nullable = false)
    private BigDecimal paymentTermId;
    @Column(name = "PRICE_LIST_ID", nullable = false)
    private BigDecimal priceListId;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REQUEST_DATE", nullable = false)
    private Date requestDate;
    @Column(name = "REQUEST_ID")
    private BigDecimal requestId;
    @Column(name = "RETURN_REASON_CODE", length = 30)
    private String returnReasonCode;
    @Column(name = "SALES_CHANNEL_CODE", length = 30)
    private String salesChannelCode;
    @Column(name = "SALESREP_ID", nullable = false)
    private BigDecimal salesrepId;
    @Column(name = "SHIP_FROM_ORG_ID")
    private BigDecimal shipFromOrgId;
    @Column(name = "SHIP_TO_ORG_ID", nullable = false)
    private BigDecimal shipToOrgId;
    @Column(name = "SHIPPING_INSTRUCTIONS", length = 2000)
    private String shippingInstructions;
    @Column(name = "SHIPPING_METHOD_CODE", length = 30)
    private String shippingMethodCode;
    @Column(name = "SOLD_FROM_ORG_ID", nullable = false)
    private BigDecimal soldFromOrgId;
    @Column(name = "SOLD_TO_ORG_ID", nullable = false)
    private BigDecimal soldToOrgId;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "SUBMISSION_DATE")
    private Date submissionDate;
    @Column(name = "TRANSACTIONAL_CURR_CODE", length = 15)
    private String transactionalCurrCode;
    @OneToMany(mappedBy = "doOrderHeaders", cascade = { CascadeType.ALL, CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.REMOVE })
    private List<DoOrderPriceAdjs> doOrderPriceAdjsList;
    @OneToMany(mappedBy = "doOrderHeaders1", cascade = { CascadeType.ALL, CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.REMOVE })
    private List<DoOrderLines> doOrderLinesList;

    public DoOrderHeaders() {
    }

    public DoOrderHeaders(String attribute1, String attribute10, String attribute11, String attribute12,
                          String attribute13, String attribute14, String attribute15, String attribute2,
                          String attribute3, String attribute4, String attribute5, String attribute6, String attribute7,
                          String attribute8, String attribute9, String bookedFlag, String cancelledFlag,
                          String changeReason, String closedFlag, Date conversionRateDate, String conversionTypeCode,
                          BigDecimal createdBy, Date creationDate, BigDecimal customerId, String customerPoNumber,
                          BigDecimal deliverToOrgId, String demandClassCode, String errorFlag, String fobPointCode,
                          String freightTermsCode, String globalAttribute18, String globalAttribute19,
                          BigDecimal headerId, BigDecimal invoiceToOrgId, Date lastUpdateDate, BigDecimal lastUpdatedBy,
                          String operationCode, String orderCategory, BigDecimal orderNumber, BigDecimal orderSourceId,
                          BigDecimal orderTypeId, Date orderedDate, BigDecimal orgId, String origSysDocumentRef,
                          String packingInstructions, BigDecimal paymentTermId, BigDecimal priceListId,
                          Date requestDate, BigDecimal requestId, String returnReasonCode, String salesChannelCode,
                          BigDecimal salesrepId, BigDecimal shipFromOrgId, BigDecimal shipToOrgId,
                          String shippingInstructions, String shippingMethodCode, BigDecimal soldFromOrgId,
                          BigDecimal soldToOrgId, Date submissionDate, String transactionalCurrCode) {
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
        this.bookedFlag = bookedFlag;
        this.cancelledFlag = cancelledFlag;
        this.changeReason = changeReason;
        this.closedFlag = closedFlag;
        this.conversionRateDate = conversionRateDate;
        this.conversionTypeCode = conversionTypeCode;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.customerId = customerId;
        this.customerPoNumber = customerPoNumber;
        this.deliverToOrgId = deliverToOrgId;
        this.demandClassCode = demandClassCode;
        this.errorFlag = errorFlag;
        this.fobPointCode = fobPointCode;
        this.freightTermsCode = freightTermsCode;
        this.globalAttribute18 = globalAttribute18;
        this.globalAttribute19 = globalAttribute19;
        this.headerId = headerId;
        this.invoiceToOrgId = invoiceToOrgId;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.operationCode = operationCode;
        this.orderCategory = orderCategory;
        this.orderNumber = orderNumber;
        this.orderSourceId = orderSourceId;
        this.orderTypeId = orderTypeId;
        this.orderedDate = orderedDate;
        this.orgId = orgId;
        this.origSysDocumentRef = origSysDocumentRef;
        this.packingInstructions = packingInstructions;
        this.paymentTermId = paymentTermId;
        this.priceListId = priceListId;
        this.requestDate = requestDate;
        this.requestId = requestId;
        this.returnReasonCode = returnReasonCode;
        this.salesChannelCode = salesChannelCode;
        this.salesrepId = salesrepId;
        this.shipFromOrgId = shipFromOrgId;
        this.shipToOrgId = shipToOrgId;
        this.shippingInstructions = shippingInstructions;
        this.shippingMethodCode = shippingMethodCode;
        this.soldFromOrgId = soldFromOrgId;
        this.soldToOrgId = soldToOrgId;
        this.submissionDate = submissionDate;
        this.transactionalCurrCode = transactionalCurrCode;
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

    public String getBookedFlag() {
        return bookedFlag;
    }

    public void setBookedFlag(String bookedFlag) {
        this.bookedFlag = bookedFlag;
    }

    public String getCancelledFlag() {
        return cancelledFlag;
    }

    public void setCancelledFlag(String cancelledFlag) {
        this.cancelledFlag = cancelledFlag;
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

    public Date getConversionRateDate() {
        return conversionRateDate;
    }

    public void setConversionRateDate(Date conversionRateDate) {
        this.conversionRateDate = conversionRateDate;
    }

    public String getConversionTypeCode() {
        return conversionTypeCode;
    }

    public void setConversionTypeCode(String conversionTypeCode) {
        this.conversionTypeCode = conversionTypeCode;
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

    public BigDecimal getCustomerId() {
        return customerId;
    }

    public void setCustomerId(BigDecimal customerId) {
        this.customerId = customerId;
    }

    public String getCustomerPoNumber() {
        return customerPoNumber;
    }

    public void setCustomerPoNumber(String customerPoNumber) {
        this.customerPoNumber = customerPoNumber;
    }

    public BigDecimal getDeliverToOrgId() {
        return deliverToOrgId;
    }

    public void setDeliverToOrgId(BigDecimal deliverToOrgId) {
        this.deliverToOrgId = deliverToOrgId;
    }

    public String getDemandClassCode() {
        return demandClassCode;
    }

    public void setDemandClassCode(String demandClassCode) {
        this.demandClassCode = demandClassCode;
    }

    public String getErrorFlag() {
        return errorFlag;
    }

    public void setErrorFlag(String errorFlag) {
        this.errorFlag = errorFlag;
    }

    public String getFobPointCode() {
        return fobPointCode;
    }

    public void setFobPointCode(String fobPointCode) {
        this.fobPointCode = fobPointCode;
    }

    public String getFreightTermsCode() {
        return freightTermsCode;
    }

    public void setFreightTermsCode(String freightTermsCode) {
        this.freightTermsCode = freightTermsCode;
    }

    public String getGlobalAttribute18() {
        return globalAttribute18;
    }

    public void setGlobalAttribute18(String globalAttribute18) {
        this.globalAttribute18 = globalAttribute18;
    }

    public String getGlobalAttribute19() {
        return globalAttribute19;
    }

    public void setGlobalAttribute19(String globalAttribute19) {
        this.globalAttribute19 = globalAttribute19;
    }

    public BigDecimal getHeaderId() {
        return headerId;
    }

    public void setHeaderId(BigDecimal headerId) {
        this.headerId = headerId;
    }

    public BigDecimal getInvoiceToOrgId() {
        return invoiceToOrgId;
    }

    public void setInvoiceToOrgId(BigDecimal invoiceToOrgId) {
        this.invoiceToOrgId = invoiceToOrgId;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public BigDecimal getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(BigDecimal lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

    public String getOrderCategory() {
        return orderCategory;
    }

    public void setOrderCategory(String orderCategory) {
        this.orderCategory = orderCategory;
    }

    public BigDecimal getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(BigDecimal orderNumber) {
        this.orderNumber = orderNumber;
    }

    public BigDecimal getOrderSourceId() {
        return orderSourceId;
    }

    public void setOrderSourceId(BigDecimal orderSourceId) {
        this.orderSourceId = orderSourceId;
    }

    public BigDecimal getOrderTypeId() {
        return orderTypeId;
    }

    public void setOrderTypeId(BigDecimal orderTypeId) {
        this.orderTypeId = orderTypeId;
    }

    public Date getOrderedDate() {
        return orderedDate;
    }

    public void setOrderedDate(Date orderedDate) {
        this.orderedDate = orderedDate;
    }

    public BigDecimal getOrgId() {
        return orgId;
    }

    public void setOrgId(BigDecimal orgId) {
        this.orgId = orgId;
    }

    public String getOrigSysDocumentRef() {
        return origSysDocumentRef;
    }

    public void setOrigSysDocumentRef(String origSysDocumentRef) {
        this.origSysDocumentRef = origSysDocumentRef;
    }

    public String getPackingInstructions() {
        return packingInstructions;
    }

    public void setPackingInstructions(String packingInstructions) {
        this.packingInstructions = packingInstructions;
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

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public BigDecimal getRequestId() {
        return requestId;
    }

    public void setRequestId(BigDecimal requestId) {
        this.requestId = requestId;
    }

    public String getReturnReasonCode() {
        return returnReasonCode;
    }

    public void setReturnReasonCode(String returnReasonCode) {
        this.returnReasonCode = returnReasonCode;
    }

    public String getSalesChannelCode() {
        return salesChannelCode;
    }

    public void setSalesChannelCode(String salesChannelCode) {
        this.salesChannelCode = salesChannelCode;
    }

    public BigDecimal getSalesrepId() {
        return salesrepId;
    }

    public void setSalesrepId(BigDecimal salesrepId) {
        this.salesrepId = salesrepId;
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

    public BigDecimal getSoldFromOrgId() {
        return soldFromOrgId;
    }

    public void setSoldFromOrgId(BigDecimal soldFromOrgId) {
        this.soldFromOrgId = soldFromOrgId;
    }

    public BigDecimal getSoldToOrgId() {
        return soldToOrgId;
    }

    public void setSoldToOrgId(BigDecimal soldToOrgId) {
        this.soldToOrgId = soldToOrgId;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getTransactionalCurrCode() {
        return transactionalCurrCode;
    }

    public void setTransactionalCurrCode(String transactionalCurrCode) {
        this.transactionalCurrCode = transactionalCurrCode;
    }

    public List<DoOrderPriceAdjs> getDoOrderPriceAdjsList() {
        return doOrderPriceAdjsList;
    }

    public void setDoOrderPriceAdjsList(List<DoOrderPriceAdjs> doOrderPriceAdjsList) {
        this.doOrderPriceAdjsList = doOrderPriceAdjsList;
    }

    public DoOrderPriceAdjs addDoOrderPriceAdjs(DoOrderPriceAdjs doOrderPriceAdjs) {
        getDoOrderPriceAdjsList().add(doOrderPriceAdjs);
        doOrderPriceAdjs.setDoOrderHeaders(this);
        return doOrderPriceAdjs;
    }

    public DoOrderPriceAdjs removeDoOrderPriceAdjs(DoOrderPriceAdjs doOrderPriceAdjs) {
        getDoOrderPriceAdjsList().remove(doOrderPriceAdjs);
        doOrderPriceAdjs.setDoOrderHeaders(null);
        return doOrderPriceAdjs;
    }

    public List<DoOrderLines> getDoOrderLinesList() {
        return doOrderLinesList;
    }

    public void setDoOrderLinesList(List<DoOrderLines> doOrderLinesList) {
        this.doOrderLinesList = doOrderLinesList;
    }

    public DoOrderLines addDoOrderLines(DoOrderLines doOrderLines) {
        getDoOrderLinesList().add(doOrderLines);
        doOrderLines.setDoOrderHeaders1(this);
        return doOrderLines;
    }

    public DoOrderLines removeDoOrderLines(DoOrderLines doOrderLines) {
        getDoOrderLinesList().remove(doOrderLines);
        doOrderLines.setDoOrderHeaders1(null);
        return doOrderLines;
    }
}
