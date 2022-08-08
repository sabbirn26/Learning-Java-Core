package test_package1;

///import java.util.Iterator;

public class EnForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//normal for loop
		for(int i =1; i<=10; i++)
		{
			System.out.println("Print: "+i);
		
		}
		
		//enhanced for loop
		int [] numbers = {1,2,3,4,5,6,7,8,9,0};
		
		for(int item: numbers)
		{
			System.out.println("Count is: " +item);
		}
	}
}

