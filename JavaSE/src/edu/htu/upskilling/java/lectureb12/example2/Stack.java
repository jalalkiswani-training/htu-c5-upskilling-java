package edu.htu.upskilling.java.lectureb12.example2;

//First in Last out
//Last in first out
public class Stack {
	String []arr=new String[100];
	int lastIndex=0;
	
	public void push(String number) {
		arr[lastIndex]=number;
		lastIndex++;
	}
	
	public String pop() {
		if(lastIndex==0) {
			return null;
		}
		lastIndex--;
		return arr[lastIndex];
	}

	public int size() {
		return lastIndex;
	}
}
