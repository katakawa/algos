package com.algos.arraysandstrings;

public class Equilibrium {

    public static void main(String[] args) {
        System.out.println(solution(new int[] {3, 1, 2, 4, 3}));
    }

    private static int solution(int[] arr) {
        int sum = findSum(arr);

        int partA = 0;
        int partB = sum;

        int index = 0;
        int minDiff = Integer.MAX_VALUE;
        int diff = 0;

        for (int i = 0; i < arr.length; i++) {
            partA += arr[i];
            partB -= arr[i];

            diff = partA - partB;
            diff = Math.abs(diff);
            if (diff < minDiff) {
                minDiff = diff;
                index = i;
            }
        }

        //return index + 1;
        return minDiff;
    }

    private static int findSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
