package java_basic;

public class PrintFiveRandomNumber {
public static void main(String[] args) {

	for(int i = 0;i <= 5;i++) {
		System.out.println(Math.random() * 100);
	}
}
}
