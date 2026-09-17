package java_Array;

public class TestArray {
public static void main(String[] args) {
	int [] a = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100} ;
	
	System.out.println("index: " + a[2]);
	System.out.println("index: " + a[7]);
	System.out.println("index: " + a[9]);
	System.out.println("index: " + a[0]);
	
	System.out.println("-------------------");
	
	for(int b : a) {
		System.out.print(b + ",");
		
	}
	System.out.println();
	System.out.println("---------------------");
	
	for(int i = 0; i < a.length;i++) {
		System.out.println(i + " = " + a[i]);
	}
}
}
