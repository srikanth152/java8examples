/******************************************************************
 * (c) Disney. All rights reserved.
 ******************************************************************/
package com.lambdas;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by bhojs001 on 1/6/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class XBMSResponseDto {

    private String state;
    private String options; // Uri to retrieve xband options details
    private String publicId; // also used as long_range_tag
    private String productId;
    private String xbandOwnerId;
    private String secondaryState;
    private String guestId;

    /**
     *
     * Optional. Not present if a link it later retail band that was linked on MDX else xid (SF OV),
     * transactional-guest-id (DREAMS), admission-link-id (ATS)
     */
    private String guestIdType;

    private String externalNumber; // visual id
    private String secureId;
    private String shortRangeTag; // also known as manufacturer_id
    private String printedName;

//    private Instant createDate;
    private String procurementReason;
    private String xbandId;
    private String xandRequest;  // Uri to retrieve xband Request details

//    @JsonFormat(pattern = DateConstants.JSON_DATE_FORMAT_PATTERN, timezone = DateConstants.JSON_DATE_FORMAT_TIMEZONE)
//    private Instant assignmentDateTime;
    private String history; // Uri to retrieve xband-history details
    private String self;   // Uri to retrieve xband details
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
	/*public Instant getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Instant createDate) {
		this.createDate = createDate;
	}*/
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
	/*public Instant getAssignmentDateTime() {
		return assignmentDateTime;
	}
	public void setAssignmentDateTime(Instant assignmentDateTime) {
		this.assignmentDateTime = assignmentDateTime;
	}*/
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

}
