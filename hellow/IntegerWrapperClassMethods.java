package hellow;


public class IntegerWrapperClassMethods {
	public static void main(String[] args) {
		// Method 1: parseInt
		String numberStr = "1505";
		int number = Integer.parseInt(numberStr);
		System.out.println("Parsed integer: " + number);
		// Method 2: toString
		int anotherNumber = 500;
		String anotherNumberStr = Integer.toString(anotherNumber);
		System.out.println("Integer to string: " + anotherNumberStr);
		// Method 3: compareTo
		Integer num1 = 100;
		Integer num2 = 200;
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