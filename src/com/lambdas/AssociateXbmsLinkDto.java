/******************************************************************
 * (c) Disney. All rights reserved.
 ******************************************************************/
package com.lambdas;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by bhojs001 on 1/6/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AssociateXbmsLinkDto {
    @JsonProperty("xband-guests")
    private List<XbandGuest> xbandguest;
    
    public List<XbandGuest> getXbandguest() {
		return xbandguest;
	}

	public void setXbandguest(List<XbandGuest> xbandguest) {
		this.xbandguest = xbandguest;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
    public static class XbandGuest {
    
        @JsonProperty("xbms-link-id")
        private String xbandOwnerId;
        
        public String getXbandOwnerId() {
			return xbandOwnerId;
		}
		public void setXbandOwnerId(String xbandOwnerId) {
			this.xbandOwnerId = xbandOwnerId;
		}
		public ExternalGuestReferences getExternalGuestReference() {
			return externalGuestReference;
		}
		public void setExternalGuestReference(ExternalGuestReferences externalGuestReference) {
			this.externalGuestReference = externalGuestReference;
		}
		
		@JsonProperty("external-guest-references")
        private ExternalGuestReferences externalGuestReference;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ExternalGuestReferences {

        @JsonProperty("type")
        private String guestIdType;

        @JsonProperty("value")
        private String guestIdValue;

		public String getGuestIdType() {
			return guestIdType;
		}

		public void setGuestIdType(String guestIdType) {
			this.guestIdType = guestIdType;
		}

		public String getGuestIdValue() {
			return guestIdValue;
		}

		public void setGuestIdValue(String guestIdValue) {
			this.guestIdValue = guestIdValue;
		}
    }
}
