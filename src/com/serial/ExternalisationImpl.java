package com.serial;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalisationImpl  implements Externalizable{
	
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
	}

	@Override
	public void readExternal(ObjectInput read) throws IOException, ClassNotFoundException {
		name = (String)read.readObject();
	}
	
	public ExternalisationImpl(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public ExternalisationImpl(){
		
	}

	public static void main(String[] args) {
		ExternalisationImpl ex = new ExternalisationImpl("srikanth", 31);
		try {
			FileOutputStream f = new FileOutputStream("newFile.txt");
			ObjectOutputStream out = new ObjectOutputStream(f);
			out.writeObject(ex);
			out.flush();
			out.close();
			
			 ObjectInputStream in = new ObjectInputStream(new FileInputStream("newFile.txt"));
			 ExternalisationImpl  u=(ExternalisationImpl)in.readObject();
			 
			 System.out.println(u.getName()+" "+u.getAge());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
