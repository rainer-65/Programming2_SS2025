package lecture03.examples;

import java.util.ArrayList;

public class ThrowExample {

	static ArrayList<Double> list = new ArrayList<Double>();

	public static void main(String[] args) {
		for (int i = 5; i > -2; i--) {
			try {
				calcRoot(i);
			} catch (ArithmeticException e) {
				System.out.println("***Error occured***");
				System.out.println("Cause: " + e.getMessage());
				System.out.println("Exception Type: " + e.toString());
				System.out.print("Where:");
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println("Printing square root values:");
		for (Double value : list) {
			System.out.println(value);
		}
	}

	static double calcRoot(int number) throws ArithmeticException {
		if (number < 0)
			throw new ArithmeticException("Square Root not defined for negative numbers!");
		else {
			list.add(Math.round(1000 * Math.sqrt(number)) / 1000.0);
			return Math.sqrt(number);
		}

	}
}