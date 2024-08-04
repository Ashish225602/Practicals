package hellow;


import java.util.Arrays;
public class SortArrays {
	public static void main(String[] args) {
		// Integer array
		int[] intArray = {8, 4, 3, 5, 6};
		// String array
		String[] strArray = {"C", "O", "I", "P", "U"};
		// Sort the integer array
		Arrays.sort(intArray);
		// Sort the string array
		Arrays.sort(strArray);
		// Print sorted integer array
		System.out.print("Sorted integers values is : ");
		for (int num : intArray) {
			System.out.print(num + " ");
		}
		System.out.println();
		// Print sorted string array
		System.out.print("Sorted strings values is: ");
		for (String str : strArray) {
			System.out.print(str + " ");
		}
	}
}