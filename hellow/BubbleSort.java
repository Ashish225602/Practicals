package hellow;
public class BubbleSort {
public static void main(String[] args) {
// Array of integers to be sorted
int[] intArray = {8, 4, 3, 5, 6, 7, 9};
// Perform bubble sort
bubbleSort(intArray);
// Print the sorted array
System.out.print("Sorted array: ");
for (int num : intArray) {
System.out.print(num + " ");
}
}
// Bubble sort algorithm
public static void bubbleSort(int[] array) {
int n = array.length;
boolean swapped;
// Traverse through all elements in the array
for (int i = 0; i < n - 1; i++) {
swapped = false;
// Last i elements are already sorted, no need to check them
for (int j = 0; j < n - 1 - i; j++) {
// Swap if the current element is greater than next element
if (array[j] > array[j + 1]) {
int temp = array[j];
array[j] = array[j + 1];
array[j + 1] = temp;
swapped = true;
}
}
// If no two elements were swapped in inner loop,the array is sorted
if (!swapped) break;
}
}
}
