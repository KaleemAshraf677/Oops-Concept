package com.kaleem;

class Kaleem implements Runnable{
	@Override
   public void run() {
		int i=0;
		while(i<100) {
			System.out.println("Running thread 1...............");
			i++;
		}	
	}
}
class Ashraf implements Runnable{
	@Override
	 public void run() {
		int i=0;
		while(i<100) {
			System.out.println("Running thread 2222222...............");
			i++;
		}	
	}
}
public class MutiThreadingUsingRunnableInterface {

	public static void main(String[] args) {
		
		Kaleem bullet=new Kaleem();
		Thread gun=new Thread(bullet);  //(runnable bullet)
		
		Ashraf obj=new Ashraf();
		Thread object=new Thread(obj); //(runnable obj)
		
		gun.start();
		object.start();

	}

}
