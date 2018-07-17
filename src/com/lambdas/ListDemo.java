package com.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class ListDemo {

	public static void main(String[] args) {
		List<Integer> li = Collections.EMPTY_LIST;
		
		List<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
//		li.addAll(list);
		li.add(1);
		System.out.println(li);
	}

}
