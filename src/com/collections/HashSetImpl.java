package com.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashSetImpl {

	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		s.add("A");
		s.add("D");
		s.add("C");
		s.add("B");
		s.add("H");
		s.add("G");
//		s.add(new Integer(10));
		
		Map<Snippet,String> m = new HashMap();
		m.put(new Snippet(), "one");
		
		for(Map.Entry<Snippet, String> e : m.entrySet() ){
			System.out.println(e.getKey());
		}
		
		for(String ss : s){
			System.out.println(ss);
		}
	}

}
