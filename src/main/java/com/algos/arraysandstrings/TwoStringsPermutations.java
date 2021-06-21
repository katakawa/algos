package com.algos.arraysandstrings;

/**
 * Given two strings, write a method to decide if one is a permutation of the other
 */
public class TwoStringsPermutations {

    public static void main(String[] args) {
        System.out.println(oneStringIsPermutationOfAnother("abc", "abc"));
        System.out.println(oneStringIsPermutationOfAnother("abc", "abe"));
    }

    private static boolean oneStringIsPermutationOfAnother(String firstString, String secondString) {
        if (firstString.length() != secondString.length()) {
            return false;
        }

        int[] chars = new int[128];

        for (int i = 0; i < firstString.length(); i++) {
            char c = firstString.charAt(i);
            chars[c]++;
        }

        for (int i = 0; i < secondString.length(); i++) {
            char c = secondString.charAt(i);
            chars[c]--;

            if (chars[c] < 0) {
                return false;
            }
        }

        return true;
    }
}
