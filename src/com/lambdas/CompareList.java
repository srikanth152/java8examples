package com.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CompareList {

    public static void main(String[] args) {
        String db[] = new String[]{"abc","xyz"};
        List<String> dblist = Arrays.asList(db);
        
        String resp[] = new String[]{"abc","123"};
        List<String> resplist = Arrays.asList(resp);
        
        System.out.println(checkXbmsLinkid(dblist, resplist));
    }
    
    private static List<String> verifyXbmsLinkid(List<String> bandRequest, List<String> bandRequestResponseDto) {

        Set<String> xbmsLinkids = bandRequestResponseDto
            .stream()
            .collect(Collectors.toSet());

        List<String> bandReq = bandRequest.stream()
            .filter(b -> !xbmsLinkids.contains(b))
            .collect(Collectors.toList());
        return bandReq;
    }
    
    private static List<String> checkXbmsLinkid(List<String> bandRequest, List<String> bandRequestResponseDto) {

        Set<String> xbmsLinkids = bandRequest
            .stream()
            .collect(Collectors.toSet());

        List<String> bandReq = bandRequestResponseDto.stream()
            .filter(b -> !xbmsLinkids.contains(b))
            .collect(Collectors.toList());
        return bandReq;
    }

}
