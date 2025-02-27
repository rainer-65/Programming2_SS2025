package lecture03.exercises;

import java.util.*;

public class InputMismatchExceptionDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;

		do {
			try {
				System.out.print("Enter an integer: ");
				int number = input.nextInt();
				System.out.println("The number entered is " + number);
				continueInput = false;
			} catch (InputMismatchException ex) {
				input.nextLine();
				System.out.println("Try again. (" + "Incorrect input: an integer is required)");
			}
		} while (continueInput);
		input.close();
	}
}
