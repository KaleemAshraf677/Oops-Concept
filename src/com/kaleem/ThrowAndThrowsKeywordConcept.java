package com.kaleem;

class NegativeRadiusException extends Exception{    // custom method for Exception
	@Override
	public String toString() {
		return "Radius cannot be negative...";
	}
	@Override
	public String getMessage() {
		return "Check the Radius";
	}
}

public class ThrowAndThrowsKeywordConcept {
	
	public static double area(double r) throws NegativeRadiusException{   //declare the Exception Class using throws keyword to the main method to handle this issue.
		     
		if(r<0) {
			throw new NegativeRadiusException();
		}
		else {
		      double result =3.1415f*r*r;
		      return result;
	   }
}
	public static void main(String[] args) {
		
		try {
		      double a= area(-7);
		              System.out.println(a);
	   }
		catch(Exception e) {
		   System.out.println(e);
		   e.printStackTrace();
	   }
   }
}