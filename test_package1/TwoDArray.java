package test_package1;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr;
		arr = new int[5]; // here 3 is the size of the array

		arr[0] = 1000;
		arr[1] = 2000;
		arr[2] = 3000;
		arr[3] = 4000;
		arr[4] = 5000;
		//arr[2] = 2;

		System.out.println(arr);// will print the memory print location
		System.out.println(arr[0]); // will print what's in the index 1
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

	}

}
