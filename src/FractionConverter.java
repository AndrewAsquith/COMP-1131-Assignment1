import java.util.Scanner;

public class FractionConverter {

	public static void main(String[] args) {

		// user supplied numerator and denominator
		int numerator = 0, denominator = 0;

		// user input scanner
		Scanner inputReader = new Scanner(System.in);

		// user supplied non numeric (or invalid) input
		String nonNumericInput;

		// repeat until user inputs "quit"
		// using a labeled loop so we can break all the way out on "quit"
		outerloop: while (true) {

			// booleans to manage inner loop for valid inputs
			boolean numeratorValid = false, denominatorValid = false;

			while (!numeratorValid) {
				System.out.print("Enter the numerator or \"quit\" to exit: ");

				if (inputReader.hasNextInt()) {

					// get the next number from user input
					numerator = inputReader.nextInt();
					// discard any extra input
					inputReader.nextLine();

					numeratorValid = true;

				} else {

					// if the user provided something not recognized as a number
					nonNumericInput = inputReader.nextLine();

					if (nonNumericInput.equals("quit")) {
						// if they typed quit, exit the loops
						break outerloop;
					} else {
						// otherwise repeat their invalid input with a friendly
						// message
						System.out.println("\"" + nonNumericInput + "\" is not a number we can use for numerator.");
					}
				}

			}
			while (!denominatorValid) {
				
				System.out.print("Enter the denominator or \"quit\" to exit: ");
				
				if (inputReader.hasNextInt()) {
					// get the next number from user input
					denominator = inputReader.nextInt();
					// discard any extra input
					inputReader.nextLine();

					//don't allow divide by zero
					if (denominator != 0) {
						denominatorValid = true;
					} else {
						System.out.println("Can't divide by zero.");
					}
				} else {

					// if the user provided something not recognized as a number
					nonNumericInput = inputReader.nextLine();

					if (nonNumericInput.equals("quit")) {
						// if they typed quit, exit the loops
						break outerloop;

					} else {
						// otherwise repeat their invalid input with a friendly
						// message
						System.out.println("\"" + nonNumericInput + "\" is not a number we can use for denominator.");
					}
				}
			}
			double decimalRepresentation = (double) numerator / (double) denominator;
			System.out.println(numerator + "/" + denominator + " is equal to " + decimalRepresentation);
		}
		inputReader.close();
		System.out.println("Goodbye!");
	}

}
