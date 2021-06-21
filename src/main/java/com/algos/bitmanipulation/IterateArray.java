package com.algos.bitmanipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IterateArray {

    public static void main(String[] args) {

        int a = 0b1011001;
        System.out.println(intIntoBits(a));
        List<Integer> list = intIntoBitsSquences(a);
        System.out.println(list);
        //System.out.println(findTheLongestSequence(a));
        //System.out.println(findTheLongestSequence(list));

//        System.out.println(0b0001);
//        int[] arr = {1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1};
//
//        List<Integer> list = new ArrayList<>();
//        int count = 0;
//        int searchingFor = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            int i1 = arr[i];
//        }
    }

    static List<Integer> intIntoBits(int n) {

        List<Integer> list = new ArrayList<>();

        for (int i = n; i != 0; i /= 2) {
            int bit = n % 2;
            list.add(bit);
            n >>>= 1;
        }
        Collections.reverse(list);
        return list;
    }

    static List<Integer> intIntoBitsSquences(int n) {

        List<Integer> list = new ArrayList<>();

        int count = 0;
        int searchFor = 0;

        for (int i = 0; i < Integer.BYTES * 8; i++) {
            int bit = n & 1;
            n >>>= 1;

            if (bit != searchFor) {
                list.add(count);
                count = 0;
                searchFor = searchFor == 0 ? 1 : 0;
            }
            count++;

            if (i == Integer.BYTES * 8 - 1) list.add(count);
        }

        //Collections.reverse(list);
        return list;
    }

    static int findTheLongestSequence(List<Integer> list) {
        //we start with zeros
        //we remove 0s
        //next seq is ones
        list.remove(0);
        System.out.println(list);

        int max = 0;

        for (int i = 0; i < list.size() - 2; i = i + 2) {
            int a = list.get(i);                                                                    
            int b = 0;
            if (list.get(i + 1) == 1) b = list.get(i + 2);
            max = Math.max(max, a + b);
        }
        max++;

        return max;
    }

}
