package com.algos.recursion;

public class KadanesAlgo {

    public static void main(String args[]) {
        int arr[] = { 1, 8, -3, -7, 2, 7, -1, 9 };
        System.out.println("Maximum subarray is  " + findMaxSubarray(arr));
        int arrPrice[] = { 23171, 21011, 21123, 21366, 21013, 21367};
        System.out.println("Maximum price delta is  " + findPriceSubarray(arrPrice));
    }


    private static int findMaxSubarray(int[] arr) {
        int globalMax = 0;
        int localMax = 0;
        for (int i = 0; i < arr.length; i++) {
            localMax += arr[i];
            if (localMax < 0) {
                localMax = 0;
            }
            if (localMax > globalMax) {
                globalMax = localMax;
            }
        }
        return globalMax;
    }


    private static int findPriceSubarray(int[] arr) {
        int globalDeltaMax = 0;
        int localDeltaMax = 0;
        for (int i = 1; i < arr.length; i++) {
            int delta = arr[i] - arr[i - 1];
            localDeltaMax += delta;
            if (localDeltaMax < 0) {
                localDeltaMax = 0;
            }
            if (localDeltaMax > globalDeltaMax) {
                globalDeltaMax = localDeltaMax;
            }
        }
        return globalDeltaMax;
    }
}
