package lecture03.exercises;

import java.util.Scanner;

public class SquareRoot2 {

	public static void main(String[] args) {
		int number;
		Scanner in = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println("Please enter a number: ");
				number = in.nextInt();
				if (number >= 0) {
					double squareRoot = Math.round(1000 * Math.sqrt(number)) / 1000.0; // Rounding for three decimal places
					System.out.println("Square root of " + number + " is " + squareRoot);
				} else
					throw new Exception();

			} catch (Exception e) {
				in.nextLine();
				System.out.println("Invalid Input for Square Root Calculation!");
				System.out.println(e.toString());
			}
		}
		System.out.println("Program terminated, Good Bye!");
		in.close();
	}

}
