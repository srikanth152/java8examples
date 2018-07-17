package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("h");
        l.add("e");
        l.add("l");
        l.add("l");
        l.add("o");
       ListIterator<String> i = l.listIterator();
       l.stream().toArray(String[] :: new);
        List<String> k = new ArrayList<>();
        k.add("h");
        k.add("e");
        k.add("l");
        k.add("l");
        k.add("o");
        
        int x = 1;
        for(int j=0; j<3; j++){
            x += 5 * j;
        }
        System.out.println(x);
        
    }

}
