package com.practice;

public class Address {
    
    String area1;
    String area2;
    
    public Address(String f, String l){
        this.area1 = f;
        this.area2 = l;
    }
    public String getFname() {
        return area1;
    }
    public void setFname(String fname) {
        this.area1 = fname;
    }
    public String getLname() {
        return area2;
    }
    public void setLname(String lname) {
        this.area2 = lname;
    }

}
