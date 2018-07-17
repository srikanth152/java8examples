package com.inheritence;

public class A2 extends A{

	public void GetMethod(){
		int x = 8;
		System.out.println(++x * 3+ " "+(--x));
	}
	
	public static void main(String[] args) {
		A2 a = new A2();
		a.GetMethod();
	}
}
