package java_basic;

public class PalindromeNumber {
public static void main(String[] args) {
	int temp = 121;
	int n = temp;
	int r = 0;
	int revers = 0;
	
	while(n > 0) {
	r = n % 10;
	revers = (revers * 10) + r;
	n = n/10;
	}
	System.out.println(revers);
	
	if(temp == revers) {
	System.out.println(temp + " is palindrome Number");
}else {
	System.out.println(temp + " is not palindrome Number");
}
}
}
