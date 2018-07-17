package com.practice;

public enum EnumTest {
    RED("red"),GREEN("green"),BLUE("blue");

    private String description;
    
    public String getDescription(){
        return this.description;
    }
    
    EnumTest(String description){
        this.description = description;
    }
}
