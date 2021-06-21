package com.algos.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] str = new String[] { "abcd", "abc"};
        Arrays.sort(str);
        for (int i = 0; i < str.length; i++) {
            //System.out.println(str[i]);
        }

        //String[] comp = new String[] { "flower", "flow", "flight" };
        String[] comp = new String[] { "aa", "bc", "abc" };
        System.out.println(longestCommonPrefix(comp));

    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

}
