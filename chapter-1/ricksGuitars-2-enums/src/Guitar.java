
public class Guitar {
	private String serialNumber, model;
	private Builder builder;
	private Type type;
	private Wood topWood, backWood;
	private double price;
	
	public Guitar(
			String serialNumber, double price, Builder builder,
			String model, Type type, Wood topWood, Wood backWood
			)
	{
		this.serialNumber = serialNumber;
		this.price = price;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
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
	
	public Builder getBuilder() {
		return this.builder;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public Type getType() {
		return this.type;
	}
	
	public Wood getBackWood() {
		return this.backWood;
	}
	
	public Wood getTopWood() {
		return this.topWood;
	}
}
