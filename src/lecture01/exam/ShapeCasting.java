package lecture01.exam;


class Shape extends Object {
}

class Rectangle extends Shape {
}

class Circle extends Shape {
}

class Square2 extends Rectangle {
}

public class ShapeCasting {

    public static void main(String[] args) {
        Shape g1 = new Shape();
        Shape g2 = new Rectangle();
        Shape g3 = new Circle();

        Object o1 = g1; // Line 1
        Circle c1 = (Circle) g3; // Line 2
        Circle c2 = (Circle) g1; // Line 3
        Rectangle r1 = (Square2) g2; // Line 4
        Object o2 = new Rectangle(); // Line 5
        // Circle c3 = g3; // Line 6
        Square2 s1 = (Square2) g2; // Line 7
        // Rectangle r2 = new Object(); // Line 8

    }

}
