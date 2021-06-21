package com.algos.arraysandstrings;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(new int[]{1, 2, 3, 4, 5})));
    }

    private static int[] reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int other = array.length - 1 - i;
            int temp = array[i];
            array[i] = array[other];
            array[other] = temp;
        }
        return array;
    }

}
