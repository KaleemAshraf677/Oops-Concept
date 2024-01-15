package com.kaleem;

import java.util.Scanner;

public class TryCatchBlockConcept {

	public static void main(String[] args) {
		
		int marks[]= {7,8,4,3};
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Index of Array....");
		int inputIndex=sc.nextInt();
		System.out.println("Enter number for divide this array element");
		int dividerNumber=sc.nextInt();
		
		try{
			System.out.println("array Index = "+marks[inputIndex]);
			System.out.println("array Index after divide ="+marks[inputIndex]/dividerNumber);
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException is occured!.....");
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBound :Exception is occured!.....");
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("some other exception is occured!....");
			System.out.println(e);
		}
		
		

	}

}
