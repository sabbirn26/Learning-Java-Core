package test_package1;

public class NormalAndNestedIfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v = 55;
		if(v < 60)
		{
			System.out.println("Less than 60");
		}
		
		if (v < 60)
		{
			if(v > 50)
			{
				System.out.println("Less than 60 and greater than 50");
			}
		}

	}

}
