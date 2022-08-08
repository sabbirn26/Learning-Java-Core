package test_package1;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> treemap = new TreeMap<>();
		
		treemap.put(3, "A");
		treemap.put(2, "B");
		treemap.put(1, "C");
		
		System.out.println(treemap);
	}

}
