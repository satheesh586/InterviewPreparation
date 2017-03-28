package Arrays.PairWhoseSumIsX;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by satheesh on 28/3/17.
 */
/*
Question: Find a pair in an array whose sum is equal to given number
* */
public class HashApproach {

    private static boolean isPairExist(Integer[] arr, int sum) {
        HashSet<Integer> integers = new HashSet<>();
        for (Integer input : arr) {
            if (integers.contains(sum - input)) {
                return true;
            }
            integers.add(input);
        }
        return false;
    }

    public static void main(String[] args) {
        int size, index, sum;
        Integer arr[];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of Elements in an array");
        size = scanner.nextInt();
        arr = new Integer[size];
        System.out.println("Enter elements to array");
        for(index = 0; index < size; index++) {
            arr[index] = scanner.nextInt();
        }
        System.out.println("Enter sum value");
        sum = scanner.nextInt();

        if(isPairExist(arr, sum)) {
            System.out.println("\nThe pairs of elements whose sum is" + sum + "found in an array");
        }
        else {
            System.out.println("The pairs of elements whose sum is " + sum + " not found in an array");
        }
    }
}
