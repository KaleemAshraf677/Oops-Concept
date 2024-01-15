package com.kaleem;

class EkClass{
	int a;
	
	public void classroom(int a) {
		this.a=a;
		System.out.println(this.a);
	}
	EkClass(){
		System.out.println("this is Ekclass");
	}
	EkClass(int a){
		this.a=a;
		System.out.println(this.a);
	}
} 
  class DoClass extends EkClass{
	   DoClass(int a){
		super(a);
		System.out.println("this is Doclass");
	   }
  }
public class UseOfThisAndSuperKeyword {

	public static void main(String[] args) {
	
		DoClass d=new DoClass(5);
		d.classroom(6);
	}
}	     


