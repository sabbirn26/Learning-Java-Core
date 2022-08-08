package builder_pattern;

public class BuilderClass {

	private String os;
	private int ram;
	private String processor;
	private double displaySize;
	private int batterySize;

//	public BuilderClass(String os2, int ram2, String processor2, double displaySize2, int batterySize2) {
//		// TODO Auto-generated constructor stub
//	}

	public BuilderClass setOs(String os) {
		this.os = os;
		return this;
	}

	public BuilderClass setRam(int ram) {
		this.ram = ram;
		return this;
	}

	public BuilderClass setProcessor(String processor) {
		this.processor = processor;
		return this;
	}

	public BuilderClass setDisplaySize(double displaySize) {
		this.displaySize = displaySize;
		return this;
	}

	public BuilderClass setBatterySize(int batterySize) {
		this.batterySize = batterySize;
		return this;
	}

	public Phone getPhoneInfo() {
		return new Phone(os, ram, processor, displaySize, batterySize);
	}

}
