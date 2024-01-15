package com.kaleem;

 class MyMainEmployee{
	 private int id;
	 private  String name;
	 private int salary;
	 
	 public MyMainEmployee() {
		 this.id=0;
		this.name="Kaleem Ashraf"; 
	 }
	 public MyMainEmployee(String n,int myId) {
		 name=n;
		 id=myId;
		 System.out.println(id);
	      System.out.println(name);
	 }
	 public MyMainEmployee(String n) {
		 id=1;
		 name=n; 
	 }
	 public MyMainEmployee(String str,int x,int sal ) {
		 name=str;
		 id=x;
		 salary=sal;
		
	 }
	 public String getName() {
		 return name;
	 }
	 public int getId() {
		 return id;
	 }
	 public int getSalary() {
		 return salary;
	 }
 }
public class ConstructorConcept {

	public static void main(String[] args) {
		
      MyMainEmployee Kaleem=new MyMainEmployee();
      System.out.println(Kaleem.getId());
      System.out.println(Kaleem.getName());
      
      MyMainEmployee Amman=new MyMainEmployee("Amman Siddique");
      System.out.println(Amman.getId());
      System.out.println(Amman.getName());
      
      MyMainEmployee Sifat=new MyMainEmployee("Sifat Zehra",101);
      
      MyMainEmployee Ramsha=new MyMainEmployee("Ramsha Praveen",102,10000);
                System.out.println(Ramsha.getId());
                System.out.println(Ramsha.getName());
                System.out.println(Ramsha.getSalary());
      
	}

}
