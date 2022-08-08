package oop_concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> numberList = new ArrayList<>();

		numberList.add("Hulk");
		numberList.add("Batman");
		numberList.add("Robin");

		// making a new arraylist where i will store the square value of each element of
		// the
		List<String> squareList = new ArrayList<>();
		for (String i : numberList) {
			squareList.add(i);

		}
		System.out.println(squareList);
		System.out.println();
//		for(String i : squareList)
//		{
//			System.out.print(i + " ");
//
//		}

		// now i am doing all these thing in one line
		List<String> filterResult = numberList.stream().filter(s -> s.startsWith("B")).collect(Collectors.toList());
		System.out.println("Superhero starting with 'B' : " + filterResult);

	}

}
