package java_basic;

public class Swaping {
public static void main(String[] args) {
	int a = 15;
	int b = 10;
	System.out.println("Befor Swaping| a: " + a);
	System.out.println("Befor Swaping| b: " + b);
	System.out.println("____________________");
	a = a - b;
	b = b + a;
	a = b - a;
	System.out.println("After Swaping 1| a : " + a);
	System.out.println("After Swaping 1| b : " + b);
	System.out.println("----------------------");
	int c = 0;
	c = a;
	a = b;
	b = c;
	System.out.println("After Swaping 2| a : " + a);
	System.out.println("After Swaping 2| b : " + b);
}
}
