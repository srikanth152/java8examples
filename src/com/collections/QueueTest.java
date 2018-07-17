package com.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class QueueTest {

    public static void main(String[] args) {
        Queue<String> q = new PriorityQueue<>(); //initial capacity 11
        List<String> l = new ArrayList<String>(); // initial capacity 10
        Set<String> s = new HashSet<>();  // initial capacity 16
        Deque<String> d = new ArrayDeque<>(); // initial capacity 16
 
        q.add("hello");
        q.add("hello");// queue will not take the null values
        q.element();
        String array[] = new String[10];
        List<String> ll = Arrays.asList(array);
        ll.set(1, "hai");
        List<String> l2 = Collections.unmodifiableList(ll);
        l2.set(3, "world");
        l2.set(4, null);
    }

}
