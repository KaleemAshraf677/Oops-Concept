package com.kaleem;

class SubClass extends Thread{  
	@Override
	public void run() {
		int i=0;
		while(i<50) {
			try {
				Thread.sleep(500);     //500=500 milliseconds
			} catch (InterruptedException e) {
				e.printStackTrace();
			}      
			System.out.println("SubClass Thread is running .....");
			i++;
		}
	}
}
class SubSubClass extends Thread{
	@Override
	public void run() {
		int i=0;
		while(i<50) {
			System.out.println("Sub-SubClass thread is running .........");
			i++;
		}
	}
}
public class DiffDiffMethodsOfThread {

	public static void main(String[] args) {
		
          SubClass t1=new SubClass();
         SubSubClass t2=new SubSubClass();
         
            t1.start();
            
         /*   try {
				t1.join();  // you can also specify time for t1.join(milliseconds);
			} catch (InterruptedException e) {     //   catch(Exception e){
				  e.printStackTrace();              //    System.out.println(e);     
			}	     */                               //  } 
			
            t2.start();     
         
         
	}

}

