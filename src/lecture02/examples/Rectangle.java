package lecture02.examples;

//Define Rectangle, subclass of Shape
public class Rectangle extends Shape {
    // Private member variables
    private double length;
    private double width;

    // Constructor
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    // getter and setter-Methods
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
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
        if (o == null) return false;
        if (o == this) return true;
        if (!o.getClass().equals(this.getClass())) return false;
        Rectangle otherRectangle = (Rectangle) o;
        return this.getColor().equals(otherRectangle.getColor()) && this.length == otherRectangle.length && this.width == otherRectangle.width;
    }

}
