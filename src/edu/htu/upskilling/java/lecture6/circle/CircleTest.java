package edu.htu.upskilling.java.lecture6.circle;

public class CircleTest {
	public static void main(String[] args) {
//		Circle_V1 c1=new Circle_V1();
//		c1.calculateRound(5);
//		c1.calculateArea(5);

//		Circle_V2 c1=new Circle_V2();
//		c1.rad=5;
//		c1.calculateArea();
//		c1.calculateRound();

//		Circle_V3 c1=new Circle_V3();
//		c1.rad=5;
//		System.out.println(c1.calculateArea());
//		System.out.println(c1.calculateRound());

//		Circle_V4 c1=new Circle_V4();
//		c1.rad=5;
//		
//		System.out.println(Circle_V4.PI);//static variable
//		//could be called direcrly on the class, not the object
//		System.out.println(c1.calculateArea());
//		System.out.println(c1.calculateRound());

//		Circle_V5 c1=new Circle_V5();
//		c1.setRad(-10);
//		System.out.println(c1.getRad());//0
//		c1.setRad(5);
//		System.out.println(c1.getRad());
//		System.out.println(Circle_V5.PI);//static variable
//		//could be called direcrly on the class, not the object
//		System.out.println(c1.calculateArea());
//		System.out.println(c1.calculateRound());

		Circle_V6 c1 = new Circle_V6(5);
		
		Circle_V6 c2=new Circle_V6();
		c2.setRad(10);
		
		System.out.println(c1.calculateArea());
		System.out.println(c1.calculateRound());
	}
}
