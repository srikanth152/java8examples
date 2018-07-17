package com.lambdas;

public class TestCompare implements Comparable<TestCompare>{
	
	int id;
	String name;
	int no;

	public TestCompare(int id, String name, int no) {
		this.id = id;
		this.name = name;
		this.no = no;
	}


	public int compareTo(TestCompare t) {
		 if(this.id < t.id){
			 return 1;
		 }else{
			 return 0;
		 }
	} 
}

