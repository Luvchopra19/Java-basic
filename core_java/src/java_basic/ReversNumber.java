package java_basic;

public class ReversNumber {
public static void main(String[] args) {
	int n = 123;
	int r = 0;
	int revers = 0;
	while(n > 0) {
		r = n % 10;
		revers = (revers * 10) + r;
		n = n/10;
	}
	System.out.println(revers);
}
}
