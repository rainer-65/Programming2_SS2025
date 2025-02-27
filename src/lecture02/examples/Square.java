package lecture02.examples;

public class Square extends Rectangle {
    public Square(String color, double sideLength) {
        super(color, sideLength, sideLength); // Use constructor of Rectangle
    }

    // Getter using Rectangle's getLength()
    public double getSideLength() {
        return getLength(); // Use inherited getter
    }

    // Setter using Rectangle's setLength() and setWidth()
    public void setSideLength(double sideLength) {
        setLength(sideLength); // Update length
        setWidth(sideLength);  // Ensure width is the same
    }

    @Override
    public String toString() {
        return "Square of side length=" + getLength() + ", subclass of " + super.toString();
    }

    @Override
    public double getArea() {
        return getLength() * getLength(); // Using getter instead of direct access
    }

    @Override
    public double getCircumference() {
        return 4 * getLength(); // Using getter instead of direct access
    }
}
