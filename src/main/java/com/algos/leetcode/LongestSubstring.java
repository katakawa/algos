package com.algos.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public static void main(String[] args) {
        String a = "dvdf";
        String b = " ";
        //int res = lengthOfLongestSubstring(a);
        int res2 = lengthOfLongestSubstring(a);
        System.out.println(res2);

    }

    public static int lengthOfLongestSubstring1(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            if (!set.contains(symbol)) {
                set.add(symbol);
            } else {
                set.clear();
                set.add(symbol);
                max = Math.max(count, max);
                count = 0;
                if (s.charAt(i - 1) != symbol) {
                    set.add(s.charAt(i - 1));
                    count++;
                }
            }
            count++;
            if (i == s.length() - 1) max = Math.max(count, max);
        }
        return max;
    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int max = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            if (!map.containsKey(symbol)) {
                map.put(symbol, i);
                count++;
            } else {
                max = Math.max(count, max);
                int oldIndex = map.get(symbol) + 1;
                if (oldIndex != 0) {
                    i = oldIndex - 1;
                } else {
                    i = 0;
                }
                map.clear();
                count = 0;
            }
            if (i == s.length() - 1) max = Math.max(count, max);
        }
        return max;
    }
}
