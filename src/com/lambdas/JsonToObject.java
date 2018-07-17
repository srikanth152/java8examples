package com.lambdas;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lambdas.AssociateXbmsLinkDto.ExternalGuestReferences;
import com.lambdas.AssociateXbmsLinkDto.XbandGuest;

public class JsonToObject {
	
	public static void main(String[] args) {
		
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = "{\"state\": \"ACTIVE\","
				+ "\"publicId\": 1234567,"
				+ "\"productId\": \"CH14700\","
				+ "\"options\": \"/xband-options/904AE359-1234-5678-9012-D50799EBF42E\","
				+ "\"xbandOwnerId\": \"E25D3D07-1234-5678-9012-946A68BB3D7E\","
				+ "\"secondaryState\": \"ORIGINAL\","
				+ "\"guestId\": \"09300525081123456\","
				+ "\"guestIdType\": \"admission-link-id\","
				+ "\"externalNumber\": \"12345D123456\","
				+ "\"secureId\": 1234567890,"
				+ "\"shortRangeTag\": 987654321,"
				+ "\"createDate\": \"2017-03-04T21:08:50Z\","
				+ "\"procurementReason\": \"BULK\","
				+ "\"xbandId\": \"904AE359-1234-1234-1234-D50799EBF42E\","
				+ "\"assignmentDateTime\": \"2017-09-04T11:49:13Z\","
				+ "\"history\": \"/xband-history/904AE359-1234-1234-1234-D50799EBF42E\","
				+ "\"self\": \"/xband/904AE359-1234-1234-1234-D50799EBF42E\"}";
		try {
		//JSON from file to Object
		XBMSResponseDto obj = mapper.readValue(new File("D:\\Users\\srikband\\Desktop\\xbms-resp.json"), XBMSResponseDto.class);
		
		//JSON from URL to Object
//		Staff obj = mapper.readValue(new URL("http://mkyong.com/api/staff.json"), Staff.class);
		AssociateXbmsLinkDto obje = populateAssociateBandToGuestDto();
		String json = mapper.writeValueAsString(obje);
		//JSON from String to Object
//			XBMSResponseDto obj = mapper.readValue(jsonInString, XBMSResponseDto.class);
			System.out.println(json);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static AssociateXbmsLinkDto populateAssociateBandToGuestDto() {
        ExternalGuestReferences extGuestRef = new ExternalGuestReferences();
        extGuestRef.setGuestIdType("admission-link_id");
        extGuestRef.setGuestIdValue("123");

        XbandGuest bandGuest = new XbandGuest();
        		bandGuest.setXbandOwnerId("123-link-id");
        		bandGuest.setExternalGuestReference(extGuestRef);

        		List<XbandGuest> xbandList = new ArrayList<>();
        xbandList.add(bandGuest);
        AssociateXbmsLinkDto associateXbandToGuest = new AssociateXbmsLinkDto();
        associateXbandToGuest.setXbandguest(xbandList);
        return associateXbandToGuest;
    }
}
