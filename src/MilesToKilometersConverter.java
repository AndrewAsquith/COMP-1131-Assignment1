import java.util.Scanner;

public class MilesToKilometersConverter {

	final private static double CONVERSION_FACTOR = 1.60935;

	public static void main(String[] args) {

		//user supplied number of miles to convert
		double milesToConvert;

		//user input scanner
		Scanner inputReader = new Scanner(System.in);

		
		
		
		//user supplied non numeric (or invalid) input
		String nonNumericInput;

		//repeat until user inputs "quit"
		while (true) {

			System.out.print("Enter the number of miles or \"quit\" to exit: ");

			if (inputReader.hasNextDouble()) {

				//get the next number from user input
				milesToConvert = inputReader.nextDouble();
				//discard any extra input
				inputReader.nextLine();
				//multiply the two values and display the result with a nice message
				double kilometers = milesToConvert * CONVERSION_FACTOR;
				System.out.println(milesToConvert + " miles is equal to " + kilometers + " kilometers.");

			} else {

				//if the user provided something not recognized as a number
				nonNumericInput = inputReader.nextLine();
				
				if (nonNumericInput.equals("quit")) {
					//if they typed quit, exit the loop
					break;				
				} else {
					//otherwise repeat their invalid input with a friendly message
					System.out.println("\"" + nonNumericInput + "\" is not a number we can convert.");
				}
				
			}		
		}
		inputReader.close();
		System.out.println("Goodbye!");
	}

}
