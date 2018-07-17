package com.practice;

public class AbsChild extends AbsParent{

	public static void main(String[] args) {
		AbsChild a = new AbsChild();
		a.m();
		
		AbsParent b = new AbsParent() {
			
			@Override
			public void m() {
				System.out.println(" ########### ");
			}
		};
		
		b.m();
	}

	@Override
	public void m() {
		System.out.println(" from AbsChild ");
	}

}
