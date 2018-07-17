package com.practice;

public class B extends A{
    
    public void m(){
    	//super.m();
        System.out.println("from B");
    }
    
    public void m2(){
        System.out.println("from m2 of B");
    }
    
    public static void main(String[] args) {
        A a = new B();
//        a.m2();
        
        A b = (A) a;
        b.m();
    }
}
