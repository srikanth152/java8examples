package com.collections;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetExample {
    
    enum days{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Set<days> set = EnumSet.allOf(days.class);
        for(days d : set) {
            System.out.println(d);
        }
        
        Set<days> ds = EnumSet.noneOf(days.class);
        System.out.println(ds);
    }

}
