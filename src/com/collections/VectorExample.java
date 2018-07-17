package com.collections;

import java.util.ArrayList;
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("hello");
        v.add("hello");
        v.add("hello");
        v.add("hello");
        v.add("hello");
        v.add("hello");
        v.add("hello");
        v.add("hello");
        v.add("hello");
        v.add("hello");
        v.add("hello");
        
        ArrayList<String> l = new ArrayList<>();
        l.add("hello");
        l.add("hello");
        l.add("hello");
        l.add("hello");
        l.add("hello");
        l.add("hello");
        l.add("hello");
        l.add("hello");
        l.add("hello");
        l.add("hello");
        /*l.add("hello");
        l.add("hello");*/
        System.out.println(l.size());
    }

}
