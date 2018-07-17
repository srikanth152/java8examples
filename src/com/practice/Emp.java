package com.practice;

public class Emp {
    
    String fname;
    String lname;
    Address address;
    
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public Emp(String f, String l, Address a){
        this.fname = f;
        this.lname = l;
        this.address = a;
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return this.fname +" "+this.getAddress().getFname();
    }
}
