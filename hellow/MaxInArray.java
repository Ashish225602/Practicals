package hellow;

public class MaxInArray {
    public static void main(String args[]) {
        // Max in array using advanced loop

        int arr[] = {1, 2, 4, 6, 9, 8};

        int Max = arr[0];
        for (int num : arr) {
            if (num > Max) {
                Max = num;
            }
        }
        
        System.out.println("The max in array : " + Max);
    }
}
