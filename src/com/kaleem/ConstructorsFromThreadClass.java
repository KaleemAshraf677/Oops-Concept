package com.kaleem;

class KaleemAshraf extends Thread{
	 
	 KaleemAshraf(String name){
		 super(name);
	 }
	 @Override
	 public void run() {
		 int i=0;
		 while(i<50) {
			 System.out.println("KaleemAshraf Thread  is running...........");
			 i++;
		 }
	 } 
}
class AmmanSiddique extends Thread{
	 
	 AmmanSiddique(String name){
		 super(name);
	 }
	 @Override
	 public void run() {
		 int i=0;
		 while(i<50) {
			 System.out.println("Amman siddique Thread  is running...........");
			 i++;
		 }
	 } 
}
public class ConstructorsFromThreadClass {

	public static void main(String[] args) {
		
      KaleemAshraf t1=new KaleemAshraf("Kaleem");
      KaleemAshraf t2=new KaleemAshraf("Ashraf");
      KaleemAshraf t3=new KaleemAshraf("Ali");
      
      AmmanSiddique obj1=new AmmanSiddique("Amman");
      AmmanSiddique obj2=new AmmanSiddique("Siddique");
      AmmanSiddique obj3=new AmmanSiddique("Ramsha");
      
 System.out.println("Id of a KaleemAshraf Thread t1 is "+t1.getId()+" name of a KaleemAshraf thread t1 is "+t1.getName());
 System.out.println("Id of a KaleemAshraf Thread t2 is "+t2.getId()+" name of a KaleemAshraf thread t2 is "+t2.getName());	
 System.out.println("Id of a KaleemAshraf Thread t3 is "+t3.getId()+" name of a KaleemAshraf thread t3 is "+t3.getName());	
	
 System.out.println("Id of AmmanSiddique Thread obj1 is "+obj1.getId()+" name of AmmanSiddique thread obj1 is "+obj1.getName());	
 System.out.println("Id of AmmanSiddique Thread obj2 is "+obj2.getId()+" name of AmmanSiddique thread obj2 is "+obj2.getName());	
 System.out.println("Id of AmmanSiddique Thread obj3 is "+obj3.getId()+" name of AmmanSiddique thread obj3 is "+obj3.getName());	
	
	t1.start();
	obj3.start();
	
	}

}
