package com.practice;

public class C extends B{

    public void m(){
        System.out.println("From c");
    }
    
    public static void main(String[] args) {
        A a = new C();
        
        B b = (B) a;
        b.m();
    }
}
