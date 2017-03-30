package Arrays.SeperateZerosAndOnes;

import java.util.Scanner;

/**
 * Created by satheesh on 30/3/17.
 */
/*
Seperate 0's and 1's in an array
Time complexity: O(n)
Space Complexity: O(1)
* */
public class Seperate0sAnd1s {

    private static void seperate0and1(int arr[], int size)
    {
        int leftIndex = 0, rightIndex = size-1;
        while( leftIndex < rightIndex)
        {
            while((arr[leftIndex] == 0) && (leftIndex < rightIndex))
                leftIndex++;
            while((arr[rightIndex] == 1) && (rightIndex > leftIndex))
                rightIndex--;
            if(leftIndex < rightIndex)
            {
                arr[leftIndex++] = 0;
                arr[rightIndex--] = 1;
            }
        }
    }

    private static void printArray(int arr[], int size)
    {
        for(int index = 0; index < size; index++)
            System.out.print(arr[index] + " ");
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
        seperate0and1(arr, size);
        printArray(arr, size);
    }
}
