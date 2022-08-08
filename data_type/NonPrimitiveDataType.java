
public class NonPrimitiveDataType {
	public static void main(String args[]) {
		String str = "FirstDay";
		System.out.println("String: " + str);

		String str1 = new String("At");
		System.out.println("Another String: " + str1);

		int arr[];
		arr = new int[3]; // here 3 is the size of the array

		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;

		System.out.println(arr);// will print the memory print location
		System.out.println(arr[1]); // will print what's in the index 1

	}
}
