package com.algos.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer x, return true if x is palindrome integer.
 * An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1123443211));
    }

    public static boolean isPalindrome(int num) {
        if (num < 0) return false;
        List<Integer> list = new ArrayList<>();

        int rem = 0;
        while (num != 0) {
            rem = num % 10;
            num /= 10;
            list.add(rem);
        }

        int lastIndex = list.size() - 1;
        for (int i = 0; i < list.size() / 2; i++) {
            int a = list.get(i);
            int b = list.get(lastIndex - i);
            if (a != b) {
                return false;
            }
        }
        return true;
    }

}
