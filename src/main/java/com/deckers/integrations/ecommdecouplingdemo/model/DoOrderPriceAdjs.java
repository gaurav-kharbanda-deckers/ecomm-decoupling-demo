package com.deckers.integrations.ecommdecouplingdemo.model;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({ @NamedQuery(name = "DoOrderPriceAdjs.findAll", query = "select o from DoOrderPriceAdjs o") })
@Table(name = "DO_ORDER_PRICE_ADJS", schema="DO_OM")
public class DoOrderPriceAdjs implements Serializable {
    private static final long serialVersionUID = -3048008520050422820L;
    @Column(name = "ADJUSTED_AMOUNT", nullable = false)
    private BigDecimal adjustedAmount;
    @Column(name = "ADJUSTED_AMOUNT_PER_PQTY", nullable = false)
    private BigDecimal adjustedAmountPerPqty;
    @Column(name = "APPLIED_FLAG", nullable = false, length = 1)
    private String appliedFlag;
    @Column(name = "ARITHMETIC_OPERATOR", nullable = false, length = 30)
    private String arithmeticOperator;
    @Column(length = 240)
    private String attribute1;
    @Column(length = 240)
    private String attribute2;
    @Column(length = 240)
    private String attribute3;
    @Column(length = 240)
    private String attribute4;
    @Column(length = 240)
    private String attribute5;
    @Column(name = "AUTOMATIC_FLAG", nullable = false, length = 1)
    private String automaticFlag;
    @Column(length = 30)
    private String context;
    @Column(name = "CREATED_BY", nullable = false)
    private BigDecimal createdBy;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATION_DATE", nullable = false)
    private Date creationDate;
    @Column(name = "DISCOUNT_ID")
    private BigDecimal discountId;
    @Column(name = "DISCOUNT_LINE_ID")
    private BigDecimal discountLineId;
    @Column(name = "LAST_UPDATED_BY", nullable = false)
    private BigDecimal lastUpdatedBy;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_UPDATE_DATE", nullable = false)
    private Date lastUpdateDate;
    @Column(name = "LIST_HEADER_ID", nullable = false)
    private BigDecimal listHeaderId;
    @Column(name = "LIST_LINE_ID", nullable = false)
    private BigDecimal listLineId;
    @Column(name = "LIST_LINE_TYPE_CODE", nullable = false, length = 30)
    private String listLineTypeCode;
    @Column(nullable = false)
    private BigDecimal operand;
    @Column(name = "OPERAND_PER_PQTY", nullable = false)
    private BigDecimal operandPerPqty;
    @Column(name = "OPERATION_CODE", nullable = false, length = 30)
    private String operationCode;
    @Column(name = "ORDER_SOURCE_ID", nullable = false)
    private BigDecimal orderSourceId;
    @Column(name = "ORG_ID")
    private BigDecimal orgId;
    @Id
    @Column(name = "ORIG_SYS_DISCOUNT_REF", nullable = false, length = 50)
    private String origSysDiscountRef;
    @Column(nullable = false)
    private BigDecimal percent;
    @Column(name = "TAX_RATE_ID")
    private BigDecimal taxRateId;
    @ManyToOne
    @JoinColumn(name = "ORIG_SYS_DOCUMENT_REF")
    private DoOrderHeaders doOrderHeaders;
    @ManyToOne
    @JoinColumn(name = "ORIG_SYS_LINE_REF")
    private DoOrderLines doOrderLines;

    public DoOrderPriceAdjs() {
    }

    public DoOrderPriceAdjs(BigDecimal adjustedAmount, BigDecimal adjustedAmountPerPqty, String appliedFlag,
                            String arithmeticOperator, String attribute1, String attribute2, String attribute3,
                            String attribute4, String attribute5, String automaticFlag, String context,
                            BigDecimal createdBy, Date creationDate, BigDecimal discountId, BigDecimal discountLineId,
                            Date lastUpdateDate, BigDecimal lastUpdatedBy, BigDecimal listHeaderId,
                            BigDecimal listLineId, String listLineTypeCode, BigDecimal operand,
                            BigDecimal operandPerPqty, String operationCode, BigDecimal orderSourceId, BigDecimal orgId,
                            String origSysDiscountRef, DoOrderHeaders doOrderHeaders, DoOrderLines doOrderLines,
                            BigDecimal percent, BigDecimal taxRateId) {
        this.adjustedAmount = adjustedAmount;
        this.adjustedAmountPerPqty = adjustedAmountPerPqty;
        this.appliedFlag = appliedFlag;
        this.arithmeticOperator = arithmeticOperator;
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
        this.attribute3 = attribute3;
        this.attribute4 = attribute4;
        this.attribute5 = attribute5;
        this.automaticFlag = automaticFlag;
        this.context = context;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.discountId = discountId;
        this.discountLineId = discountLineId;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.listHeaderId = listHeaderId;
        this.listLineId = listLineId;
        this.listLineTypeCode = listLineTypeCode;
        this.operand = operand;
        this.operandPerPqty = operandPerPqty;
        this.operationCode = operationCode;
        this.orderSourceId = orderSourceId;
        this.orgId = orgId;
        this.origSysDiscountRef = origSysDiscountRef;
        this.doOrderHeaders = doOrderHeaders;
        this.doOrderLines = doOrderLines;
        this.percent = percent;
        this.taxRateId = taxRateId;
    }

    public BigDecimal getAdjustedAmount() {
        return adjustedAmount;
    }

    public void setAdjustedAmount(BigDecimal adjustedAmount) {
        this.adjustedAmount = adjustedAmount;
    }

    public BigDecimal getAdjustedAmountPerPqty() {
        return adjustedAmountPerPqty;
    }

    public void setAdjustedAmountPerPqty(BigDecimal adjustedAmountPerPqty) {
        this.adjustedAmountPerPqty = adjustedAmountPerPqty;
    }

    public String getAppliedFlag() {
        return appliedFlag;
    }

    public void setAppliedFlag(String appliedFlag) {
        this.appliedFlag = appliedFlag;
    }

    public String getArithmeticOperator() {
        return arithmeticOperator;
    }

    public void setArithmeticOperator(String arithmeticOperator) {
        this.arithmeticOperator = arithmeticOperator;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
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

    public String getAutomaticFlag() {
        return automaticFlag;
    }

    public void setAutomaticFlag(String automaticFlag) {
        this.automaticFlag = automaticFlag;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
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

    public BigDecimal getDiscountId() {
        return discountId;
    }

    public void setDiscountId(BigDecimal discountId) {
        this.discountId = discountId;
    }

    public BigDecimal getDiscountLineId() {
        return discountLineId;
    }

    public void setDiscountLineId(BigDecimal discountLineId) {
        this.discountLineId = discountLineId;
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

    public BigDecimal getListHeaderId() {
        return listHeaderId;
    }

    public void setListHeaderId(BigDecimal listHeaderId) {
        this.listHeaderId = listHeaderId;
    }

    public BigDecimal getListLineId() {
        return listLineId;
    }

    public void setListLineId(BigDecimal listLineId) {
        this.listLineId = listLineId;
    }

    public String getListLineTypeCode() {
        return listLineTypeCode;
    }

    public void setListLineTypeCode(String listLineTypeCode) {
        this.listLineTypeCode = listLineTypeCode;
    }

    public BigDecimal getOperand() {
        return operand;
    }

    public void setOperand(BigDecimal operand) {
        this.operand = operand;
    }

    public BigDecimal getOperandPerPqty() {
        return operandPerPqty;
    }

    public void setOperandPerPqty(BigDecimal operandPerPqty) {
        this.operandPerPqty = operandPerPqty;
    }

    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
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

    public String getOrigSysDiscountRef() {
        return origSysDiscountRef;
    }

    public void setOrigSysDiscountRef(String origSysDiscountRef) {
        this.origSysDiscountRef = origSysDiscountRef;
    }


    public BigDecimal getPercent() {
        return percent;
    }

    public void setPercent(BigDecimal percent) {
        this.percent = percent;
    }

    public BigDecimal getTaxRateId() {
        return taxRateId;
    }

    public void setTaxRateId(BigDecimal taxRateId) {
        this.taxRateId = taxRateId;
    }

    public DoOrderHeaders getDoOrderHeaders() {
        return doOrderHeaders;
    }

    public void setDoOrderHeaders(DoOrderHeaders doOrderHeaders) {
        this.doOrderHeaders = doOrderHeaders;
    }

    public DoOrderLines getDoOrderLines() {
        return doOrderLines;
    }

    public void setDoOrderLines(DoOrderLines doOrderLines) {
        this.doOrderLines = doOrderLines;
    }
}
