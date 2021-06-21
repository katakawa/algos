package com.algos.bitmanipulation;

import java.util.ArrayList;
import java.util.List;

public class TransformArrayOfBitsIntoListOfNumbers {

    public static void main(String[] args) {
        List res = parse(new char[] {'1', '0', '1', ' ', '1', '1'});
        System.out.println(res);
    }

    private static List parse(char[] arr) {
        int temp = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                result.add(temp);
                temp = 0;
                continue;
            }
            if (temp == 0) {
                temp = 1;
                continue;
            }
            temp <<= 1;
            if (arr[i] == '1') {
                temp |= 1;
            }

            if (i == arr.length -1) {
                result.add(temp);
            }
        }
        return result;
    }
}
