package test_package1;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("Ironman");
		stack.push("Thor");
		stack.push("Loki");
		
		System.out.println("The Stack: "+stack);
		
		String poppedEle = stack.pop();
		System.out.println("Popped Elecment is: "+ poppedEle);
		System.out.println("Now stack: "+stack);
		
		String topEle = stack.peek();
		System.out.println("Top elemenent is: " +topEle);

	}

}
