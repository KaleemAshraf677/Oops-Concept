package com.kaleem;

interface Camera{
	void takeSnap();  //abstract method is always public in interface.
	void recordVedio();
	
	private void greet() {   // private method in interface is used when our default method is too big than we can call private method body in our default method for the simplicity 
		System.out.println("Good morning world"); //private method cannot be accessed in child classes.
	}
	default void record4KVedio() {   //  default method we can write in interface as a normal method with body,it is not mandatory to implement in child class we can use this as per our convinience.
		greet();
		System.out.println("Recording in 4K......");
	}
}
interface Wifi{
	public String[] getNetworks();
	void connectToNetwork(String network);
}
class CellPhone {
	void phoneNumber(double number) {
		System.out.println("This is my number "+number);
	}
	void pickCall() {
		System.out.println("Call connecting....");
	}
}
class MySmartPhone extends CellPhone implements Camera,Wifi{
	
	public void takeSnap() {
		System.out.println("Taking snap....");
	}
	
	public void recordVedio() {
		System.out.println("Recording Vedio....");
	}
	 public String[] getNetworks() {
		 System.out.println("Getting lists of the networks like kaleemWifi,Ashrafwifi,AliWifi  is active......");
	     String[] networkList= {"KaleemWifi4G","AshrafWifi","AliWifi5G"};
	     return networkList;
	 }
	   public void connectToNetwork(String network) {
		System.out.println("connected network"+network);
	}
	   // public void record4KVedio(){
	    // System.out.println("Recording 4k vedio in my SmartPhone");
	   // if we use interface default method in child class we can use but starts with public access modifier and compiler will execute child class method not those default method which was written in the interface
}


public class DefaultMethodsAndAbstractMethodsAndPrivateMethodsInInterface {

	public static void main(String[] args) {
		
    /*    MySmartPhone obj=new MySmartPhone();
        obj.takeSnap();
        obj.recordVedio();
        
       String[] arr= obj.getNetworks();
       for(String element:arr) {
       System.out.print(element+", ");
       }
        obj.connectToNetwork("KaleemWifi4G");*/
         
	/*	Camera c=new MySmartPhone();
		c.connentToNetwork("KaleemWifi4g");--> throws an error by the compiler because reference is not present in camera  
	      c.recordVedio();
	      c.record4KVedio();  */
		
		Wifi w=new MySmartPhone();
		String[] arr=w.getNetworks();
		for(String e:arr)
			System.out.print(e+",");
	}  
		

}
