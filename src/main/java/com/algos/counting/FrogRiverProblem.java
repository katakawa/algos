package com.algos.counting;

import java.util.HashSet;
import java.util.Set;

/**
 * A small frog wants to get to the other side of a river. The frog is currently located at position 0,
 * and wants to get to position X. Leaves fall from a tree onto the surface of the river.
 * You are given a non-empty zero-indexed array A consisting of N integers representing the falling leaves.
 * A[K] represents the position where one leaf falls at time K, measured in seconds.
 * The goal is to find the earliest time when the frog can jump to the other side of the river.
 * The frog can cross only when leaves appear at every position across the river from 1 to X.
 */
public class FrogRiverProblem {

    public static void main(String[] args) {
        System.out.println(findTime(new int[] {1, 3, 1, 4, 2, 3, 5, 4}, 5));
        System.out.println(findTime(new int[] {1, 1, 1}, 1));
        System.out.println(findTime(new int[] {1, 2, 1}, 5));
    }

    private static int findTime(int[] arr, int length) {
        Set<Integer> set = new HashSet<>();
        int sumInSet = 0;
        int max = countLeafs(length);
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
                sumInSet += arr[i];
                if (sumInSet == max) {
                    return i;
                }
            }
        }
        return -1;
    }

    private static int countLeafs(int length) {
        int res = 0;
        for (int i = 1; i <= length; i++) {
            res += i;
        }
        return res;
    }
}
