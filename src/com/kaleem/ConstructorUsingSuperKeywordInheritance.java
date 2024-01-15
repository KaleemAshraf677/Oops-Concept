package com.kaleem;

class Base{
	Base(){
		System.out.println("This is a base class");
	}
	Base(int x){
		System.out.println("The value of x in base class is:"+x);
	}
}
    class Derived extends Base{
    	Derived(){
    		super(0);
    		System.out.println("This is a derived class");
    	} 
    	Derived(int x,int y){
    		super(x);
    		System.out.println("The value of x and y in derived class is:"+x+" " +y);
    	}
    }
    class ChildOfDerived extends Derived{
    	ChildOfDerived(){
    		super(4,5);
    		System.out.println("This is a Child of derived class");
    	}
    	ChildOfDerived(int x,int y,int z){
    		super(x,y);
    		System.out.println("The value of x and y in Child of derived class is"+x+" " +y);
    	}
    }

public class ConstructorUsingSuperKeywordInheritance {

	public static void main(String[] args) {
		
	//	Base b=new Base();
	//	Derived d=new Derived();
	//	Derived d= new Derived();
	//	Derived d= new Derived(6,7);
//ChildOfDerived cod=new ChildOfDerived(10,20,30);
		ChildOfDerived cod=new ChildOfDerived();

	}

}
