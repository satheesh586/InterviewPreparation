package Arrays.MaximumDifferenceSmallAppearsLater;

import java.util.Scanner;

/**
 * Created by satheesh on 28/3/17.
 */
public class MDSAL {

    public static void main(String[] args) {
        int size, index;
        Integer arr[];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of Elements in an array");
        size = scanner.nextInt();
        arr = new Integer[size];
        System.out.println("Enter elements to array");
        for(index = 0; index < size; index++) {
            arr[index] = scanner.nextInt();
        }
        System.out.println(getTheMaximumDifference(arr));
    }

    private static int getTheMaximumDifference(Integer[] arr) {
        int index;
        int minEleSoFar = arr[0], maxDiffSoFar = -1, currentDiff;
        for (index = 1; index < arr.length; index++) {
            if (minEleSoFar > arr[index]) {
                minEleSoFar = arr[index];
                continue;
            }
            currentDiff = arr[index] - minEleSoFar;
            if (currentDiff > maxDiffSoFar) {
                maxDiffSoFar = currentDiff;
            }
        }
        return maxDiffSoFar;
    }
}
