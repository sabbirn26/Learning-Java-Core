package test_package1;

import java.util.*;
import java.util.Map.Entry;

//import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> map = new HashMap<>();

		map.put("a", 10);
		map.put("b", 20);
		map.put("c", 30);

		System.out.println("Size of the map is: " + map.size());

		System.out.println("The map is: " + map);

		if (map.containsKey("a")) {
			Integer a = map.get("a");
			System.out.println("Value of the key: " + "\"a\" is: " + a);
		}

		// en for loop
		for (String key : map.keySet()) {
			System.out.println("Key: "+ key +", value: " +map.get(key));

		}
		for(Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key: "+ entry.getKey() +",Value: "+ entry.getValue());
		}

	}

}
