package com.kaleem;

class Employee{
	int id;
	String name;
	float salary;
	
	public void employeeInfo() {
		System.out.println("my id is "+id);
	}
	public float getSalary() {
		return salary;
	}
	public void employeeName() {
		System.out.println("my name is= "+name);
	}
	
}
public class BasicOverviewOops {

	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		emp1.id=101;
		emp1.name="Kaleem Ashraf";
		emp1.salary=25550.50f;
		
		Employee emp2=new Employee();
		emp2.id=102;
		emp2.name="Amman Siddique";
		emp2.salary=30000.50f;
		
		emp1.employeeInfo();
		emp2.employeeInfo();
       System.out.println( "my salary= "+emp1.getSalary());
       System.out.println("my salary= "+emp2.getSalary());
        emp1.employeeName();
        emp2.employeeName();
	}

}
