package com.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Java8LambdaExercise {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Ajay","kandula",30),
				new Person("srikanth","bandaru",26),
				new Person("kiran","marvathi",30),
				new Person("ashok","gopisetty",27)
				);
		
		Collections.sort(people, ( p1,  p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		printAll(people);
		
		printConditionally(people, p -> true);
		
		printConditionally(people, (Person p) -> p.getLastName().startsWith("g"));
		
//		lambdawithabsclass(people, p -> p.getFirstName().startsWith("s"));
	}

	private static void printConditionally(List<Person> people, Conditional conditional) {
		for(Person p : people){
			if(conditional.test(p)){
				System.out.println(p);
			}
		}
	}

	private static void printAll(List<Person> people) {
		for(Person p : people){
			System.out.println(p);
		}
	}
	
	private static void lambdawithabsclass(List<Person> people, Abs abs){
		for(Person p: people){
			if(abs.absmethod(p)){
				System.out.println(p);
			}
		}
	}

}

abstract class Abs{
	public abstract boolean absmethod(Person p);
}

