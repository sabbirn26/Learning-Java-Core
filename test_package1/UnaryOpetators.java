package test_package1;

public class UnaryOpetators {
	public static void main (String[] args) {
		int result = +1;
		
		System.out.println("Result: "+result);
		
		result--;
		System.out.println("Result: "+result);
		
		result++;
		System.out.println("Result: "+result);
		
		result = -result;
		System.out.println("Result: "+result);
		
		result = +result;
		System.out.println("Result: "+result);
		
		boolean s = false;
		System.out.println("Bool: "+s);
		System.out.println("Bool: "+(!s));
		
		int i = 5;
		System.out.println(i);
		++i;
		System.out.println(i);
		
		System.out.println(++i);
		
		System.out.println(i++);
		
		System.out.println(i);
	}
}
