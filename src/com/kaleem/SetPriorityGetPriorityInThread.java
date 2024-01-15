package com.kaleem;

class Priority extends Thread{
    
	Priority(String name){
		super(name);
	}
	@Override
	public void run() {
		int i=0;
		while(i<50) {
			System.out.println("This is Priority class Thread is running ..........");
			i++;
		}
		System.out.println("The name of the Thread is "+getName());
		System.out.println("Priority of this class thread is "+getPriority());
	}
}
class NoPriority extends Thread{
	
	NoPriority(String name){
		super(name);
	}
	@Override
	public void run() {
		int i=0;
		while(i<50) {
			System.out.println("This is NoPriority class Thread is running ..........");
			i++;
		}
	    System.out.println("The name of the thread is "+getName());
	    System.out.println("priority of this class Thread "+getPriority());
	}
	
}

public class SetPriorityGetPriorityInThread {

	  public static void main(String[] args) {
		
         Priority t1=new Priority("Sifat Zehra");
         NoPriority t2=new NoPriority("Ramsha Praveen");
        
         t1.setPriority(10);                    //t1.setPriority(Thread.MAX_PRIORITY);
         t2.setPriority(Thread.MIN_PRIORITY);   // t2.setPriority(1);
         
         t1.start();
         t2.start();     
        
         
	}

}

