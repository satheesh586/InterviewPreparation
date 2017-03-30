package Arrays.SeperateZerosAndOnes;

import java.util.Scanner;

/**
 * Created by satheesh on 30/3/17.
 */
public class CountApproach {

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
        int count = countZeros(arr);
        copyTheZerosAndOnes(arr, count);
        printArray(arr);
    }

    private static void copyTheZerosAndOnes(int[] arr, int count) {
        for (int index = 0; index < count; index++) {
            arr[index] = 0;
        }
        for (int index = count; index < arr.length; index++) {
            arr[index] = 1;
        }
    }

    private static void printArray(int[] arr) {
        for (int index = 0; index < arr.length; index++) {
                System.out.print(arr[index] + " ");
        }
    }

    private static int countZeros(int[] arr) {
        int count = 0;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == 0) {
                count++;
            }
        }
        return count;
    }
}
