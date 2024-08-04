package hellow;

public class DoubleWrapperClassMethods {
	public static void main(String[] args) {
		// Method 1: parseDouble
		String doubleStr = "123.45";
		double number = Double.parseDouble(doubleStr);
		System.out.println("Parsed double: " + number);
		// Method 2: toString
		double anotherNumber = 456.78;
		String anotherNumberStr = Double.toString(anotherNumber);
		System.out.println("Double to string: " + anotherNumberStr);
		// Method 3: compareTo
		Double num1 = 100.25;
		Double num2 = 200.50;
		int comparisonResult = num1.compareTo(num2);
		if (comparisonResult < 0) {
			System.out.println(num1 + " is less than " + num2);
		} else if (comparisonResult > 0) {
			System.out.println(num1 + " is greater than " + num2);
		} else {
			System.out.println(num1 + " is equal to " + num2);
		}
	}
}