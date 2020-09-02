package edu.htu.upskilling.java.lecture9.oop;

import java.awt.Color;

public class CarTest {
	public static void main(String[] args) {
		Brand mercedes=new Brand();
		mercedes.setName("Mercedes");
		mercedes.setWebsite("http://mecedes.com");
		mercedes.setPhone("123456789");
		
		Car c1=new Car();
		c1.setBrand(mercedes);
		c1.setYear(2001);
		c1.setColor(Color.LIGHT_GRAY);
		
		Car c2=new Car();
		c2.setBrand(mercedes);
		c2.setYear(2020);
		c2.setColor(Color.WHITE);		
	}
}
