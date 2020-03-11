
public abstract class Color {
	private String color;

	public Color(String color) {
		super();
		this.color = color;
	}

	public abstract void select();

	public abstract void deselect();

	public String getColor() {
		return color;
	}

	protected void setColor(String color) {
		this.color = color;
	}
}
