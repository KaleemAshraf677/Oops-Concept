package com.kaleem;

/*abstract class Parent{
	
	Parent(){
		System.out.println("mai parent class hu");
	}
	void sayhello() {
		System.out.println("hello everyone");
	}
	abstract public void greet();
	abstract void greet1();
}
class Child extends Parent{
	 
	@Override
	    public void greet() {
		System.out.println("Good Morning");
   }
	@Override
	    void greet1() {
		System.out.println("Good afternoon");
	}
}
----------------------------------------------------------------------*/

abstract class Phone1{
	abstract void on();
}
class SmartPhone1 extends Phone1{
	
	@Override
	void on() {
		System.out.println("Turning on......");
	}
}

public class AbstractConceptInOops {

	public static void main(String[] args) {
		
/*   Parent obj=new Child();
   obj.greet();
   obj.greet1();
	}
} 
-------------------------------------------------------------------- */
	Phone1 obj=new SmartPhone1();
	obj.on();
		
	}
}	


