package com.kaleem;

class Kaleem1 implements Runnable{
	
	Kaleem1(){
	}
	@Override
   public void run() {
		int i=0;
		while(i<50) {
			System.out.println("Running thread 1111111...............");
			i++;
		}	
	}
}
class Ashraf1 implements Runnable{
	Ashraf1(){
	}
	@Override
	 public void run() {
		int i=0;
		while(i<50) {
			System.out.println("Running thread 2222222...............");
			i++;
		}	
	}
}

public class ConstructorFromRunnableInterface {

	public static void main(String[] args) {
		
        Kaleem1 obj=new Kaleem1();
        Thread object=new Thread(obj,"Kaleem Ashraf"); //(Runnable obj,String name) 
	
	Ashraf1 a=new Ashraf1();
	Thread t=new Thread(a,"Mohammad Ashraf");
	
	System.out.println("Id of Thread in Kaleem1 class is "+object.getId()+" Name of thread in Kaleem1 class is "+object.getName());
	System.out.println("Id of Thread in Ashraf1 class is "+t.getId()+" Name of thread in Ashraf1 class is "+t.getName());
	
	object.start();
	t.start();
	
	
	
	}
	

}
