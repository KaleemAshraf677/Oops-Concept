package com.kaleem;

public class ThrowAndThrowskeywordQuestion {
	
	public static int division(int a,int b) throws ArithmeticException{
	/*	if(b==0) {
			throw new ArithmeticException("divisible by 0");
		}
		else  */
		    return a/b;
	}

	public static void main(String[] args) {
		
		try {
		        int c=division(6,0);
		        System.out.println(c);
	   }catch(Exception e) {
		   System.out.println(e);
		  e.printStackTrace();
	   }

     }
}