package com.lambdas;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class XbmsBandResponseDto {

    private String state;
    private String options; 
    private String publicId; 
    private String productId;
    private String xbandOwnerId;
    private String secondaryState;

    /**
     * Optional. Not present for a retail band that was linked on MDX 
     */
    private String guestId;
    private String guestIdType;

    private String externalNumber;
    private String secureId;
    private String shortRangeTag; 
    private String printedName;

    private Instant createDate;
    private String procurementReason;
    private String xbandId;
    private String xandRequest;

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getOptions() {
        return options;
    }
    public void setOptions(String options) {
        this.options = options;
    }
    public String getPublicId() {
        return publicId;
    }
    public void setPublicId(String publicId) {
        this.publicId = publicId;
    }
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String getXbandOwnerId() {
        return xbandOwnerId;
    }
    public void setXbandOwnerId(String xbandOwnerId) {
        this.xbandOwnerId = xbandOwnerId;
    }
    public String getSecondaryState() {
        return secondaryState;
    }
    public void setSecondaryState(String secondaryState) {
        this.secondaryState = secondaryState;
    }
    public String getGuestId() {
        return guestId;
    }
    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }
    public String getGuestIdType() {
        return guestIdType;
    }
    public void setGuestIdType(String guestIdType) {
        this.guestIdType = guestIdType;
    }
    public String getExternalNumber() {
        return externalNumber;
    }
    public void setExternalNumber(String externalNumber) {
        this.externalNumber = externalNumber;
    }
    public String getSecureId() {
        return secureId;
    }
    public void setSecureId(String secureId) {
        this.secureId = secureId;
    }
    public String getShortRangeTag() {
        return shortRangeTag;
    }
    public void setShortRangeTag(String shortRangeTag) {
        this.shortRangeTag = shortRangeTag;
    }
    public String getPrintedName() {
        return printedName;
    }
    public void setPrintedName(String printedName) {
        this.printedName = printedName;
    }
    public Instant getCreateDate() {
        return createDate;
    }
    public void setCreateDate(Instant createDate) {
        this.createDate = createDate;
    }
    public String getProcurementReason() {
        return procurementReason;
    }
    public void setProcurementReason(String procurementReason) {
        this.procurementReason = procurementReason;
    }
    public String getXbandId() {
        return xbandId;
    }
    public void setXbandId(String xbandId) {
        this.xbandId = xbandId;
    }
    public String getXandRequest() {
        return xandRequest;
    }
    public void setXandRequest(String xandRequest) {
        this.xandRequest = xandRequest;
    }
    public Instant getAssignmentDateTime() {
        return assignmentDateTime;
    }
    public void setAssignmentDateTime(Instant assignmentDateTime) {
        this.assignmentDateTime = assignmentDateTime;
    }
    public String getHistory() {
        return history;
    }
    public void setHistory(String history) {
        this.history = history;
    }
    public String getSelf() {
        return self;
    }
    public void setSelf(String self) {
        this.self = self;
    }
    private Instant assignmentDateTime;
    private String history;
    private String self; 
}
