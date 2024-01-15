package com.kaleem;

class Cooking extends Thread{   //In thread class two or more method running at a same time
	@Override
	
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println("Thread 1 for cooking.....");
			i++;
		}
	}
}
class Chatting extends Thread{
	@Override
	
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println("Thread 2 for chatting with her....");
			i++;
		}
	}
}
class Charging extends Thread{
   @Override
	
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println("Thread 3 for charging my smartphone.....");
			i++;
		}
	}
}
public class MultithreadingConceptUsingThreadClass {

	public static void main(String[] args) {
		
         Cooking t1=new Cooking();
         Chatting t2=new Chatting();
         Charging t3=new Charging();
         t1.start();
         t2.start();     
         t3.start();
         
	}

}
