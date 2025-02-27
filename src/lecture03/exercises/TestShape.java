package lecture03.exercises;

//	A test driver program for Shape and its subclasses

public class TestShape {
	public static void main(String[] args) {

		// Try to create rectangles
		try {
			Rectangle s1 = new Rectangle("red", -10, 1);
			System.out.println(s1.toString());
			System.out.println("Area is " + s1.getArea());
			System.out.println("Circumference is " + s1.getCircumference());
			System.out.println();
		} catch (RectangleDataException e) {
			e.printStackTrace();
		}

		try {
			Rectangle s2 = new Rectangle("green", 5, 5);
			System.out.println(s2.toString());
			System.out.println("Area is " + s2.getArea());
			System.out.println("Circumference is " + s2.getCircumference());
			System.out.println();
		} catch (RectangleDataException e) {
			e.printStackTrace();
		}

	}

}
