package com.ds;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ListImpl {

	public static void main(String[] args) {
		List<String> l = Arrays.asList(new String[]{"A","C"});
		
		List<String> l1 = Arrays.asList(new String[]{"B","D"});
		
		for(String li : l){
			System.out.println(li);
//			break;
		}
		
		l.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		/*for(String ll : l1){
			System.out.println(ll);
			break;
		}*/
	}

}
