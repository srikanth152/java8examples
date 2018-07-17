package com.practice;

import java.util.ArrayList;
import java.util.List;

public class NumOrString {

    public static void main(String[] args) {
        String s = "a1b2c3";
        List<Integer> l = new ArrayList<Integer>();
        List<String> l1 = new ArrayList<String>();
        char []a = s.toCharArray();
        char []b = {'A','b'};
        for(int i=0;i<b.length;i++){
            System.out.println((int)b[i]);
        }
        /*for(int i=0;i<a.length;i++){
            if(Character.isDigit(a[i])){
                l.add((int)a[i]);
            }else{
                l1.add(String.valueOf(a[i]));
            }
        }
        System.out.println(l+" "+l1);*/
    }
}
