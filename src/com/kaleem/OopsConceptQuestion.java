package com.kaleem;

class Employee2{
	int salary;
	String name;

	public int getSalary() {
		return salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String n) {
	   
	  System.out.println(n );
	}
}
public class OopsConceptQuestion {

	public static void main(String[] args) {
		Employee2 e1=new Employee2();
		e1.salary=20000;
		e1.name="Kaleem Ashraf";
		
	//	System.out.println(e1.getSalary());
	//	System.out.println(e1.getName());
	   e1.setName("amman sid");


	}

}
