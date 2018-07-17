package com.exceptionhandling;

public class CheckedException implements Cloneable{

    void m() throws Exception{
        System.out.println(" mmmmm "); 
    }
    
    void n() throws Exception {
        m();
    }

    void p(){  
        try{  
         n();  
        }catch(Exception e){System.out.println("exception handeled");}  
       }

    public static void main(String[] args) {
        CheckedException ce = new CheckedException();
        try {
            CheckedException ce2 = (CheckedException) ce.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        ce.p();
    }
}
