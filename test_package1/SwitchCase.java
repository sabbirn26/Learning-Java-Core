package test_package1;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month = 2;
		
		String monthString;
		
		switch (month) {
		case 1:
			monthString = "January";
			break;
			
		case 2:
			monthString = "February";
			 break;
		default:
			monthString = "Invalid";
			break;
		}
		
		System.out.println("Case Month: " +monthString);
	}

}
