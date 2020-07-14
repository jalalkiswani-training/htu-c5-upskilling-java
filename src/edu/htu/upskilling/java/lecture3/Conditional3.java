package edu.htu.upskilling.java.lecture3;

public class Conditional3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// variable= Expression1 ? Expression 2 : Expression 3
		
		
		int num=8;
		String msg="";
		if(num >10){
			msg="Number is greater than 10";
		}
		else {
			msg="Number is not greater than 10";
		}
		
		System.out.println(msg);
		String msg2= num>10 ?"Number is greater than 10" :"Number is not greater than 10";
		System.out.println(msg2);
	}

}
