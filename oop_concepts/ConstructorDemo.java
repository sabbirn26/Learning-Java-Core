package oop_concepts;

public class ConstructorDemo {

	// String name;
	int height, width, depth;
	// String address;

	// constructor number 1
	public ConstructorDemo(int height, int width, int depth) {
		this.height = height;
		this.width = width;
		this.depth = depth;
	}

	public ConstructorDemo(int height, int width) {
		this.height = height;
		this.width = width;
		depth = 10;
	}

	public ConstructorDemo() {
		height = 10;
		width = 10;
		depth = 10;

	}

	public void setHeight(int height) {
		this.height = height;

	}

	public void setWidth(int width) {
		this.width = width;

	}

	public void setDepth(int depth) {
		this.depth = depth;

	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;

	}

	public int getDepth() {
		return depth;
	}

	public int PrintMethod() {
		return height * width * depth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo Cuboid1 = new ConstructorDemo(5, 10, 15);

		ConstructorDemo Cuboid2 = new ConstructorDemo(5, 10);

		ConstructorDemo Cuboid3 = new ConstructorDemo();

		System.out.println("Area of the object1 is: " + Cuboid1.PrintMethod());

		System.out.println("Area of the object2 is: " + Cuboid2.PrintMethod());

		System.out.println("Area of the object3 is: " + Cuboid3.PrintMethod());

	}

}
