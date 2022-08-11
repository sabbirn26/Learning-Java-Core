package proxy_pattern;

public class ProxyImage implements Image {

	private RealImage realImage;
	private String fileName;

	public ProxyImage(String fileName) {
		// super();
		this.fileName = fileName;
		System.out.println("ProxyImage cons. in work");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		if (realImage == null) {
			realImage = new RealImage(fileName);
		}

		realImage.display();

	}

}
