package oop_concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortingWithStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> numberList = new ArrayList<>();

		numberList.add("Hulk");
		numberList.add("Batman");
		numberList.add("Robin");
		numberList.add("WonderWoman");
		
		List<String> sortedList = numberList.stream().sorted().collect(Collectors.toList());
		
		System.out.println("Super heros alphabetically: "+sortedList);
		
		System.out.println("All the elements of the list: ");
		numberList.stream().forEach(y-> System.out.println("Elements: "+y));
	}

}
