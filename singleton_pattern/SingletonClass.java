package singleton_pattern;

public class SingletonClass {

	private static SingletonClass instance = new SingletonClass();

	private SingletonClass() {
	}

	public static SingletonClass getInstance() {
		return instance;
	}

	public void printFunction() {
		System.out.println("Singleton working right now!");
	}
}
