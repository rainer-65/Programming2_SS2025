package lecture03.exercises;

import java.util.Scanner;

public class SquareRoot1 {

	public static void main(String[] args) {
		int number;
		String input; // Input entered on standard input
		Scanner in = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println("Please enter a number: ");
				input = in.nextLine();
				number = Integer.parseInt(input);
				if (number >= 0) {
					double squareRoot = Math.round(1000 * Math.sqrt(number)) / 1000.0; // Rounding for three decimal places
					System.out.println("Square root of " + number + " is " + squareRoot);
				} else
					throw new Exception();

			} catch (Exception e) {
				System.out.println("Invalid Input for Square Root Calculation!");
				System.out.println(e.toString());

			}
		}
		System.out.println("Program terminated, Good Bye!");
		in.close();
	}

}
