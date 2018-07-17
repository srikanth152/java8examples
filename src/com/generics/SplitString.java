package com.generics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String text = "This is the text to be searched " + "for occurrences of the patter is.";
		String pattern = ".*is.*";
		boolean matches = Pattern.matches(pattern, text);
//		System.out.println("matches = " + matches);

		String p = "ObjName:[\\sa-zA-Z]";
		Pattern pat = Pattern.compile(p);
		String s = "typeId:93,ObjName:Parking Direct to Revenue Rule,ObjCode: LDG-AUTODIRREV";
		String s1 = "typeId:93,ObjCode:Parking Direct to Revenue Rule,ObjName: LDG-AUTODIRREV";
		Matcher m = pat.matcher(s1);
		System.out.println(m.find()+" "+m.group());
		
	}

}
