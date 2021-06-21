package com.algos.counting;

import java.util.Arrays;

/**
 * You are given a list of n-1 integers and these integers are in the range of 1 to n.
 * There are no duplicates in the list. One of the integers is missing in the list.
 * Write an efficient code to find the missing integer.
 */
public class MissingInteger {

    private static  int solution(int[] arr) {
        long actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        long maxNumber = arr.length + 1;
        long expectedSum = (maxNumber * (maxNumber + 1) / 2);

        return (int) (expectedSum - actualSum);
    }

    public static void main(String[] args) {
        System.out.println(new MissingInteger().solution(new int[]{2, 3, 1, 5}));
    }
}