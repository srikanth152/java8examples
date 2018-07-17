package com.inheritence;

public class Test {

	public void doIt(int i, Men m){
		i = 5;
		m.number = 8;
	}
	public static void main(String[] args) {
		int x = 0;
		Men p = new Men();
		new Test().doIt(x, p);
		System.out.println(x + " "+p.number);
	}

}
