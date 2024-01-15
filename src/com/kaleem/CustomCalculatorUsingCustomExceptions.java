/* You have to create a custom calculator with following operations:
   ADDITION,SUBSTRACTION,Multiplication,DIVISION which throws the following exceptions:
   Invalid Input exceptions for negative numbers
   Cannot divide by 0 Exceptions
   Max Input Exception 
   
   NOTE-->  You can solve this problem by making Class And Object Using Oops Concepts as well as by making normal methods */
 
package com.kaleem;

class InvalidNegativeInputException extends Exception{
	@Override
	public String toString() {
		return "cannot use negative input";
	}
}
class CannotDivideZeroException extends Exception{
	@Override
	public String toString() {
		return "div by 0 ";
	}
}
class MaxInputException extends Exception{
	@Override
	public String toString() {
		return "input is greater than 1000000 ";
	}
}
public class CustomCalculatorUsingCustomExceptions {
	
	public static int addition(int a,int b) throws InvalidNegativeInputException,MaxInputException{
		if(a<0 || b<0) 
			throw new InvalidNegativeInputException();
		if(a>1000000 ||b>1000000)
		     throw new MaxInputException();
		
			return a+b;
}
public static int substraction(int a,int b) throws InvalidNegativeInputException,MaxInputException{
		if(a<0 || b<0) 
			throw new InvalidNegativeInputException();
		if(a>1000000 ||b>1000000)
			throw new MaxInputException();
		
			 return a-b;
}
public static int multiplication(int a,int b) throws InvalidNegativeInputException,MaxInputException{
		if(a<0 || b<0) 
			throw new InvalidNegativeInputException();
		if(a>1000000||b>1000000)
			throw new MaxInputException();
		
			return a*b;
}
	public static int divide(int a,int b) throws InvalidNegativeInputException,CannotDivideZeroException,MaxInputException{
		if(a<0 || b<0 ) 
			throw new InvalidNegativeInputException();
        if(a>1000000||b>1000000)
        	throw new MaxInputException();
        if(b==0)
        	throw new CannotDivideZeroException();
        
			return a/b;
}
public static void main(String[] args) throws InvalidNegativeInputException,CannotDivideZeroException,MaxInputException {
		
          System.out.println(addition(6,7));
          System.out.println(substraction(100000,5)); 
          System.out.println(multiplication(7,-4));
           System.out.println(divide(0,4));
        //  divide(3,0);
	}

}
