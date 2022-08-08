package calculator_project;

public class Subtract implements Operate {
	public Double getResult(Double... numbers) {
		Double sub = numbers[0];
		
		for(Double num : numbers)
		{
			sub -= num;
		}
		
		return sub; 
	}

}
