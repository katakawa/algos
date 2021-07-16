package com.algos.prefixsums;

/**
 * The number of times opposite facing cars face each other
 */
public class PassingCars {

    private static  int solve(int[] arr) {
        int[] suffixSum = new int[arr.length + 1];
        int count = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            suffixSum[i] = arr[i] + suffixSum[i + 1];
            if (arr[i] == 0) count += suffixSum[i];
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{0, 1, 0, 1, 1}));
    }
}
