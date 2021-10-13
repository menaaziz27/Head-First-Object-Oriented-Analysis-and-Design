
public class Guitar {
	private String serialNumber;
	private double price;
	GuitarSpec spec;

	public Guitar(String serialNumber, double price, Builder builder, String model,
		Type type, Wood topWood, Wood backWood) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = new GuitarSpec(builder, model, type, topWood, backWood);
		System.out.println(this);
	}

	// Code of Object.toString()
	@Override
	public String toString() {
		return "serialNum: " + serialNumber + ", price: " + price + ", spec => ("
			+ this.spec;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return this.price;
	}

	public GuitarSpec getSpec() {
		return spec;
	}
}
