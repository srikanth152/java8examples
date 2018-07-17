package com.alogrithm;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LinearSearch {

	public static void main(String[] args) {
		String arr[] = {"a","b","d","f","h","j","c","e","k","g"};
		int i = findElement(arr,arr.length,"j");
		if(i > 0)
			System.out.println("found element at "+i+" position");
		else
			System.out.println("element not found ");
		
		find8(arr, "z");
	}

	private static void find8(String[] arr, String value) {
		List<String> li = Arrays.asList(arr);
		
		String opt = li.stream()
		.filter( x -> x.equals(value))
		.map(x->x)
		.findFirst().orElse("Element not found");
		
		System.out.println(opt);
	}

	private static int findElement(String[] arr, int len, String x) {
		for(int i=0;i<len-1; i++){
			if(arr[i] == x){
				return i;
			}
		}
		return -1;
	}

}
