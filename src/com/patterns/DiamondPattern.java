package com.patterns;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DiamondPattern {
	
    int j = 0;
    int x , y = 0;
    public static void main(String[] args) throws ArithmeticException{
        DiamondPattern d = new DiamondPattern();
        
        int i = 110;
        byte b = (byte)i;
        System.out.println(b);
        String s ="hai hello";
        String ss[] = s.split(" ");
        System.out.println(ss.length);
        Map<Integer,String> m = new HashMap<>();
        m.put(1, "one");
        m.put(2, "two");
        m.put(3, "three");
        
        Set<Integer> set = m.keySet();
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(m.get(it.next()));
        }
    }
}
