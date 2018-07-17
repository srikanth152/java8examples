package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>();
        set.add(new Student(10,"srikanth"));
        set.add(new Student(5,"Ajay"));
        
        Iterator<Student> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
