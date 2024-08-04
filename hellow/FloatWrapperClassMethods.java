package hellow;
public class FloatWrapperClassMethods {
	public static void main(String[] args) {
		// Method 1: parseFloat
		String floatStr = "123.45";
		float parsedFloat = Float.parseFloat(floatStr);
		System.out.println("Parsed float: " + parsedFloat);
		// Method 2: isNaN
		Float nanValue = Float.NaN;
		System.out.println("Is NaN: " + nanValue.isNaN());
		// Method 3: compareTo
		Float num1 = 100.25f;
		Float num2 = 200.50f;
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
