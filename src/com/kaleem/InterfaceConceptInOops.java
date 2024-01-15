 package com.kaleem;

interface Bicycle{
	int a=45;    // in interface properties is final or not immutable.
                 // in interfaces we cannot write constructors.
	void applyBrake(int decrement); // in interfaces all the methods are abstract by default and we cannot use normal methods only abstract is allowed
	 void speedUp(int increment); // we cannot specify abstract keyword because it is by default abstract and we can use also if like to use
}
interface HornBicycle{
	void blowHornDhoomMachale();
	void blowHornChiyyaChiyya();
}
class AvonCycle implements Bicycle,HornBicycle{  //we can use both the interfaces together
	                                      // here in interfaces we can use keyword implements to inherit the properties,abstract methods of Interface  
         int speed=15;
         
         AvonCycle(){
        	 System.out.println("I am riding my avon cycle");
         }
         public void applyBrake(int decrement) {   // in interfaces abstract methods(only method systax not method body) we can define their body in child class with public access.
        	 speed=speed-decrement;       // we can use all the interface abstract methods in child class it it mandatory otherwise compiler giving error. 
        	 System.out.printf("applying brake now the speed of cycle is %d",speed);
         }
         public void speedUp(int increment) {
        	 speed=speed+increment;
        	 System.out.printf("speed up now the speed of cycle is %d",speed);
         }
         public void blowHornDhoomMachale() {
        	 System.out.println("pee pee pee pee,Dhoom machale....");
         }
         public void blowHornChiyyaChiyya() {
        	 System.out.println("poo poo poo poo,chal chiyya chiyya.... ");
         }
         void HornStop() {
        	 System.out.println("its a No horn zone,no honking please");
         }
}
public class InterfaceConceptInOops {

	public static void main(String[] args) {
		
	//	HornBicycle obj=new AvonCycle();
   //	 obj.blowHornDhoomMachale();
		
		
		
		AvonCycle obj=new AvonCycle();
		obj.blowHornDhoomMachale();
		obj.blowHornChiyyaChiyya();
		obj.speedUp(8);
	}

}
