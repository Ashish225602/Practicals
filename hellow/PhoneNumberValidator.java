package hellow;

import java.util.Scanner;
import java.util.regex.Pattern;
public class PhoneNumberValidator {
	// Regular expression for validating phone numbers
	private static final Pattern PHONE_PATTERN = Pattern.compile("^\\(\\d{3}\\)\\d{3}-\\d{4}$");
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Input phone number
		System.out.print("Enter a phone number to validate (format: (xxx) xxxxxxx): ");
		String phoneNumber = scanner.nextLine();
		// Validate phone number and print result
		if (PHONE_PATTERN.matcher(phoneNumber).matches()) {
			System.out.println("The phone number is valid.");
		} else {
			System.out.println("The phone number is invalid.");
		}
		scanner.close();
	}
}