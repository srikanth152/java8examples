package com.generics;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {

    public static void main(String[] args) {
        List list = new ArrayList(); 
        list.add("shiva");
        list.add("ganesha");
        list.add(new Integer(10));

        list.toArray();
        String s = (String) list.get(0);
    }

}
