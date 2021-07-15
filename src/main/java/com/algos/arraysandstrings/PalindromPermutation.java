package com.algos.arraysandstrings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Check is a string is a permutation of a palindrome
 */
public class PalindromPermutation {

    public static void main(String[] args) {
        System.out.println(isPalindrome("abb"));
        System.out.println(isPermutationOfPalindrome("abbc"));
    }

    /**
     * Every symbol is repeated x2, x4
     * Only one symbol can be repeated x1, x3, x5 times (middle element)
     *
     */
    private static boolean isPalindrome(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            map.putIfAbsent(c, 0);
            map.put(c, map.get(c) + 1);
        }

        boolean oddTwice = false;

        Set<Character> set = map.keySet();
        for (Character cc : set) {
            if (map.get(cc) % 2 != 0) {
                if (oddTwice) {
                    return false;
                }
                oddTwice = true;
            }
        }
        return true;
    }

    private static boolean isPermutationOfPalindrome(String phrase) {
        int countOdd = 0;
        int[] table = new int[256];
        for (char c : phrase.toCharArray()) {
            int x = c;
            if (x != -1) {
            table[x]++;
            if (table[x] % 2 == 1) {
                countOdd++;
            } else {
                countOdd--;
            }
        }
    }
    return countOdd <= 1;
    }
}
