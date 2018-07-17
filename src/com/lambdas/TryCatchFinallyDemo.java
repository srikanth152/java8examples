package com.lambdas;

public class TryCatchFinallyDemo {

	public static void main(String[] args) {
		System.out.println(returnValue());
	}

	private static String returnValue() {
		String s = null;
        try
        {
            s = "return value from try block";
            return s;
        }
        catch (Exception e)
        {
            s = s + "return value from catch block";
        }
        finally
        {
            s = s + "return value from finally block";
            
        }
        return s;
	}

}
