package test_package1;

import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> treeset = new TreeSet<>();
		
		treeset.add("C");
		treeset.add("B");
		treeset.add("A");
		
		System.out.println("Treeset: "+treeset);
		
		System.out.println("If the treeset contains the letter C: "+treeset.contains("C"));
		
		treeset.remove("C");
		
		System.out.println("Treeset: "+treeset);

	}

}
