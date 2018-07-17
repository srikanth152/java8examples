package com.streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalInt;

public class AddingNumbers {
	
	final static List<Integer> list = new ArrayList<>();
	
	private static void sumIterator(List<Integer> list){
		
		Iterator<Integer> it = list.iterator();
		int sum = 0;
		while(it.hasNext()){
			int num = it.next();
			if(num > 10){
				sum = sum + num;
			}
		}
		System.out.println(sum);
	}
	
	private static void sumUsingStreams(List<Integer> list){
		System.out.println(list.stream().sequential().filter(i -> i > 10).mapToInt(i -> i).sum());
		OptionalInt it = list
		.stream()
		.mapToInt(i -> i)
		.max();
		System.out.println(it.getAsInt());
	}

	public static void main(String[] args) {
		list.add(12);
		list.add(15);
		list.add(17);
//		sumIterator(list);
//		sumUsingStreams(list);
		int c = (int)'a';
		int c1 = (int)'b';
		System.out.println(c+" "+c1);
		String s = "Sab"+"abc";
		String ss = "Sba";
		
		System.out.println(s.compareTo(ss));
		
		/*String s1="Sachin";  
		   String s2="Sachim";  
		   String s3="Ratan";  
		   System.out.println(s1.compareTo(s2));//0  
		   System.out.println(s1.compareTo(s3));//1(because s1>s3)  
		   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )
*/	}

}
