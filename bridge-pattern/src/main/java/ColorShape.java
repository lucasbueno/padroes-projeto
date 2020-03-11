
public abstract class ColorShape {
	private Color color;
	private Shape shape;

	public ColorShape(Color color, Shape shape) {
		super();
		this.color = color;
		this.shape = shape;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

}
