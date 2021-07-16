package com.algos.arraysandstrings;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abfabccbalsfo"));
    }

    public static String longestPalindrome(String input) {
        if (input == null || input.length() < 1) return "";

        int start = 0;
        int end = 0;

        for (int i = 0; i < input.length(); i++) {
            int len1 = expandAroundCenter(input, i, i);
            int len2 = expandAroundCenter(input, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return input.substring(start, end + 1);
    }

    private static int expandAroundCenter(String input, int left, int right) {
        int L = left;
        int R = right;

        while (L >= 0 && R < input.length()
                && input.charAt(L) == input.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

}
