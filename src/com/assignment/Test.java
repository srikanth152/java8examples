package com.assignment;

public class Test {
    
   public Test(){
       this(10);
    }
   
   public Test(int i){
   }

    enum MyMonthEnumTest {

        JANUARY,

            FEBRUARY;


        private String month;


        }
    
    MyMonthEnumTest month;
        public static void main(String[] args)
        {


                Test et = new Test();

                et.month = MyMonthEnumTest.JANUARY;

                System.out.println(et.month);

       }
}
