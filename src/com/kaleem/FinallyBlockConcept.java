package com.kaleem;

public class FinallyBlockConcept {
	
	public static int divide() {
	try {
		int a=5;
		int b=0;
		int c=a/b;
		return c;
	}catch(Exception e) {
		System.out.println(e);
		return 0;
	}finally {
		System.out.println("Cleaning up resources....This is the end of the function");      //finally block run in any condition forcefully in the programme
	}	
}
	public static void main(String[] args) {
		
		System.out.println(divide());
		
		try {
			System.out.println(50/0);
		}finally {
			System.out.println("I am finally block and i am executed in this programme forcefully");
		}
		
	}

}
