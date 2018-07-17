package com.collections;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class EnumMapExample {
    
    enum days{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        EnumMap<days, String> em = new EnumMap<>(days.class);
        em.put(days.SUNDAY, "0");
        em.put(days.MONDAY, "1");
        em.put(days.TUESDAY, "2");
        
        for(Map.Entry ent : em.entrySet()){
            System.out.println(ent.getKey()+" "+ent.getValue());
        }
        
        HashMap<days, String> hm = new HashMap<>();
        hm.put(days.SUNDAY, "0");
        for(Map.Entry ent : hm.entrySet()){
            System.out.println(ent.getKey()+" "+ent.getValue());
        }
    }

}
