package lecture03.examples;

// vgl. http://www.itm.uni-luebeck.de/teaching/ws0607/prog/uebung/Prog-WS0607-Grosse-Uebung-5.pdf?lang=de

public class Fraction {

	Fraction(double numerator, double denominator) throws ArithmeticException {
		if (denominator == 0)
			throw new ArithmeticException("Division by Zero!");
		else
			System.out.println("Numerator / Denominator = " + numerator / denominator);
	}

	public static void main(String[] args) {
		try {
			new Fraction(1,0);
		} catch (Exception e) {
			System.out.println("Exception has occured! " + e.getMessage());
		} finally {
			System.out.println("Here we proceed!");
		}

	}
}