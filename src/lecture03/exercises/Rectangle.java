package lecture03.exercises;

// Define Rectangle, subclass of Shape

public class Rectangle extends Shape implements Comparable<Rectangle> {
	// Private member variables
	private int length;
	private int width;

	// Constructor
	public Rectangle(String color, int length, int width) throws RectangleDataException {
		super(color);
		if ((length > 0) && (width > 0)) {
			this.length = length;
			this.width = width;
		} else
			throw new RectangleDataException("Invalid Data for creating a rectangle!");
	}

	// getter and setter-Methods
	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle of length=" + length + " and width=" + width + ", subclass of " + super.toString();
	}

	@Override
	public double getArea() {
		return length * width;
	}

	@Override
	public double getCircumference() {
		return 2 * length + 2 * width;
	}

	// Overriding equals
	// Test whether the rectangles have identical values
	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (o == this)
			return true;
		Rectangle otherRectangle = (Rectangle) o;
		return this.getColor().equals(otherRectangle.getColor()) && this.length == otherRectangle.length
				&& this.width == otherRectangle.width;
	}

	// 1. Solution
	// public int compareTo(Rectangle other) {
	// return (int) (this.getArea() - other.getArea());
	// }

	// 2. Solution
	// public int compareTo(Rectangle other) {
	// if (this.getArea() > other.getArea())
	// return 1;
	// else if (this.getArea() < other.getArea())
	// return -1;
	// else
	// return 0;
	// }

	// 3. Two Sorting Criteria (area and color)
	public int compareTo(Rectangle other) {
		int result = (int) (this.getArea() - other.getArea());
		if (result == 0)
			result = this.getColor().compareTo(other.getColor());
		return result;
	}

}