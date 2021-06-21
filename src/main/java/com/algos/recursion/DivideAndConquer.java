package com.algos.recursion;

/**
 * Maximum Subarray Sum using Divide and Conquer algorithm
 */
public class DivideAndConquer {


    public static void main(String[] args) {
        int arr[] = { 50, -1_000, 40, 80, -1_000 };
        int n = arr.length;
        int max_sum = maxSubArraySum(arr, 0, n - 1);

        System.out.println("Maximum contiguous sum is " + max_sum);
    }

    /* Driver program to test maxSubArraySum */
    // Find the maximum possible sum in arr[]
    // such that arr[m] is part of it
    // Returns sum of maxium sum subarray
    // in aa[l..h]
    static int maxSubArraySum(int arr[], int l, int h) {
        // Base Case: Only one element
        if (l == h) return arr[l];

        // Find middle point
        int m = (l + h) / 2;

        /* Return maximum of following three
        possible cases:
        a) Maximum subarray sum in left half
        b) Maximum subarray sum in right half
        c) Maximum subarray sum such that the
        subarray crosses the midpoint */
        int lowMid = maxSubArraySum(arr, l, m);
        int midHigh = maxSubArraySum(arr, m + 1, h);
        int maxCrossing = maxCrossingSum(arr, l, m, h);
        return Math.max(
                        Math.max(lowMid, midHigh),
                        maxCrossing);
    }

    static int maxCrossingSum(int[] arr, int low, int middle, int high) {
        // Include elements on left of mid.
        int sum = 0;
        int left_sum = Integer.MIN_VALUE;
        for (int i = middle; i >= low; i--) {
            sum = sum + arr[i];
            if (sum > left_sum) left_sum = sum;
        }

        // Include elements on right of mid
        sum = 0;
        int right_sum = Integer.MIN_VALUE;
        for (int i = middle + 1; i <= high; i++) {
            sum = sum + arr[i];
            if (sum > right_sum) right_sum = sum;
        }

        // Return sum of elements on left
        // and right of mid
        // returning only left_sum + right_sum will fail for
        // [-2, 1]
        return Math.max(left_sum + right_sum, Math.max(left_sum, right_sum));
    }
}