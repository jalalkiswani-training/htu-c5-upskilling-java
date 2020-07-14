package edu.htu.upskilling.java.lecture2;

import java.util.Scanner;

public class SwitchCalculator {
public static void main(String[] args) {
	Scanner s= new Scanner (System.in);
	int n1=s.nextInt();
	int n2= s.nextInt();
	int op=s.nextInt();
	System.out.println("1,5,6  for addition, 2 for subtraction, 3 for division , 4 for multiplaction");
	
	switch (op) {
	case 1:
	case 5:
	case 6:	System.out.println(n1+n2);
	break;
	case 2: System.out.println(n1-n2);
	break;
	case 3:System.out.println(n1/n2);
	break;
	case 4:System.out.println(n1*n2);
	break;
	
	
	}
	
}

}
