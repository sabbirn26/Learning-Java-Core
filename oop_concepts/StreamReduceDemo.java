package oop_concepts;

import java.util.ArrayList;
import java.util.List;

public class StreamReduceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numberList = new ArrayList<>();

		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		numberList.add(40);
		//there are 3 major thing in a reduce method(Identity, Accumulator, combiner) 
		int sum = numberList.stream().reduce(0,(ans,i)-> ans+i);//what is happening?
		
		System.out.println("Summation of the numberList is: "+sum);

	}

}
