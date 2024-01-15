// write a programme that allows you to keep accessing an array until a valid index is given.If max Exception retreive exceed 5 times,
// than throw the programme of your Custom Exception Class and print "Error:You are reached the maximum Limit.".   

package com.kaleem;

import java.util.Scanner;

class CustomException extends Exception{
	@Override
	public String toString() {
		return "Error:You are Reached the Maximum Limit";
	}
}

public class QuestionTryCatch {

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
            		break;
            	}catch(Exception e) {
            		System.out.println(e);
            		i++;
            	}
            	if(i==5) {
            		try {
            			throw new CustomException();
            		}catch(Exception e) {
            			System.out.println(e);
            		}
            		
            	}
            		
            }      
	}
}
