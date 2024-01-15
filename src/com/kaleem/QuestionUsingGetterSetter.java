package com.kaleem;
//In this programme we use double because the value of Math.PI is in double format
class Cylinder {
	private double radius;
	private double height;
	
	Cylinder(double r,double h){
		radius=r;
		height=h;
	}
	 double getRadius() {
		 return radius;
	 }
	 double getHeight() {
		 return height;
	 }
	 double areaOfCylinder() {
		 return 2*Math.PI*radius*height+2*Math.PI*radius*radius;
	 }
	 double volumeOfCylinder() {
		 return Math.PI *radius*radius*height;
	 }
}

 class Rectangle{
	  private int length;
	  private int breadth;
	  
	  Rectangle(){
		  length=4;
		  breadth=5;
	  }
	  int getLength() {
		  return length;
	  }
	  int getBreadth() {
		  return breadth;
	  }
 }
 
 class Sphere{
	 private double radius;
	 
	 void setRadius(double r) {
		 radius=r;
	 }
	 double getRadius() {
		 return radius;
	 }
	 
	 double areaOfSphere() {
		 return 4*Math.PI*radius*radius; 
	 }
	 double volumeOfSphere() {
		 return 4/3*Math.PI*radius*radius*radius;
	 }
 }
public class QuestionUsingGetterSetter {

	public static void main(String[] args) {
	
		Cylinder cldr=new Cylinder(4.4,8.8); 
		
		System.out.println(cldr.getRadius());
		System.out.println(cldr.getHeight());
		System.out.println(cldr.areaOfCylinder());
		System.out.println(cldr.volumeOfCylinder());
		
		Rectangle r=new Rectangle();
		System.out.println(r.getLength());
		System.out.println(r.getBreadth());
		
		Sphere s= new Sphere();
		s.setRadius(7.8);
		System.out.println(s.getRadius());
		System.out.println(s.areaOfSphere());
		System.out.println(s.volumeOfSphere());
    
	}

}
