package com.collections;

public class Student implements Comparable<Student>{
    
    private int id;
    private String name;
    
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return this.id+" "+this.name;
    }

    @Override
    public int compareTo(Student s) {
        if (id == s.id)
            return 0;
        else if (id > s.id)
            return 1;
        else
            return -1;
    }
}
