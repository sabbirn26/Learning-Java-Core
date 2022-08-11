package proxy_pattern;

public class ProxyPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Image image = new ProxyImage("ConfusedMeme.jpg");

		image.display();

		System.out.println("");

		image.display();

	}

}
