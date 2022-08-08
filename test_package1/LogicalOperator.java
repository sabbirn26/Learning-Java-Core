package test_package1;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value1 = 1; 
		int value2 = 2;
		
		if(value1 == 1 && value2 ==2)
		{
			System.out.println("Two value is equal condition 1");
		}
		if(value1 != value2 || value1<value2)
		{
			System.out.println("Not same ! Condition 2");
		}
		
		if(value1 > value2)
		{
			System.out.println("Value1 is biggest!");
		}
		if(value1 < value2)
		{
			System.out.println("Value2 is biggest!");
		}

	}

}
