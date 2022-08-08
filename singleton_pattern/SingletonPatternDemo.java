package singleton_pattern;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// SingleObject object = new SingleObject();
		// can't create an object like this

		SingletonClass object = SingletonClass.getInstance();

		object.printFunction();

	}

}
