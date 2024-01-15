//  Making our own Exception class Using Predifined Exception Class In java

package com.kaleem;

import java.util.Scanner;

class MyException extends Exception{
	@Override
	public String toString() {
		return  "I am toString";
	}
	@Override
	public String getMessage() {
		return "I am getMessage";
	}
}
class MaxAgeException extends Exception{
	@Override
	public String toString() {
		return  "Age cannot be less than 9 ";
	}
	@Override
	public String getMessage() {
		return "check the value of age";
	}
}  

public class CustomExceptionClassExampleUsingPredefinedBuildInExceptionClassInJava {

	public static void main(String[] args) {
	
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        
        if(a<9) {
        	  try {
        		  // throw new MyException();       // object of MyException class= MyException()
        		 // throw new ArithmeticException("This is an Exception");    // build in ArithmeticException class
                  throw new MaxAgeException();       	 
        	  }  //
        	  catch(Exception e) {
        		System.out.println(e);
        		//System.out.println(e.toString());
        		//System.out.println(e.getMessage());
        		e.printStackTrace();                   //predifined method() in Exception class
        		//System.out.println("Finished");
        	}
       }
        
	}
}
