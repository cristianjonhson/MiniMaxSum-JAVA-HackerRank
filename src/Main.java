import java.util.Scanner;

public class Main {
    public static void countArray(long[] arr){
        // Calculate the total sum of all 5 numbers
        long totalSum = 0;
        for (long num : arr) {
            totalSum += num;
        }
        // Find the minimum and maximum values from the array
        long minValue = Long.MAX_VALUE;
        long maxValue = Long.MIN_VALUE;

        for (long num : arr) {
            if (num < minValue) {
                minValue = num;
            }
            if (num > maxValue) {
                maxValue = num;
            }
        }
        // The minimum sum is the total sum minus the maximum value
        long minSum = totalSum - maxValue;
        // The maximum sum is the total sum minus the minimum value
        long maxSum = totalSum - minValue;
        // Print the result
        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the five integers
        long[] arr = new long[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextLong();
        }
        countArray(arr);
    }
}
