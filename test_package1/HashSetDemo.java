package test_package1;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> hashset = new HashSet<>();

		hashset.add("A");

		hashset.add("B");

		hashset.add("C");

		hashset.add("C");

		System.out.println(hashset);

		System.out.println("List contains C or not? " + hashset.contains("C"));

		boolean there = hashset.contains("C");

		if (there == true) {
			System.out.println("YO! there is a C in the Hashset!");
		} else {
			System.out.println("Nahh no C here mate!");

		}
		
		hashset.remove("A");
		
		
		for (String item: hashset)
		{
			System.out.print(item+" ");
		}

	}

}
