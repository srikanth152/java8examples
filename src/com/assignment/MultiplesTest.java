package com.assignment;

import java.util.regex.Pattern;

public class MultiplesTest {

	public static void main(String... args) {
		checkMultiples(args[0]);
//		System.out.println(isNumber("12345"));
	}

	private static void checkMultiples(String string) {
		if(validate(string)){
			int n = Integer.parseInt(string);
			for(int i=1; i<=n; i++){
				if(i%3 == 0 && i%5 == 0){
					System.out.println("fizzbuzz");
				}else if(i%3 == 0){
					System.out.println("fizz");
				}else if(i%5 == 0){
					System.out.println("buzz");
				}
				else{
					System.out.println(i);
				}
			}
		}
	}

	private static boolean validate(String string) {
		if(string != null && !string.equals("") && isNumber(string)){
			return true;
		}
		return false;
	}

	private static boolean isNumber(String string) {
		Pattern pattern = Pattern.compile(".*[^0-9].*");
		return !pattern.matcher(string).matches();
	}

}
