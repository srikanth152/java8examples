package com.practice;

import java.util.ArrayList;
import java.util.List;

public class Test {

    int i;
    String msg;
    
    public Test(){
    }
    
    public Test(int i, String m){
        this.i = i;
        this.msg = m;
        
        String query = "select /* +Parallel(4) */ (trunc(sysdate) - min(trunc(tbl.RECEPTION_DATETIME))) as ACT_AUDIT_MSGFIELDVAR "
            + "from actional.ACT_AUDIT_MSGFIELDVAR tbl";
        
//        System.out.println(query);
    }
    
    public static void main(String[] args) {
    	
        Test t = new Test(10, "hello");
        A a = new A();
        for(;;){
        	try {
				Thread.sleep(1000*1);
				a.m();
				if(A.variable%10 == 0){
					break;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
    }
}
