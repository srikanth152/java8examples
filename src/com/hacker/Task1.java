package com.hacker;

import java.util.Scanner;

public class Task1 {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        process(N);
        String s = String.valueOf(100);
        System.out.println(s);
        scanner.close();
    }

	private static void process(int n) {
		if(n % 2 != 0){
			System.out.println("weird");
		}
		else {
			if(n>=2 && n<=5){
				System.out.println("not weird");
			}
			if(n>=6 && n<=20){
				System.out.println("weird");
			}
			if(n>20){
				System.out.println("not weird");
			}
		}
	}

}
