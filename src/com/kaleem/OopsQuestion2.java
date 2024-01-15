package com.kaleem;

import java.util.Scanner;

class Square{
	float side;
	
	public void area() {
		System.out.println("area of square= " +side*side);
	}
	public void parametre() {
		System.out.println("parametre of square= "+ 4*side);
		
	}
}
public class OopsQuestion2 {

	public static void main(String[] args) {
		
		
		
		Square sq=new Square();
		sq.side=3.3f;
		sq.area();
		sq.parametre();
		
		

	}

}
