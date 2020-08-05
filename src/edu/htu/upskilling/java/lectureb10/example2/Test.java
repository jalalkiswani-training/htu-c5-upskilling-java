package edu.htu.upskilling.java.lectureb10.example2;

public class Test {
	public static void main(String[] args) {
//		DrinkMaker dm=new DrinkMaker();
//		dm.setSugar(100);
//		dm.setWater(500);
//		
//		dm.makeDrink();
		CoffeeMaker cm=new CoffeeMaker();
		cm.setCoffee(100);
		cm.setWater(100);
		cm.setSugar(50);
		cm.makeDrink();
		System.out.println("====================");
		TeaMaker tm=new TeaMaker();
		tm.setSugar(100);
		tm.setTea(5);
		tm.setWater(1000);
		
		tm.makeDrink();
		
		
	}
}
