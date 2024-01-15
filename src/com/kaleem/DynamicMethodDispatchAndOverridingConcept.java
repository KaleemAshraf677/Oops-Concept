package com.kaleem;

class Phone{
	
	public void time() {
		System.out.println("Time is 8 am");
	}
	public void on() {
		System.out.println("Turning on Phone.....");
	}
}
class SmartPhone extends Phone{
	
	public void music() {
		System.out.println("Playing music......");
	}
	@Override
	public void on() {
		System.out.println("Turning on smartphone.......");
	}
}

public class DynamicMethodDispatchAndOverridingConcept {

	public static void main(String[] args) {
	
		Phone obj=new SmartPhone();     // Dynamic Method Dispatch
		obj.time();
		obj.on();
	//	obj.music();   It is not allowed to call child class methods.

	}

}
