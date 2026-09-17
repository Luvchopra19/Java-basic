package java_Array;

public class SecondLargestNumber {
public static void main(String[] args) {
	int [] a = {10, 20, 30, 150, 200, 40, 50, 60};
	int largestNo = a[0];

	for(int i : a) {
		if (i > largestNo) {
			largestNo = i;
			
		}
	}
	
	System.out.println("Largest No is: " + largestNo);
	int secondLargestNo = 0;
	for(int i : a) {
		if(i > secondLargestNo  && i < largestNo) {
			secondLargestNo = i;
		}
		
	}
	System.out.println("Second Largest Number is: " + secondLargestNo);
}
}

