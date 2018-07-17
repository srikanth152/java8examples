package com.threads;

public class PrintNumber {

	private static int i = 0;
	
	public void print(){
		System.out.println(Thread.currentThread().getName()+" "+i);
		i++;
	}
}
