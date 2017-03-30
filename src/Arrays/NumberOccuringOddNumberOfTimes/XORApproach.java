package Arrays.NumberOccuringOddNumberOfTimes;

import java.util.Scanner;

/**
 * Created by satheesh on 30/3/17.
 */
/*
Given an array of positive integers. All numbers occur even number of times except one number
which occurs odd number of times.
Time Complexity : O(n)
Space Complexity: O(1)
* */
public class XORApproach {

    private static int getOddOccurrenceNumber(int arr[], int size) {
        int index, result = 0;
        for(index = 0; index < size; index++)
            result = result ^ arr[index];
        return result;
    }

    public static void main(String[] args) {
        int size, index;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of Elements in an array");
        size = scanner.nextInt();
        arr = new int[size];
        System.out.println("Enter elements to array");
        for(index = 0; index < size; index++) {
            arr[index] = scanner.nextInt();
        }
        System.out.println(getOddOccurrenceNumber(arr, size));
    }
}
