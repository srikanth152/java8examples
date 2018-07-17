package com.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExercise {

	public static void main(String[] args) {
		
		List<Person> person = Arrays.asList(
				new Person("Ajay","kandula",30),
				new Person("srikanth","bandaru",26),
				new Person("kiran","marvathi",30),
				new Person("ashok","gopisetty",27)
				);
		
		Collections.sort(person, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		printAll(person);
		
		printConditional(person, new Conditional(){

			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("g");
			}
			
		});
		
		printConditional(person, new Conditional() {
			
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("s");
			}
		});
	}
	
	private static void printConditional(List<Person> list, Conditional conditional) {
		for(Person p : list){
			if(conditional.test(p)){
				System.out.println(p);
			}
		}
	}

	public static void	printAll(List<Person> list){
		for(Person p : list){
			System.out.println(p);
		}
	}
	
}

interface Conditional{
	public boolean test(Person p);
}
