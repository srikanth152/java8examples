package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TypeOfObjCreation {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, 
    NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        //approach one
        Employee e = new Employee();
        
        //approach 2
        Employee e1 = (Employee)Class.forName("com.reflection.Employee").newInstance();
        System.out.println(e1.getAge());
        
        //approach 3
        Employee e3 = Employee.class.newInstance();
        
        //approach 4
        Constructor<Employee2> e4 = Employee2.class.getConstructor();
        Employee2 e5 = e4.newInstance();
        e5.setName("hello");
        System.out.println(e5.getName());
    }

}
