
// writ a java programme that allows you to keep accessing array forcefully.Until a valid index is given by the user.

package com.kaleem;

import java.util.Scanner;

public class NestedTryCatchQuestion {

	public static void main(String[] args) {
	
	 int arr[]= {7,8,4,3,5};
	
	 boolean b=true;
	
	 while(b) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Index of Array....");
		int inputIndex=sc.nextInt();
		
		try {
			System.out.println("welcome to the array...");
			try {
				System.out.println("you are now in array index and the value is "+arr[inputIndex]);
				b=false;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("You are in Level 2 Exception,sorry this index does not exist");
				System.out.println(e);
			}
		}
	    catch(Exception e) {
			    System.out.println("You are in level 1 Exception");
			    System.out.println(e);
		}
   }
}
 
}
