package com.kaleem;

interface TvRemote{
	void onTv();
	void offTv();
}
interface SmartTvRemote extends TvRemote {
	void useYoutube();
	void useChrome();
}
class User implements SmartTvRemote{
	
	public void useYoutube() {
		 System.out.println("opening youtube......"); 
	 }
	public void useChrome() {
		System.out.println("using chome browser......");
	}
	public void onTv() {
		System.out.println("switch on the tv......");
	}
	public void offTv() {
		System.out.println("switch off the tv");
	}
}
public class InheritanceInInterfacesExampleQuestion {

	public static void main(String[] args) {
		
	/*	TvRemote obj=new User();
		obj.useChrome();  --> throws an error because the reference is not available in TvRemote interface
            obj.offTv();  */
		
         SmartTvRemote o= new User();
         o.onTv();
	}

}
