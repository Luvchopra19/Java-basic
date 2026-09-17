package java_Array;

public class TestCharArray {
public static void main(String[] args) {
	char [] alfa = {'a', 'b', 'c', 'd',};
	
	System.out.println("Simpel Fome: " + alfa[0] + "," + alfa[1] + "," + alfa[2] + "," + alfa[3]);
	System.out.println("-------------------------");
	
	for(int i = 0;i < alfa.length;i++) {
		System.out.println(i + " = " + alfa[i]);// from for loop
	}
	System.out.println("-------------------------");
	for(char chara : alfa) {
		System.out.print(chara + ",");//from foreach loop
	}
}
}
