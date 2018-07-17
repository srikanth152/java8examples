package com.lambdas;

import java.util.Collections;

public class StringTest {

	public static void main(String... args) {
		System.out.println(args[0]+ "" +args[1]);
		String s = "test";
		String ss = new String("test");
		
		String sss = ss.intern();
		
		System.out.println(s.equals(ss));
		
		System.out.println(s == ss);
		
		System.out.println(s == sss);
		
		String te = "of coursewyeswnowmaybe";
		String[] test = te.split("w");
		System.out.println(test.length);
		
	}

}
