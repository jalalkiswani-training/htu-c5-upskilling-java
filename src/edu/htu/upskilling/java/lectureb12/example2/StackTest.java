package edu.htu.upskilling.java.lectureb12.example2;

public class StackTest {
	public static void main(String[] args) {		
		Stack s=new Stack();
		s.push("Ata");
		s.push("Kamal");
		s.push("Essa");
		
		System.out.println(s.size());//3
		System.out.println(s.pop());//Essa
		System.out.println(s.size());//2
		System.out.println(s.pop());//Kamal
		System.out.println(s.size());//1
		System.out.println(s.pop());//Ata
		System.out.println(s.size());//0
		System.out.println(s.pop());//null
		
	}
}
