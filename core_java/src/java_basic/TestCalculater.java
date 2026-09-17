package java_basic;

import java.util.Scanner;

public class TestCalculater {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter first Value----------");
	int a = sc.nextInt();
	
	System.out.println("Enter Second Value---------");
	int b = sc.nextInt();
	
	System.out.println("Enter any One sing(+, -, *, /, %)");
	String opr = sc.next();
	
	switch(opr) {
	case"+":
		System.out.println("Result: " + (a + b));
		break;
		
	case"-":
		System.out.println("Result: " + (a - b));
		break;
		
	case"*":
		System.out.println("Result: " + (a * b));
		break;
		
	case"/":
		System.out.println("Result: " + (a / b));
		break;
		
	case"%":
		System.out.println("Result: " + (a % b));
		break;
	}
}
}
