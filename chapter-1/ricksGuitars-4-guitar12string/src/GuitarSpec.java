
public class GuitarSpec {
	String model;
	private Builder builder;
	private Type type;
	private Wood topWood, backWood;
	private int numStrings;

	public GuitarSpec(Builder builder, String model, Type type, int numStrings,
		Wood backWood, Wood topWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.numStrings = numStrings;
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

	public int getNumStrings() {
		return numStrings;
	}

	@Override
	public String toString() {
		return "Builder: " + builder.toString() + ", model: " + model.toString()
			+ ", type: " + type.toString() + ", topWood: " + topWood + ", backWood: "
			+ backWood + ")";
	}

	public boolean matches(GuitarSpec otherSpec) {
		if (this.builder != otherSpec.getBuilder())
			return false;
		String model = this.getModel().toLowerCase();
		if ((model != null) && (!model.equals(""))
			&& (!model.equals(otherSpec.getModel().toLowerCase())))
			return false;
		if (this.type != otherSpec.getType())
			return false;
		if (this.numStrings != otherSpec.getNumStrings())
			return false;
		if (this.backWood != otherSpec.getBackWood())
			return false;
		if (this.topWood != otherSpec.getTopWood())
			return false;
		return true;
	}
}
