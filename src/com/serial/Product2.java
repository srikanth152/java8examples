package com.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Product2 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private static String country = "USA";
	private final int cost = 100;
	private transient int cost1 = 200;
	private final int cost2 = 200;
	
	public int getCost2() {
		return cost2;
	}
	public int getCost1() {
		return cost1;
	}
	public void setCost1(int cost1) {
		this.cost1 = cost1;
	}
	public int getCost() {
		return cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getCountry() {
		return country;
	}
	public static void setCountry(String country) {
		Product2.country = country;
	}
	
	public Product2(){
		System.out.println(" &&&&&&&&&&& ");
	}
	
	public static void main(String[] args) {
		
		Product2 p = new Product2();
		p.setName("Jeans");
		FileOutputStream fileOutputStream;
		try {
			fileOutputStream = new FileOutputStream("yourfile2.txt");
			ObjectOutputStream objectOutputStream 
			= new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(p);
			objectOutputStream.flush();
			objectOutputStream.close();
			
			FileInputStream fileInputStream 
		      = new FileInputStream("yourfile2.txt");
		    ObjectInputStream objectInputStream 
		      = new ObjectInputStream(fileInputStream);
		    Product2 e2 = (Product2) objectInputStream.readObject();
		    
		    
		    
		    objectInputStream.close();
		    System.out.println(" static country "+e2.getCountry());
		    System.out.println(" final cost "+e2.getCost());
		    System.out.println(e2.getCost1());
		    System.out.println(" final cost " +e2.getCost2());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
