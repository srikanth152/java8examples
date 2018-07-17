package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(5);
        l.add(25);
        l.add(30);
        
        System.out.println(Collections.max(l));
        
        Student s = new Student(10, "a");
        Student s1 = new Student(20, "a");
        
        List<Student> l2 = new ArrayList<>();
        l2.add(s);
        l2.add(s1);
        System.out.println(Collections.max(l2));
    }

}
