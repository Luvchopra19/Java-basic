package java_basic;

public class PrimeNumber {
public static void main(String[] args) {
	int n = 7;
	int count = 0;
	for (int i = 1;i <= n;i++) {
		if(n % i == 0) {
			count++;
		}
	}
	System.out.println(count);
	if (count == 2) {
		System.out.println(n + " is Prime Number");
	}else {
		System.out.println(n + " is Not Prime Number");
	}
}
}
