package proxy_pattern;

public class RealImage implements Image {

	private String fileName;

	public RealImage(String fileName) {
		// super();
		this.fileName = fileName;
		LoadFormDisk(fileName);
		System.out.println("RealImage constructor in work!");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

		System.out.println("Displaying: " + fileName);
		System.out.println("display in RealImage");

	}

	void LoadFormDisk(String fileName) {
		System.out.println("Loading: " + fileName);
		System.out.println("LoadFromDisk Method");
	}

}
