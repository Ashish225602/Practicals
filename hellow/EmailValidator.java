package hellow;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class EmailValidator {
	// Regular expression for validating email addresses
	private static final String EMAIL_REGEX = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Input email address
		System.out.print("Enter an email address to validate: ");
		String email = scanner.nextLine();
		// Validate email address
		if (isValidEmail(email)) {
			System.out.println("The email address is valid.");
		} else {
			System.out.println("The email address is invalid.");
		}
		scanner.close();
	}
	// Method to validate email address using regex
	public static boolean isValidEmail(String email) {
		Pattern pattern = Pattern.compile(EMAIL_REGEX);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
}