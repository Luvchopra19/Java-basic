package java_Array;

public class NoteCounter {
	public static void main(String[] args) {
		int amount = 6420;
		int count = 0;
		int [] note = {500, 200, 100, 50, 20, 10};
		
		for(int monny : note) {
			count = amount/monny;
			if(count > 0) {
				System.out.println("total note of " + monny + " is: " + count);
			}
			amount = amount % monny;
		}
	}
}