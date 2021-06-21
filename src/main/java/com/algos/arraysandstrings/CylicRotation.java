package com.algos.arraysandstrings;

import java.util.Arrays;

/**
 * Shift all the elements to the left or right
 */
public class CylicRotation {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotate(new int[] {1, 2, 3, 4, 5}, 1)));
    }

    /**
     *
     * @param arr shift each element by num positions
     * @param num
     * @return
     */
    private static int[] rotate(int[] arr, int num) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[(i + num) % arr.length] = arr[i];
        }
        return newArr;
    }

}
