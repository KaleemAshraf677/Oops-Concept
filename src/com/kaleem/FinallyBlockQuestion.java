package com.kaleem;

public class FinallyBlockQuestion {

	public static void main(String[] args) {
		
		int a=50;
		int b=5;
		while(true) {
			try {
				System.out.println(a/b);
			}catch(Exception e) {
				System.out.println(e);
				break;
			}finally {
				System.out.println(" value of b = "+b);
			}
			b--;
		}

	}
}
