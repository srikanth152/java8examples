package com.exceptionhandling;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModificationException {

	public static void main(String[] args) {
		
		Map<Integer, String> m = new HashMap<>();
		
		m.put(1, "One");
		m.put(2, "two");
		m.put(3, "three");
		m.put(4, "four");
		
		System.out.println("HashMap before iterator: "+m);
		Iterator<Integer> it = m.keySet().iterator();

		while(it.hasNext()){
			int key = it.next();
			//if(key == 3) 
		//		m.put(7, "Seven");
				//it.remove();
		}
		System.out.println("ConcurrentHashMap after iterator: "+m);
		
		//ConcurrentHashMap
				Map<String,String> myMap = new ConcurrentHashMap<String,String>();
				myMap.put("1", "1");
				myMap.put("2", "1");
				myMap.put("3", "1");
				myMap.put("4", "1");
				myMap.put("5", "1");
				myMap.put("6", "1");
				System.out.println("ConcurrentHashMap before iterator: "+myMap);
				Iterator<String> itt = myMap.keySet().iterator();

				while(itt.hasNext()){
					String key = itt.next();
					if(key.equals("3")) myMap.put(key+"new", "new3");
				}
				System.out.println("ConcurrentHashMap after iterator: "+myMap);
				
		
	}

}
