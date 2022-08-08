package builder_pattern;

public class Phone {
	private String os;
	private int ram;
	private String processor;
	private double displaySize;
	private int batterySize;

	public Phone(String os, int ram, String processor, double displaySize, int batterySize) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.displaySize = displaySize;
		this.batterySize = batterySize;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", displaySize=" + displaySize
				+ ", batterySize=" + batterySize + "]";
	}

}
