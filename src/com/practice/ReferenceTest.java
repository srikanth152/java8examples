package com.practice;

public class ReferenceTest {

   public Emp getEmp(){
       Address a = new Address("area1","area2");
        Emp e = new Emp("srikanth", "bandaru", a);
        return e;
    }
    
    
    public static void main(String[] args) {
        ReferenceTest rf = new ReferenceTest();
        Emp e = rf.getEmp();
        e.getAddress().setFname("hyderabad");
        
        System.out.println(e);
        
        /*Test t = new Test(10, "hello");
        
        Test t1 = t;
        t1.i = 20;
        t1.msg = "hai";
        
        System.out.println(t.i+ " "+t1.i);
        
        System.out.println(t.hashCode());
        System.out.println(t1.hashCode());*/
    }

}
