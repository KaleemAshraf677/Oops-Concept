package com.kaleem;

  class R{
	
	 float length;
	 float breadth;
	 float height;
	
	 R(float length,float breadth,float height ){
			this.length=length;
			this.breadth=breadth;
			this.height=height;
	
		}
	 R(){
		 System.out.println("area of a rectangle and cuboid");
	 }
	
	 float areaOfRectangle() {
		 return length*breadth;
	 }
	 float volumeOfRectangle() {
		 return length*breadth*height;
	 } 
}
class Cuboid extends R{
	
	Cuboid(float a,float b,float c){
	
		length=a;
		breadth=b;
		height=c;
	}
	float areaOfCuboid() {
		return 2*(length*breadth+length*height+height*breadth);
	}
	float volumeOfCuboid() {
		return length*breadth*height;
	}
	
}
public class AreaVolumeOfRectangleInheritCuboidUsingGetterSetter {

	public static void main(String[] args) {
	
		R rectangle=new R(12.2f,13.2f,13.5f);
		System.out.println(rectangle.areaOfRectangle());
		System.out.println(rectangle.volumeOfRectangle());
		
          Cuboid c=new Cuboid(23,2.5f,4.5f);
          System.out.println(c.volumeOfCuboid());
          System.out.println(c.areaOfCuboid());
	}

}
