package com.kaleem;

class MyEmployee {
	private int id;
	private String name;
	
	
	public void setValues(String str,int a) {
		id=a;
		name=str;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String x) {
		name=x;
	}
	public void setId(int a) {
		id=a;
	}
}
public class GettersSettersConcept {

	public static void main(String[] args) {
		
		MyEmployee e=new MyEmployee();

		    e.setValues("kaleem Ashraf",101);
		     System.out.println(e.getId());
		     System.out.println(e.getName());
           
             
            e.setId(101);
            System.out.println(e.getId());
             e.setName("Amman siddique");
             System.out.println(e.getName());
          
	}

}
