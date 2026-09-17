package java_basic;

public class TestSwitchCase {
public static void main(String[] args) {
	String day = "Sunday";
	
	switch(day) {
	case("Monday"):
		System.out.println("First Day Of Week");
	break;
	case ("Tuesday"):
		System.out.println("Second Day Of Week");
	break;
	case("Wednesday"):
		System.out.println("Thirld Day Of Week");
	break;
	case("Thursday"):
		System.out.println("Forth Day Of week");
	break;
	case("Friday"):
		System.out.println("Fifth Day Of Week");
		break;
	case("Saturday"):
		System.out.println("Last Day Of Week");
	break;
	default:
		System.out.println("Ajj Chutty Hai");
	}
	}	
}

