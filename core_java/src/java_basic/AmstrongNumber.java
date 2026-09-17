package java_basic;

public class AmstrongNumber {
public static void main(String[] args) {
	int temp = 153;
	int n = temp;
	int r = 0;
	int Ams = 0;
	while (n > 0) {
		r = n % 10;
		Ams = Ams + r * r * r;
		n = n/10;
	}
	System.out.println(Ams);
	if (temp == Ams) {
		System.out.println(Ams + " is Amstrong Number");
	}else {
		System.out.println(Ams + " is Not Amstrong Number");
	}
}
}
