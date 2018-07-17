package com.lambdas;

import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class ParseJson {

    public static void main(String[] args) {
//        XbmsBandResponseDto bandDetailsDto = getBandDetailsFromFile("band-details-from-xbms.json");
        String res = "{\"assignmentDateTime\": \"2017-09-04T11:49:13Z\"}";
        ObjectMapper mapper = new ObjectMapper();
//        mapper.registerModule(new JSR310Module());
        mapper.registerModule(new JavaTimeModule());
        try {
            XbmsBandResponseDto obj = mapper.readValue(res, XbmsBandResponseDto.class);
            System.out.println(obj);
        } catch (JsonParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (JsonMappingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    /**
     * Convenience method to load dto from file
     */
    private static XbmsBandResponseDto getBandDetailsFromFile(String fileName) {
        XbmsBandResponseDto bandDetails = null;
        InputStream is = TypeReference.class.getResourceAsStream("/json/state-city.json");
        try (InputStream inputStream = ParseJson.class.getResourceAsStream(fileName)) {
            ObjectMapper mapper = new ObjectMapper();
            mapper.disable(SerializationFeature.WRITE_DATES_WITH_ZONE_ID);
            bandDetails = mapper.readValue(inputStream, XbmsBandResponseDto.class);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bandDetails;
    }
}
