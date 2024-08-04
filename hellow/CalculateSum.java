package hellow;
import java.util.*;

public class CalculateSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of integers you want to sum: ");
        int N = sc.nextInt();
        int arr[] = new int[N];


        for (int i = 0; i < N; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }

        System.out.println("Sum is: " + sum);

        sc.close();
    }
}
