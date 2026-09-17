package java_Array;

public class FindPositionOfAnInt {
public static void main(String[] args) {
	
	int [] a = {10, 20, 30, 40, 50, 60, 70};
	int n = 50;
	int position = -1;
	
	for(int i = 0; i < a.length; i++) {
		if (n == a[i]) {
			position = i;
			System.out.println("Position of: " + n + " = " + position);
		}
	}
	if (position == -1) {
		System.out.println("Position of: " + n + " = " + position);
	}
		
	}
}

