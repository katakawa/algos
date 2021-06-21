package com.algos.maxsubarray;

/**
 * Write an efficient program to find the sum of contiguous subarray
 * within a one-dimensional array of numbers that has the largest sum.
 */
public class MaxSubArray {

    public static void main(String[] args) {
        System.out.println((solve(new int[] {-2, -3, 4, -1, -2, 1, 5, -3})));
    }

    private static int solve(int[] arr) {

        int globalMax = 0;
        int localMax = 0;

        for (int i = 0; i < arr.length; i++) {
            localMax += arr[i];
            globalMax = Math.max(globalMax, localMax);
            if (localMax < 0) localMax = 0;
        }

        return globalMax;
    }
}
