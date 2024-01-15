package com.kaleem;

import java.util.Scanner;

class MyCustomException extends Exception{
	@Override
	public String toString() {
		return "Error:You are Reached the Maximum Limit";
	}
}
public class TryCatchQuestion {
	public static void printException(int i) throws MyCustomException {
		if(i>=5) 
			throw new MyCustomException();
}
 public static void main(String[] args) {
	
	      int marks[]=new int[4];
           	marks[0]=45;
        	marks[1]=40;
	        marks[2]=50;
	        marks[3]=35;
	
	       int i=0;
        while(i<5) {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter Index of marks array");
        	int index=sc.nextInt();
        	
        	try {
        		System.out.println("Value of marks in input index = "+marks[index]);
        		System.out.println("Thank you for using this programme");
        		break;
        	}catch(Exception e) {
        		System.out.println(e);
        		i++;
        	}
        	if(i==5) {
        		try{
        			printException(5);
        		}catch(Exception e) {
        			System.out.println(e);
        		}		
           }
       }
   }      
}       	
        	
        	