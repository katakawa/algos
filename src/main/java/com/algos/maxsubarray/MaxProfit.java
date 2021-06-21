package com.algos.maxsubarray;

public class MaxProfit {

    public static void main(String[] args) {
        System.out.println(solve(new int[]{23171, 21011, 21123, 21366, 21013, 21367}));
        System.out.println(Math.ceil(0.01));
    }

    private static int solve(int[] arr) {
        int globalMax = 0;
        int localMax = 0;

        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            localMax += diff;
            localMax = Math.max(localMax, diff);
            globalMax = Math.max(globalMax, localMax);
        }

        return globalMax;
    }
}
