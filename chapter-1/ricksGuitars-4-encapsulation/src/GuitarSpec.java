
public class GuitarSpec {
	String model;
	private Builder builder;
	private Type type;
	private Wood topWood, backWood;

	GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
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

	@Override
	public String toString() {
		return "Builder: " + builder.toString() + ", model: " + model.toString()
			+ ", type: " + type.toString() + ", topWood: " + topWood + ", backWood: "
			+ backWood + ")";
	}
}
