package oop_concepts;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numberList = new ArrayList<>();

		numberList.add(10);
		numberList.add(20);
		numberList.add(30);

		//making a new arraylist where i will store the square value of each element of the 
		List<Integer> squareList = new ArrayList<>();
		for (Integer i : numberList) {
			squareList.add(i * i);
		}
		for(Integer i : squareList)
		{
			System.out.print(i + " ");

		}
		
		
		//now i am doing all these thing in one line
		List<Integer> squareList2 = numberList.stream().map(x-> x*x).collect(Collectors.toList());
		System.out.println("List of the squared number: " +squareList2);
	}

}
