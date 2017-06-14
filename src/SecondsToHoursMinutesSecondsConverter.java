//==============================================
// Andrew Asquith
// COMP 1131
// Assignment 1 
// Seconds to Friendly Time Converter
//
// This program takes a user provided number of seconds and 
// converts it to hours, minutes and seconds, displaying the result.
// 
//==============================================

//import the Scanner class
import java.util.Scanner;

public class SecondsToHoursMinutesSecondsConverter {

	private final static int SECONDS_IN_MINUTE = 60;
	private final static int SECONDS_IN_HOUR = 3600;

	public static void main(String[] args) {

		// user provided number of seconds to convert
		int secondsToConvert;

		// user provided non numeric (or invalid) value
		String nonNumericInput;

		// user input scanner from std in
		Scanner inputReader = new Scanner(System.in);

		// run until user enters "quit"
		while (true) {

			System.out.print("Enter the number of seconds or \"quit\" to exit: ");

			if (inputReader.hasNextInt()) {

				// read the number of seconds to convert
				secondsToConvert = inputReader.nextInt();

				// discard any extra input
				inputReader.nextLine();

				// whole number of hours in input
				int hoursInInput = secondsToConvert / SECONDS_IN_HOUR;

				// remaining number of seconds after accounting for hours
				int remainingTime = secondsToConvert % SECONDS_IN_HOUR;

				// remaining number of seconds expressed as minutes
				int remainingMinutesInInput = remainingTime / SECONDS_IN_MINUTE;

				// remaining number of seconds after accounting for hours and
				// minutes
				int remainingSecondsInInput = remainingTime % SECONDS_IN_MINUTE;

				// print out the results
				System.out.print(secondsToConvert + " seconds is equal to: ");
				System.out.print(hoursInInput);

				// print singular or plural depending on situation
				if (hoursInInput == 1) {
					System.out.print(" hour, ");
				} else {
					System.out.print(" hours, ");
				}

				System.out.print(remainingMinutesInInput);
				if (remainingMinutesInInput == 1) {
					System.out.print(" minute and ");
				} else {
					System.out.print(" minutes and ");
				}

				System.out.print(remainingSecondsInInput);
				if (remainingSecondsInInput == 1) {
					System.out.println(" second.");
				} else {
					System.out.println(" seconds.");
				}

			} else {

				// user did not supply something that could be converted
				nonNumericInput = inputReader.nextLine();

				if (nonNumericInput.equals("quit")) {
					// if it was "quit" end the loop
					break;
				} else {
					// otherwise repeat it back with a message
					System.out.println("\"" + nonNumericInput + "\" is not a number that can be converted.");
				}
			}
		}
		// close the input stream and say goodbye
		inputReader.close();
		System.out.println("Goodbye!");
	}
}