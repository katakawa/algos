package com.algos.bitmanipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FlipBitToWin {

    public static void main(String[] args) {
        int n = 209;
        System.out.println(convertToBits(n));
        System.out.println(convertToBitsN(n));
        //System.out.println(getLongestSequenceOfOnes(n));
        //System.out.println(Integer.BYTES);

    }

    /**
     * Get a list of bits
     * Count sequences of 1's
     * Count sequences of 1's if 1 bit is flipped
     *
     * @param num
     * @return
     */
    private static int getLongestSequenceOfOnes(int num) {
        List<Integer> bits = convertToBits(num);
        List<Integer> sequencesOf1s = new ArrayList<>();

        int count = 0;
        for (int i = 0; i < bits.size(); i++) {
            if (bits.get(i) == 1) {
                count++;
                if (i == bits.size() - 1) sequencesOf1s.add(count);
            } else {
                if (count > 0) {
                    sequencesOf1s.add(count);
                }
                count = 0;
                sequencesOf1s.add(count);
            }
        }

        int max = 0;
        boolean wasFlipped = false;
        for (int i = 0; i < sequencesOf1s.size() - 2; i++) {

            int res = 0;
            int a = sequencesOf1s.get(i);
            int b = sequencesOf1s.get(i + 2);

            if (a != 0 && b != 0) wasFlipped = true;

            res = a + b;
            if (res > max) {
                max = res;
            }
        }
        max++;

        return max;

    }

    private static List<Integer> convertToBits(int num) {
        List<Integer> list = new ArrayList<>();

        for (int i = num; i > 0; i = i / 2) {
            int rem = i % 2;
            list.add(rem == 0 ? 0 : 1);
        }

        Collections.reverse(list);

        return list;
    }

    private static List<Integer> convertToBitsN(int num) {
        List<Integer> list = new ArrayList<>();

        for (int i = num; i > 0; i = i / 2) {
            list.add(i % 2);
        }

        Collections.reverse(list);

        return list;
    }

}
