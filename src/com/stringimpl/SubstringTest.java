package com.stringimpl;

import java.lang.reflect.Field;
import java.util.Arrays;

public class SubstringTest {

	public static void main(String[] args) throws Exception, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		//Our main String
        String mainString = "i_love_java";
        //Substring holds value 'java'
        String subString = mainString.substring(7);
 
        System.out.println(mainString);
        System.out.println(subString);
        
        Field innerCharArr = String.class.getDeclaredField("value");
        innerCharArr.setAccessible(true);
        
        char[] chars = (char[])innerCharArr.get(mainString);
        System.out.println(Arrays.toString(chars));
        
        chars = (char[])innerCharArr.get(subString);
        System.out.println(Arrays.toString(chars));
	}

}
