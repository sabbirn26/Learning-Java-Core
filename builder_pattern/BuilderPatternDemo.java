package builder_pattern;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone p = new BuilderClass().setOs("Android").setRam(8).getPhoneInfo();
		System.out.println("The Phone Info(s) Are: " + "\n" + p);

	}

}
